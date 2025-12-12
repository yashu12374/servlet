package com.xworkz.voterapp.servlet;

import com.xworkz.voterapp.DTO.SearchDTO;
import com.xworkz.voterapp.DTO.VoterDTO;
import com.xworkz.voterapp.exception.DataInValidException;
import com.xworkz.voterapp.service.VoterService;
import com.xworkz.voterapp.service.VoterServiceImpl;
import com.xworkz.voterapp.util.NumberValidation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns = "/edit", loadOnStartup = 1)
public class VoterUpdateServlet extends HttpServlet {

    private VoterService voterService = new VoterServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Processing doPost in VoterUpdateServlet...");

        String voterName = req.getParameter("voterName");
        String fatherName = req.getParameter("fatherName");
        String age = req.getParameter("age");
        String gender = req.getParameter("gender");
        String address = req.getParameter("address");

        VoterDTO voterDTO = new VoterDTO();
        voterDTO.setVoterName(voterName);
        voterDTO.setFatherName(fatherName);
        voterDTO.setAge(NumberValidation.parseIntSafe(age));
        voterDTO.setGender(gender);
        voterDTO.setAddress(address);

        try {
            boolean updated = this.voterService.validAndUpdate(voterDTO);
            if (updated) {
                req.setAttribute("dto", voterDTO);
                req.getRequestDispatcher("VoterFormResult.jsp").forward(req, resp);
                return;
            } else {
                req.setAttribute("message", "Update failed");
                req.getRequestDispatcher("VoterUpdate.jsp").forward(req, resp);
                return;
            }
        } catch (DataInValidException e) {
            req.setAttribute("message", "Invalid data: " + e.getMessage());
            req.setAttribute("editDTO", voterDTO);
            req.getRequestDispatcher("VoterUpdate.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running doGet in VoterUpdateServlet..");

        String voterName = req.getParameter("voterName");

        if (voterName == null || voterName.trim().isEmpty()) {
            req.setAttribute("message", "Voter name is missing!");
            req.getRequestDispatcher("VoterForm.jsp").forward(req, resp);
            return;
        }

        SearchDTO searchDTO = new SearchDTO();
        searchDTO.setVoterName(voterName.trim());

        Optional<VoterDTO> optionalVoterDTO = voterService.findByVoterName(searchDTO);

        if (optionalVoterDTO.isPresent()) {
            req.setAttribute("editDTO", optionalVoterDTO.get());
            req.getRequestDispatcher("VoterUpdate.jsp").forward(req, resp);
        } else {
            req.setAttribute("message", "No voter found with name: " + voterName);
            req.getRequestDispatcher("VoterForm.jsp").forward(req, resp);
        }
    }
}
