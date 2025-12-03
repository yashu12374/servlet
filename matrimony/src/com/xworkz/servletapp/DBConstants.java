package com.xworkz.servletapp;

public enum DBConstants {

    URL("jdbc:mysql://localhost:3306/matrimony?useSSL=false"),
    USERNAME("root"),
    SECRET("yashu@123");

    private String prop;

    DBConstants(String prop) {
        this.prop = prop;
    }

    public String getProp() {
        return prop;
    }
}




