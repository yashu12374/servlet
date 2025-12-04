package com.xworkz.movieapp.constants;

public enum DBConstants {

    URL("jdbc:mysql://localhost:3306/movie"),
    USERNAME("root"),
    SECRET("yashu@123");

    private String pro;

    DBConstants(String pro){
        this.pro=pro;
    }

    public String getPro(){
        return pro;
    }
}
