package com.xworkz.servletapp;

import DTO.CoffeeLandDTO;
import service.CoffeeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/land",loadOnStartup = 1)
public class CoffeeLandServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         String size = req.getParameter("size");
         String plants = req.getParameter("plants");
         String yield = req.getParameter("yield");
         String expense =req.getParameter("expense");
         String profit = req.getParameter("profit");
         String fertilizer = req.getParameter("fertilizer");

         req.setAttribute("size",size);
         req.setAttribute("plants",plants);
         req.setAttribute("yield",yield);
         req.setAttribute("expense",expense);
         req.setAttribute("profit",profit);
         req.setAttribute("fertilizer",fertilizer);

         CoffeeLandDTO coffeeLandDTO = new CoffeeLandDTO(size,plants,yield,expense,profit,fertilizer);
         System.out.println("CoffeeLandDto-->"+coffeeLandDTO);

         CoffeeServiceImpl coffeeService = new CoffeeServiceImpl();
         //coffeeService.validateAndSave(coffeeLandDTO);

         req.getRequestDispatcher("CoffeeLandResult.jsp").forward(req,resp);

    }
}
