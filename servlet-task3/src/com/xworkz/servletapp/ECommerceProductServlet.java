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

@WebServlet(urlPatterns = "/product",loadOnStartup = 1)
public class ECommerceProductServlet extends HttpServlet {

   public ECommerceProductServlet(){
        System.out.println("Create ECommerceProduct servlet..");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String productId = req.getParameter("productId");
        String productname = req.getParameter("productname");
        String producttype = req.getParameter("producttype");
        String brand = req.getParameter("brand");
        String price = req.getParameter("price");
        String quantity = req.getParameter("quantity");

        Cookie[] cookies = req.getCookies();
        if(cookies == null || cookies.length<1){
            throw new IllegalArgumentException("cookie is there go to index page and create cookie");
        }else {
            for (Cookie cookie:cookies){
                System.out.println("time name of the cookie is "+cookie.getName()+"the value of cookie is"+cookie.getValue());
            }
        }

        System.out.println(productId);
        System.out.println(productname);
        System.out.println(producttype);
        System.out.println(brand);
        System.out.println(price);
        System.out.println(quantity);

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h1 style='color:blue'>This Product is Add to Cart</h1>");
        writer.println("<pre>");
        writer.println("Product ID :"+productId);
        writer.println("Product Name :"+productname);
        writer.println("Product Type :"+producttype);
        writer.println("Product Brand :"+brand);
        writer.println("Product price :"+price);
        writer.println("Product quantity :"+quantity);
        writer.println("</pre>");
        writer.println("</body>");
        writer.println("</html>");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }
}
