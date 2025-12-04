package com.xworkz.movieapp.service;

import com.xworkz.movieapp.DTO.MovieDTO;
import com.xworkz.movieapp.exception.DataInValidException;

public interface MovieService {

    void validateAndSave(MovieDTO movieDTO)throws DataInValidException;
}
