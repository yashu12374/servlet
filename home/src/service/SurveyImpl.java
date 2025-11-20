package service;

import com.xworkz.servletapp.dao.SurveyDAO;
import dto.SurveyDto;
import impl.SurveyService;
import com.xworkz.servletapp.exception.DataInValidException;

public class SurveyImpl implements SurveyService {

    private SurveyDAO surveyDAO = new SurveyDAOImpl();
    @Override
    public void surveyValidate(SurveyDto surveyDto) throws DataInValidException {
        System.out.println("Running Survey service..");
        System.out.println("surveyDto in service:" + surveyDto);

        if (surveyDto == null) {
            throw new DataInValidException();
        }

        boolean valid = true;

        String name = surveyDto.getName();
        String occupation = surveyDto.getOccupatation();
        int age = surveyDto.getAge();
        long adharno = surveyDto.getAdharno();

        // Validate Name
        if (name == null || name.length() < 3) {
            System.out.println("Invalid name");
            valid = false;
        } else {
            System.out.println("Valid name");
        }

        if (occupation == null || name.length() < 3) {
            System.out.println("Invalid name");
            valid = false;
        } else {
            System.out.println("Valid name");
        }

        // Validate Age
        if (age <= 0 || age >= 100) {
            System.out.println("Invalid age");
            valid = false;
        } else {
            System.out.println("Valid age");
        }

        // Validate Aadhaar (12-digit)
        if (adharno >= 100000000000L && adharno <= 999999999999L) {
            System.out.println("Valid Aadhaar");
        } else {
            System.out.println("Invalid Aadhaar");
            valid = false;
        }

        // If validation fails → throw exception
        if (!valid) {
            throw new DataInValidException();
        }

        boolean saved = surveyDAO.save(surveyDto);
        System.out.println("The data is valid and has been saved.." + saved);
    }
}
