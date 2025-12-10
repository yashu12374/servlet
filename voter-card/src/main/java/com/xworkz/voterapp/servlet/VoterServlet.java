package com.xworkz.voterapp.servlet;

import com.xworkz.voterapp.DTO.VoterDTO;
import com.xworkz.voterapp.exception.DataDuplicationException;
import com.xworkz.voterapp.exception.DataInValidException;
import com.xworkz.voterapp.service.VoterService;
import com.xworkz.voterapp.service.VoterServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/voter",loadOnStartup = 1)
public class VoterServlet extends HttpServlet {

    public VoterServlet(){
        System.out.println("Create Voter servlet....");
    }

    private VoterService voterService = new VoterServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running voter server servlet....");

        String voterName = req.getParameter("voterName");
        String fatherName = req.getParameter("fatherName");
        String age = req.getParameter("age");
        String gender = req.getParameter("gender");
        String address = req.getParameter("address");

        try {
            VoterDTO voterDTO = new VoterDTO(voterName, fatherName, Integer.parseInt(age), gender, address);
            voterService.validateAndSave(voterDTO);
            req.setAttribute("voterName", voterName);
            req.setAttribute("fatherName", fatherName);
            req.setAttribute("age", age);
            req.setAttribute("gender", gender);
            req.setAttribute("address", address);

            req.getRequestDispatcher("VoterFormResult.jsp").forward(req, resp);
            req.setAttribute("Success Message", "Data is saved successfully");
        } catch (DataInValidException | DataDuplicationException e) {
            req.setAttribute("error message", "Data is not saved successfully");
            e.printStackTrace();
        }
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("VoterForm.jsp").forward(req,resp);
    }
}
