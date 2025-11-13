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

@WebServlet(urlPatterns = "/blood",loadOnStartup = 1)

public class BloodBookingServlet extends HttpServlet {

    public BloodBookingServlet(){
        System.out.println("Create Blood Servlet...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String patientName = req.getParameter("patientName");
        String age = req.getParameter("age");
        String bloodGroup = req.getParameter("bloodGroup");
        String hospitalName = req.getParameter("hospitalName");
        String location = req.getParameter("location");
        String contactNumber = req.getParameter("contactNumber");

        Cookie[] cookies = req.getCookies();
        if(cookies == null || cookies.length<1){
            throw new IllegalArgumentException("cookie is there go to index page and create cookie");
        }else {
            for (Cookie cookie:cookies){
                System.out.println("time name of the cookie is "+cookie.getName()+"the value of cookie is"+cookie.getValue());
            }
        }

        System.out.println(patientName);
        System.out.println(age);
        System.out.println(bloodGroup);
        System.out.println(hospitalName);
        System.out.println(location);
        System.out.println(contactNumber);

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h2 style='color:green'>Blood is Booking Successfully</h2>");
        writer.println("<pre>");
        writer.println("Patient Name:"+patientName);
        writer.println("Age :"+age);
        writer.println("Blood group:"+bloodGroup);
        writer.println("Location:"+location);
        writer.println("Contact number:"+contactNumber);
        writer.println("</pre>");
        writer.println("</body>");
        writer.println("</html>");

    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }
}
