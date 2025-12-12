package com.xworkz.voterapp.DTO;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
@EqualsAndHashCode
public class SearchDTO {

    private String voterName;
    private String address;

    public SearchDTO() {
        this.voterName = voterName;
    }

}
