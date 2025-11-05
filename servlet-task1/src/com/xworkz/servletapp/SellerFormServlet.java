package com.xworkz.servletapp;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/seller",loadOnStartup = 1)
public class SellerFormServlet extends GenericServlet {

    public SellerFormServlet(){
        System.out.println("Create Seller servlet...");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service seller servlet...");
        String clientname = servletRequest.getParameter("clientname");
        String additionname = servletRequest.getParameter("additionname");
        String address = servletRequest.getParameter("address");
        String email = servletRequest.getParameter("email");
        String phoneno = servletRequest.getParameter("phoneno");
        String listingaddress = servletRequest.getParameter("listingaddress");
        String bedrooms = servletRequest.getParameter("bedrooms");
        String bathrooms = servletRequest.getParameter("bathrooms");
        String hoa = servletRequest.getParameter("hoa");
        String features = servletRequest.getParameter("features");
        String price = servletRequest.getParameter("price");

        System.out.println(clientname);
        System.out.println(additionname);
        System.out.println(address);
        System.out.println(email);
        System.out.println(phoneno);
        System.out.println(listingaddress);
        System.out.println(bedrooms);
        System.out.println(bathrooms);
        System.out.println(hoa);
        System.out.println(features);
        System.out.println(price);
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }
}
