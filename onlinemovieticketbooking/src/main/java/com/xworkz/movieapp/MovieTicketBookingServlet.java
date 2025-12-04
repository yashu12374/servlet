package com.xworkz.movieapp;

import com.xworkz.movieapp.DTO.MovieDTO;
import com.xworkz.movieapp.exception.DataInValidException;
import com.xworkz.movieapp.service.MovieService;
import com.xworkz.movieapp.service.MovieServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/movie",loadOnStartup = 1)
public class MovieTicketBookingServlet extends HttpServlet {

    private MovieService movieService = new MovieServiceImpl();

    public MovieTicketBookingServlet(){
        System.out.println("Create Movie Ticket Servlet....");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String ticket_id = req.getParameter("ticket_id");
        String theatre_name = req.getParameter("theatre_name");
        String movie_name = req.getParameter("movie_name");
        String showTime = req.getParameter("showTime");
        String number_of_ticket = req.getParameter("number_of_ticket");
        String price = req.getParameter("price");

        try {
            MovieDTO movieDTO = new MovieDTO(Integer.parseInt(ticket_id),theatre_name,movie_name,showTime,Integer.parseInt(number_of_ticket),Double.parseDouble(price));
            movieService.validateAndSave(movieDTO);
            req.setAttribute("ticket_id", ticket_id);
            req.setAttribute("theatre_name", theatre_name);
            req.setAttribute("movie_name", movie_name);
            req.setAttribute("showTime", showTime);
            req.setAttribute("number_of_ticket", number_of_ticket);
            req.setAttribute("price", price);

            req.getRequestDispatcher("MovieResult.jsp").forward(req, resp);
            req.setAttribute("Success Message","Data is saved successfully");
        }catch (DataInValidException e){
            req.setAttribute("error message","Data is not saved successfully");
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("MovieTicketBooking.jsp").forward(req,resp);
    }
}
