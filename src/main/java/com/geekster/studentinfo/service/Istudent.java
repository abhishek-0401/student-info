package com.geekster.studentinfo.service;

import com.geekster.studentinfo.model.Student;

import java.util.List;

public interface Istudent {
    public List<Student> getStudent(int id);
    public void addStudent(Student student);
    public void deleteStudent(int id);
    public void updateStudent(int id, Student newStudent);
}
