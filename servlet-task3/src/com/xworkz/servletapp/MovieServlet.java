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
@WebServlet(urlPatterns = "/movie",loadOnStartup = 1)

public class MovieServlet extends HttpServlet {

    public MovieServlet(){
        System.out.println("Create Movie servlet....");
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    String moviename = req.getParameter("moviename");
        String theatrename = req.getParameter("theatrename");
        String location = req.getParameter("location");
        String numberofticket = req.getParameter("numberofticket");
        String price = req.getParameter("price");
        String time = req.getParameter("time");
        String seattype = req.getParameter("seattype");

        Cookie[] cookies = req.getCookies();
        if(cookies == null || cookies.length<1){
            throw new IllegalArgumentException("cookie is there go to index page and create cookie");
     }
        else {
            for (Cookie cookie:cookies){
                System.out.println("time name of the cookie is "+cookie.getName()+"the value of cookie is"+cookie.getValue());
            }
        }
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
        writer.println("<head><link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB\" crossorigin=\"anonymous\">");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h2 class=\"text-center text-primary\">Ticket is Booking Successfully</h2>");
        writer.println("<div class=\"container mt-4\">");
        writer.println("<div class=\"card shadow-lg p-4 rounded-4 w-50 mx-auto\">");
        writer.println("<p><b>Movie Name :</b> " + moviename + "</p>");
        writer.println("<p><b>Theatre Name :</b> " + theatrename + "</p>");
        writer.println("<p><b>Location :</b> " + location + "</p>");
        writer.println("<p><b>Number of Tickets :</b> " + numberofticket + "</p>");
        writer.println("<p><b>Price :</b> " + price + "</p>");
        writer.println("<p><b>Time :</b> " + time + "</p>");
        writer.println("<p><b>Seat Type :</b> " + seattype + "</p>");
        writer.println("</div>");
        writer.println("</div>");
        writer.println("</body>");
        writer.println("</html>");

    }


    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }
}
