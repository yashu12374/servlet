package com.xworkz.voterapp.Constants;

public enum DBConstants {

    URL("jdbc:mysql://localhost:3306/voter"),
    USERNAME("root"),
    PASSWORD("yashu@123");

    private String pro;

    DBConstants(String pro){
        this.pro = pro;
    }

    public String getPro() {
        return pro;
    }
}
