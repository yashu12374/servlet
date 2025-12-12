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
@WebServlet(urlPatterns = "/search",loadOnStartup = 1)
public class SearchServlet extends HttpServlet {

    private VoterService voterService = new VoterServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            String submit = req.getParameter("submitType");

            if ("Clear".equalsIgnoreCase(submit)) {
                req.setAttribute("dto", null);
                req.getRequestDispatcher("VoterSearch.jsp").forward(req, resp);
                return;
            }

            String voterName = req.getParameter("voterName");
            System.out.println("voterName : " + voterName);

            SearchDTO searchDTO = new SearchDTO();

            Optional<VoterDTO> optionalVoterDTO = this.voterService.findByVoterName(searchDTO);

            if (optionalVoterDTO.isPresent()) {
                req.setAttribute("dto", optionalVoterDTO.get());
            } else {
                req.setAttribute("errorMessage", "Voter not found!");
            }
            req.getRequestDispatcher("VoterSearch.jsp").forward(req, resp);
        }
    }

