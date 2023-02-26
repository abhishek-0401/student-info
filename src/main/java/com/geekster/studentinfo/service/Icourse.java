package com.geekster.studentinfo.service;

import com.geekster.studentinfo.model.Course;

import java.util.List;

public interface Icourse {
    public List<Course> getCourse(int id);
    public void addCourse(Course course);
    public void deleteCourse(int id);
    public void updateCourse(int id, Course newCourse);
}
