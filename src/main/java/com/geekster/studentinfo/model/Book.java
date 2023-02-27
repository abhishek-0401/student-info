package com.geekster.studentinfo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tbl_book")
public class Book {
    @Id
    private Integer ID;
    private String title;
    private String author;
    private String description;
    private String price;
    @ManyToOne
    @JoinColumn
    private Student student;
}
