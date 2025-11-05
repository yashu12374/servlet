package com.xworkz.servletapp;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/education",loadOnStartup = 1)
public class EducationServlet extends GenericServlet {
    public EducationServlet(){
        System.out.println("Create Education servlet");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service education servlet...");
        String studentname = servletRequest.getParameter("studentname");
        String schoolname = servletRequest.getParameter("schoolname");
        String yearofpassout = servletRequest.getParameter("yearofpassout");
        String percetage = servletRequest.getParameter("percetage");
        String studentname1 = servletRequest.getParameter("studentname1");
        String collegename1 = servletRequest.getParameter("collegename1");
        String yearofpassout1 = servletRequest.getParameter("yearofpassout1");
        String percetage1 = servletRequest.getParameter("percetage1");
        String studentname2 = servletRequest.getParameter("studentname2");
        String collegename2 = servletRequest.getParameter("collegename2");
        String yearofpassout2 = servletRequest.getParameter("yearofpassout2");
        String percetage2 = servletRequest.getParameter("percetage2");
        String stream = servletRequest.getParameter("stream");
        String studentname3 = servletRequest.getParameter("studentname3");
        String collegename3 = servletRequest.getParameter("collegename3");
        String yearofpassout3 = servletRequest.getParameter("yearofpassout3");
        String percetage3 = servletRequest.getParameter("percetage3");

        System.out.println(studentname);
        System.out.println(schoolname);
        System.out.println(yearofpassout);
        System.out.println(percetage);
        System.out.println(studentname1);
        System.out.println(collegename1);
        System.out.println(yearofpassout1);
        System.out.println(percetage1);
        System.out.println(studentname2);
        System.out.println(collegename2);
        System.out.println(yearofpassout2);
        System.out.println(percetage2);
        System.out.println(stream);
        System.out.println(studentname3);
        System.out.println(collegename3);
        System.out.println(yearofpassout3);
        System.out.println(percetage3);
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }
}
