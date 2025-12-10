package com.xworkz.voterapp.servlet;

import com.xworkz.voterapp.DTO.SearchDTO;
import com.xworkz.voterapp.DTO.VoterDTO;
import com.xworkz.voterapp.service.VoterService;
import com.xworkz.voterapp.service.VoterServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;
@WebServlet(urlPatterns = "/edit",loadOnStartup = 1)
public class VoterUpdateServlet extends HttpServlet {

    private VoterService voterService = new VoterServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running doGet in voterUpdateServlet..");
        System.out.println("forwarding to VoterForm.jsp");

        String voterName = req.getParameter("voterName");
        SearchDTO searchDTO = new SearchDTO(voterName);
        Optional<VoterDTO> optionalVoterDTO = voterService.findByVoterName(searchDTO);
        req.setAttribute("editDTO",optionalVoterDTO.get());
        req.getRequestDispatcher("VoterUpdate.jsp").forward(req,resp);
    }
}
