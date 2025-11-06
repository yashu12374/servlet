package com.xworkz.servletapp;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/buyer",loadOnStartup = 1)
public class BuyerFormServlet extends GenericServlet {

    public BuyerFormServlet(){
        System.out.println("Create Buyer Servlet...");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running Service Buyer Servlet....");
        String name = servletRequest.getParameter("name");
        String address = servletRequest.getParameter("address");
        String email = servletRequest.getParameter("email");
        String phoneNo = servletRequest.getParameter("phoneNo");
        String reason = servletRequest.getParameter("reason");
        String buyer = servletRequest.getParameter("buyer");
        String sell = servletRequest.getParameter("sell");
        String approved = servletRequest.getParameter("approved");
        String lendername = servletRequest.getParameter("lendername");
        String pricerange = servletRequest.getParameter("pricerange");

        System.out.println(name);
        System.out.println(address);
        System.out.println(email);
        System.out.println(phoneNo);
        System.out.println(reason);
        System.out.println(buyer);
        System.out.println(sell);
        System.out.println(approved);
        System.out.println(lendername);
        System.out.println(pricerange);

        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();
        writer.println("Data saved successfully....," +name+ " : " +address+ " : " +email+ " : " +phoneNo+ " : "
                +reason+ " : " +buyer+ " : " +sell+ " : " +approved+ " : " +lendername+ " : " +pricerange);
    }
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

}
