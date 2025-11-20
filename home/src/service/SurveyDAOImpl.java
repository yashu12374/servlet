package service;

import com.xworkz.servletapp.dao.SurveyDAO;
import dto.SurveyDto;

public class SurveyDAOImpl implements SurveyDAO {

    public SurveyDAOImpl(){
        System.out.println("Impl object created");
    }
    @Override
    public boolean save(SurveyDto surveyDto) {
        return true;
    }
}
