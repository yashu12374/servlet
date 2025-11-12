package com.xworkz.servletapp;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/movie",loadOnStartup = 1)

public class MovieServlet extends HttpServlet {

    public MovieServlet(){
        System.out.println("Create Movie servlet....");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String moviename = req.getParameter("moviename");
        String theatrename = req.getParameter("theatrename");
        String location = req.getParameter("location");
        String numberofticket = req.getParameter("numberofticket");
        String price = req.getParameter("price");
        String time = req.getParameter("time");
        String seattype = req.getParameter("seattype");

        System.out.println(moviename);
        System.out.println(theatrename);
        System.out.println(location);
        System.out.println(numberofticket);
        System.out.println(price);
        System.out.println(time);
        System.out.println(seattype);

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h2 style='color:green'>Ticket is Booking Successfully</h2>");
        writer.println("<pre>");
        writer.println("moviename : "+moviename);
        writer.println("theatrename : "+theatrename);
        writer.println("location : "+location);
        writer.println("numberofticket : "+numberofticket);
        writer.println("price : "+price);
        writer.println("time : "+time);
        writer.println("seattype : "+seattype);
        writer.println("</pre>");
        writer.println("</body>");
        writer.println("</html>");
    }


    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }
}
