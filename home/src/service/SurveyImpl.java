package service;

import dto.SurveyDto;
import impl.SurveyService;
import com.xworkz.servletapp.exception.DataInValidException;

public class SurveyImpl implements SurveyService {
    @Override
    public void surveyValidate(SurveyDto surveyDto) throws DataInValidException {
        System.out.println("Running Survey service..");
        System.out.println("surveyDto in service:" + surveyDto);

        if (surveyDto != null) {
            String name = surveyDto.getName();
            int age = surveyDto.getAge();
            long adharno = surveyDto.getAdharno();
            boolean valid = false;
            if (name != null && name.length() >= 3) {
                System.out.println("Valid name");
            }
            if (age > 0 && age < 100) {
                System.out.println("Valid age");
                valid = true;
            }
            if (adharno > 0 && adharno < 12) {
                System.out.println("Valid adharno");
                valid = true;
            }
            if (valid) {
                System.out.println(surveyDto);
            } else {
                throw new DataInValidException();
            }

        }
    }
}
