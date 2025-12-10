package com.xworkz.voterapp.DTO;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Objects;

@Getter @Setter @ToString @EqualsAndHashCode
public class VoterDTO implements Serializable,Comparable {

    private String voterName;
    private String fatherName;
    private int age;
    private String gender;
    private String address;

    public VoterDTO(String voterName,String fatherName,int age,String gender,String address){
        this.voterName = voterName;
        this.fatherName = fatherName;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        VoterDTO voterDTO = (VoterDTO) o;
        return age == voterDTO.age && Objects.equals(voterName, voterDTO.voterName) && Objects.equals(fatherName, voterDTO.fatherName) && Objects.equals(gender, voterDTO.gender) && Objects.equals(address, voterDTO.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(voterName, fatherName, age, gender, address);
    }

    @Override
    public String toString() {
        return "VoterDTO{" +
                "voterName='" + voterName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
