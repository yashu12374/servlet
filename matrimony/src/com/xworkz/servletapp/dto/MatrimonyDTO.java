package com.xworkz.servletapp.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;
@Getter @Setter
public class MatrimonyDTO {

    private String email;
    private String gender;
    private String forType;
    private String dob;
    private String motherTongue;
    private String religion;
    private String status;
    private int height;

    public MatrimonyDTO(String email, String gender, String forType, String dob, String motherTongue, String religion, String status, int height){
        this.email=email;
        this.gender=gender;
        this.forType=forType;
        this.dob=dob;
        this.motherTongue=motherTongue;
        this.religion=religion;
        this.status=status;
        this.height=height;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MatrimonyDTO that = (MatrimonyDTO) o;
        return height == that.height && Objects.equals(email, that.email) && Objects.equals(gender, that.gender) && Objects.equals(forType, that.forType) && Objects.equals(dob, that.dob) && Objects.equals(motherTongue, that.motherTongue) && Objects.equals(religion, that.religion) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, gender, forType, dob, motherTongue, religion, status, height);
    }

    @Override
    public String toString() {
        return "MatrimonyDTO{" +
                "email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", forType='" + forType + '\'' +
                ", dob='" + dob + '\'' +
                ", motherTongue='" + motherTongue + '\'' +
                ", religion='" + religion + '\'' +
                ", status='" + status + '\'' +
                ", height=" + height +
                '}';
    }

}
