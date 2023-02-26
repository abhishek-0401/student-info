package com.geekster.studentinfo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tbl_course")
public class Course {
    @Id
    private int ID;
    private String title;
    private String description;
    private String duration;
    @ManyToMany
    @JoinColumn
    List<Student> studentList = new ArrayList<>();
}

