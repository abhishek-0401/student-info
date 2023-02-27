package com.geekster.studentinfo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tbl_laptop")
public class Laptop {
    @Id
    private Integer ID;
    private String name;
    private String brand;
    private Integer price;
    @OneToOne
    @JoinColumn
    private Student student;

}
