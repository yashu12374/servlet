package com.xworkz.movieapp.service;

import com.xworkz.movieapp.DAO.MovieDAO;
import com.xworkz.movieapp.DAO.MovieDAOImpl;
import com.xworkz.movieapp.DTO.MovieDTO;
import com.xworkz.movieapp.exception.DataInValidException;

public class MovieServiceImpl implements MovieService {

    private MovieDAO movieDAO = new MovieDAOImpl();

    @Override
    public void validateAndSave(MovieDTO movieDTO) throws DataInValidException {
        boolean isInvalid = false;

        if (movieDTO.getTheatre_name() == null || movieDTO.getTheatre_name().isEmpty()) {
            System.err.println("Invalid theatre name");
            isInvalid = true;
        }
        if (movieDTO.getMovie_name() == null || movieDTO.getMovie_name().isEmpty()) {
            System.err.println("Invalid movie name");
            isInvalid = true;
        }
        if (movieDTO.getShowTime() == null || movieDTO.getShowTime().isEmpty()) {
            System.err.println("Invalid show time");
            isInvalid = true;
        }
        if (movieDTO.getNumber_of_ticket() <= 0) {
            System.err.println("Invalid number of tickets");
            isInvalid = true;
        }
        if (movieDTO.getPrice() <= 0) {
            System.err.println("Invalid ticket price");
            isInvalid = true;
        }

        if (isInvalid) {
            throw new DataInValidException();
        } else {
            movieDAO.save(movieDTO);
        }
    }
}
