package com.xworkz.servletapp;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/skill",loadOnStartup = 1)

public class SkillServlet extends GenericServlet {

    public SkillServlet(){
        System.out.println("Creating skill servlet..");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service skill servlet...");
        String name = servletRequest.getParameter("name");
        String email = servletRequest.getParameter("email");
        String primaryskill = servletRequest.getParameter("primaryskill");
        String secondaryskill = servletRequest.getParameter("secondaryskill");
        String database = servletRequest.getParameter("database");
        String idk = servletRequest.getParameter("idk");
        String ui = servletRequest.getParameter("ui");
        String technologies = servletRequest.getParameter("technologies");
        String exp = servletRequest.getParameter("exp");
        String frameworks = servletRequest.getParameter("frameworks");
        String otherskill = servletRequest.getParameter("otherskill");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }
}
