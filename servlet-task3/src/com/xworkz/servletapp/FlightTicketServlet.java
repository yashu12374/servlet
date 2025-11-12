package com.xworkz.servletapp;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String passengername = req.getParameter("passengername");
        String flightNumber = req.getParameter("flightNumber");
        String source = req.getParameter("source");
        String destination = req.getParameter("destination");
        String date = req.getParameter("date");
        String ticketPrice = req.getParameter("ticketPrice");

        System.out.println(passengername);
        System.out.println(flightNumber);
        System.out.println(source);
        System.out.println(destination);
        System.out.println(date);
        System.out.println(ticketPrice);

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h2 style='color:green'>Flight Ticket is Booking Successfully</h2>");
        writer.println("<pre>");
        writer.println("PassengerName :"+passengername);
        writer.println("FlightNumber : "+flightNumber);
        writer.println("Source : "+source);
        writer.println("Destination :"+destination);
        writer.println("Date :"+date);
        writer.println("TicketPrice :"+ticketPrice);
        writer.println("</pre>");
        writer.println("</body>");
        writer.println("</html>");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }
}
