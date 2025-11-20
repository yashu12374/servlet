package com.xworkz.servletapp;

import com.xworkz.servletapp.exception.DataInValidException;
import dto.SurveyDto;
import impl.SurveyService;
import service.SurveyImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/survey",loadOnStartup = 1)
public class SurveyServlet extends HttpServlet {


    public SurveyServlet(){
        System.out.println("Create Survey servlet..");
    }
    private SurveyService surveyService = new SurveyImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String occupatation = req.getParameter("occupatation");
        String education = req.getParameter("education");
        String nativePlace = req.getParameter("nativePlace");
        String fathername = req.getParameter("fathername");
        String mothername = req.getParameter("mothername");
        String gender = req.getParameter("gender");
        String married = req.getParameter("married");
        String whname = req.getParameter("whname");
        String age = req.getParameter("age");
        String date = req.getParameter("date");
        String height = req.getParameter("height");
        String weight = req.getParameter("weight");
        String bloodGroup = req.getParameter("bloodGroup");
        String bikeNumber = req.getParameter("bikeNumber");
        String carNumber = req.getParameter("carNumber");
        String MobileNo = req.getParameter("MobileNo");
        String adharno = req.getParameter("adharno");
        String panCard = req.getParameter("panCard");
        String voterId = req.getParameter("voterId");
        String passPort = req.getParameter("passPort");
        String rationCard = req.getParameter("rationCard");
        String income = req.getParameter("income");
        String bankAccount = req.getParameter("bankAccount");
        String cycle = req.getParameter("cycle");
        String member = req.getParameter("member");
        String insurance = req.getParameter("insurance");
        String insuranceNo = req.getParameter("insuranceNo");
        String laptop = req.getParameter("laptop");
        String tv = req.getParameter("tv");
        String land = req.getParameter("land");
        String sites = req.getParameter("sites");
        String rtcNo = req.getParameter("rtcNo");
        String taxes = req.getParameter("taxes");
        String employee = req.getParameter("employee");
        String disabled = req.getParameter("disabled");
        String caste = req.getParameter("caste");
        String religion = req.getParameter("religion");
        String motherTongue = req.getParameter("motherTongue");
        String shoeSize = req.getParameter("shoeSize");
        String noOfShoes = req.getParameter("noOfShoes");
        String friendname = req.getParameter("friendname");
        String electricity = req.getParameter("electricity");
        String water = req.getParameter("water");
        String buildingOwerName = req.getParameter("buildingOwerName");
        String crop = req.getParameter("crop");
        String loanNo = req.getParameter("loanNo");
        String loanBalance = req.getParameter("loanBalance");
        String loanType = req.getParameter("loanType");
        String gold = req.getParameter("gold");
        String silver = req.getParameter("silver");
        String petName = req.getParameter("petName");
        String cows = req.getParameter("cows");
        String shareHolding = req.getParameter("shareHolding");



        SurveyDto surveyDto = new SurveyDto(name, occupatation, education, nativePlace, fathername, mothername, gender, married, whname,Integer.parseInt(age), date, height, weight, bloodGroup, bikeNumber, carNumber,
                MobileNo,Long.parseLong(adharno), panCard, voterId, passPort, rationCard, income, bankAccount, cycle, member, insurance, insuranceNo,
                laptop, tv, land, sites, rtcNo, taxes, employee, disabled, caste, religion, motherTongue, shoeSize, noOfShoes, friendname,
                electricity, water, buildingOwerName, crop, loanNo, loanBalance, loanType, gold, silver, petName, cows, shareHolding);


        try {
            surveyService.surveyValidate(surveyDto);
            req.setAttribute("name", name);
            req.setAttribute("occupatation", occupatation);
            req.setAttribute("education", education);
            req.setAttribute("nativePlace", nativePlace);
            req.setAttribute("fathername", fathername);
            req.setAttribute("mothername", mothername);
            req.setAttribute("gender", gender);
            req.setAttribute("married", married);
            req.setAttribute("whname", whname);
            req.setAttribute("age", age);
            req.setAttribute("date", date);
            req.setAttribute("height", height);
            req.setAttribute("weight", weight);
            req.setAttribute("bloodGroup", bloodGroup);
            req.setAttribute("bikeNumber", bikeNumber);
            req.setAttribute("carNumber", carNumber);
            req.setAttribute("MobileNo", MobileNo);
            req.setAttribute("adharno", adharno);
            req.setAttribute("panCard", panCard);
            req.setAttribute("voterId", voterId);
            req.setAttribute("passPort", passPort);
            req.setAttribute("rationCard", rationCard);
            req.setAttribute("income", income);
            req.setAttribute("bankAccount", bankAccount);
            req.setAttribute("cycle", cycle);
            req.setAttribute("member", member);
            req.setAttribute("insurance", insurance);
            req.setAttribute("insuranceNo", insuranceNo);
            req.setAttribute("laptop", laptop);
            req.setAttribute("Tv", tv);
            req.setAttribute("land", land);
            req.setAttribute("sites", sites);
            req.setAttribute("rtcNo", rtcNo);
            req.setAttribute("taxes", taxes);
            req.setAttribute("employee", employee);
            req.setAttribute("disabled", disabled);
            req.setAttribute("caste", caste);
            req.setAttribute("religion", religion);
            req.setAttribute("motherTongue", motherTongue);
            req.setAttribute("shoeSize", shoeSize);
            req.setAttribute("noOfShoes", noOfShoes);
            req.setAttribute("friendname", friendname);
            req.setAttribute("electricity", electricity);
            req.setAttribute("water", water);
            req.setAttribute("buildingOwerName", buildingOwerName);
            req.setAttribute("crop", crop);
            req.setAttribute("loanNo", loanNo);
            req.setAttribute("loanBalance", loanBalance);
            req.setAttribute("loanType", loanType);
            req.setAttribute("gold", gold);
            req.setAttribute("silver", silver);
            req.setAttribute("petName", petName);
            req.setAttribute("cows", cows);
            req.setAttribute("shareHolding", shareHolding);
            req.setAttribute("successMessage","Data is saved successfully");
        }catch (DataInValidException e){
            System.out.println("Data valid");

            System.err.println("Data Invalid");
            req.setAttribute("errorMessage","Data is not saved successfully");
        }
        req.getRequestDispatcher("SurveyResult.jsp").forward(req,resp);


    }
}
