package com.xworkz.servletapp;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/flight",loadOnStartup = 1)
public class FlightTicketServlet extends HttpServlet {

    public FlightTicketServlet(){
        System.out.println("Create Flight servlet..");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String passengername = req.getParameter("passengername");
        String flightNumber = req.getParameter("flightNumber");
        String source = req.getParameter("source");
        String destination = req.getParameter("destination");
        String date = req.getParameter("date");
        String ticketPrice = req.getParameter("ticketPrice");

        Cookie[] cookies = req.getCookies();
        if(cookies == null || cookies.length<1){
            throw new IllegalArgumentException("cookie is there go to index page and create cookie");
        }else {
            for (Cookie cookie:cookies){
                System.out.println("time name of the cookie is "+cookie.getName()+"the value of cookie is"+cookie.getValue());
            }
        }

        System.out.println(passengername);
        System.out.println(flightNumber);
        System.out.println(source);
        System.out.println(destination);
        System.out.println(date);
        System.out.println(ticketPrice);

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<head><link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB\" crossorigin=\"anonymous\">");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h2 class=\"text-center text-primary\">Flight Ticket is Booking Successfully</h2>");
        writer.println("<div class=\"container mt-4\">");
        writer.println("<div class=\"card shadow-lg p-4 rounded-4 w-50 mx-auto\">");
        writer.println("<p><b> PassengerName :</b>" +passengername+ "</p>");
        writer.println("<p><b> FlightNumber : </b> "+flightNumber+ "</p>");
        writer.println("<p><b> Source : </b>"+source+ "</p>");
        writer.println("<p><b> Destination : </b>"+destination+ "</p>");
        writer.println("<p><b> Date : </b>"+date+ "</p>");
        writer.println("<p><b> TicketPrice : </b>"+ticketPrice+ "</p>");
        writer.println("</body>");
        writer.println("</html>");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }
}
