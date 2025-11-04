package com.xworkz.servletapp;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/personal",loadOnStartup = 1)
public class PersonalServlet extends GenericServlet {

    public PersonalServlet(){
        System.out.println("Create personal information servlet");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service personal servlet..... ");
        String name = servletRequest.getParameter("name");
        String date = servletRequest.getParameter("date");
        String age = servletRequest.getParameter("age");
        String mobileNo = servletRequest.getParameter("mobile");
        String email = servletRequest.getParameter("email");
        String gender = servletRequest.getParameter("gender");
        String address = servletRequest.getParameter("address");
        String status = servletRequest.getParameter("status");

    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }
}
