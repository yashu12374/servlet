package com.xworkz.movieapp.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter @Setter
public class MovieDTO implements Comparable{

    private int ticket_id;
    private String theatre_name;
    private String movie_name;
    private String showTime;
    private int number_of_ticket;
    private double price;

    public MovieDTO(int ticket_id,String theatre_name,String movie_name,String showTime,int number_of_ticket,double price){
        this.ticket_id = ticket_id;
        this.theatre_name = theatre_name;
        this.movie_name = movie_name;
        this.showTime = showTime;
        this.number_of_ticket = number_of_ticket;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MovieDTO movieDTO = (MovieDTO) o;
        return ticket_id == movieDTO.ticket_id && number_of_ticket == movieDTO.number_of_ticket && Double.compare(price, movieDTO.price) == 0 && Objects.equals(theatre_name, movieDTO.theatre_name) && Objects.equals(movie_name, movieDTO.movie_name) && Objects.equals(showTime, movieDTO.showTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticket_id, theatre_name, movie_name, showTime, number_of_ticket, price);
    }

    @Override
    public String toString() {
        return "MovieDTO{" +
                "ticket_id=" + ticket_id +
                ", theatre_name='" + theatre_name + '\'' +
                ", movie_name='" + movie_name + '\'' +
                ", showTime='" + showTime + '\'' +
                ", number_of_ticket=" + number_of_ticket +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
