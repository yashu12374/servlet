package impl;

import dto.SurveyDto;
import com.xworkz.servletapp.exception.DataInValidException;

public interface SurveyService {

    void surveyValidate(SurveyDto surveyDto)throws DataInValidException;
}
