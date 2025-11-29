package com.xworkz.jdbcapp;

public enum DBConstant {

    URL("jdbc:mysql://localhost:3306/task" + "?useSSL=false"),
    USERNAME("root"),
    Secret("yashu@123");
    private String prop;

    DBConstant(String prop){

        this.prop=prop;
    }

    public String getProp() {
        return prop;
    }
}



