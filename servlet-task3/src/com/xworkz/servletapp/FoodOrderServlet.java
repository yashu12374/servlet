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

@WebServlet(urlPatterns = "/food",loadOnStartup = 1)

public class FoodOrderServlet extends HttpServlet {

    public FoodOrderServlet(){
        System.out.println("Create Food servlet..");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String customerName = req.getParameter("customerName");
        String  foodItem = req.getParameter("foodItem");
        String quantity = req.getParameter("quantity");
        String price = req.getParameter("price");
        String deliveryAddress = req.getParameter("deliveryAddress");
        String paymentmethod = req.getParameter("paymentmethod");

        Cookie[] cookies = req.getCookies();
        if (cookies == null || cookies.length<1){
            throw new IllegalArgumentException("cookie is there go to index page and create cookie");
        }else {
            for (Cookie cookie : cookies){
                System.out.println("time name of the cookie is "+cookie.getName()+"the value of cookie is"+cookie.getValue());
            }
        }

        System.out.println(customerName);
        System.out.println(foodItem);
        System.out.println(quantity);
        System.out.println(price);
        System.out.println(deliveryAddress);
        System.out.println(paymentmethod);

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h2 style='color:green'>Food is Order Successfully</h2>");
        writer.println("<pre>");
        writer.println("Customer Name :"+customerName);
        writer.println("Food Item :"+foodItem);
        writer.println("Quantity :"+quantity);
        writer.println("Price :"+price);
        writer.println("Delivery Address :"+deliveryAddress);
        writer.println("Payment Method :"+paymentmethod);
        writer.println("</pre>");
        writer.println("</body>");
        writer.println("</html>");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }
}
