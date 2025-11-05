package com.xworkz.servletapp;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/patient",loadOnStartup = 1)

public class PatientServlet extends GenericServlet {

    public PatientServlet(){
        System.out.println("Create patient servlet...");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service patient servlet.....");
        String firstName = servletRequest.getParameter("firstName");
        String lastName = servletRequest.getParameter("lastName");
        String age = servletRequest.getParameter("age");
        String gender = servletRequest.getParameter("gender");
        String status = servletRequest.getParameter("status");
        String contactNo = servletRequest.getParameter("contactNo");
        String email = servletRequest.getParameter("email");
        String disease = servletRequest.getParameter("disease");
        String bloodgroup = servletRequest.getParameter("bloodgroup");
        String date = servletRequest.getParameter("date");

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(status);
        System.out.println(contactNo);
        System.out.println(email);
        System.out.println(disease);
        System.out.println(bloodgroup);
        System.out.println(date);
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }
}
