package com.xworkz.servletapp;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/driving",loadOnStartup = 1)
public class DrivingLicenseServlet extends GenericServlet {

    public DrivingLicenseServlet(){
        System.out.println("Create Driving license...");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service Driving license servlet...");
        String name = servletRequest.getParameter("name");
        String relation = servletRequest.getParameter("relation");
        String address = servletRequest.getParameter("address");
        String date = servletRequest.getParameter("date");
        String education = servletRequest.getParameter("education");
        String bloodgroup = servletRequest.getParameter("bloodgroup");
        String issuedate = servletRequest.getParameter("issuedate");
        String licenceissued = servletRequest.getParameter("licenceissued");
        String authorized = servletRequest.getParameter("authorized");

        System.out.println(name);
        System.out.println(relation);
        System.out.println(address);
        System.out.println(date);
        System.out.println(education);
        System.out.println(bloodgroup);
        System.out.println(issuedate);
        System.out.println(licenceissued);
        System.out.println(authorized);

        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();
        writer.println("Data saved successfully...,"+ name +" : "+ relation +" : "+ address +" : "+ date +" : "+ education +" : "+ bloodgroup +" : " + issuedate + ":" + licenceissued + ":" + authorized);
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }
}
