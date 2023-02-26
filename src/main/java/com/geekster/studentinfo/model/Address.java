package com.geekster.studentinfo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Address {

    private String landmark;

    private String zipcode;
    private String state;
    private String country;
}
