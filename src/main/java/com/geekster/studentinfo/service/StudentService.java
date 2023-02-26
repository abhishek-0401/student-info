package com.geekster.studentinfo.service;

import com.geekster.studentinfo.model.*;
import com.geekster.studentinfo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService implements Ibook,Icourse,Ilaptop,Istudent{

    @Autowired
    BookRepo bookRepo;
    @Autowired
    CourseRepo courseRepo;
    @Autowired
    LaptopRepo laptopRepo;
    @Autowired
    StudentRepo studentRepo;

    @Override
    public List<Book> getBook(int id) {
        List<Book> bookList = new ArrayList<>();
        if(String.valueOf(id) != null){
            bookList.add(bookRepo.findById(id).get());
        }
        else bookList  = bookRepo.findAll();
        return bookList ;
    }

    @Override
    public void addBook(Book book) {
        bookRepo.save(book);
    }

    @Override
    public void deleteBook(int id) {
        if(bookRepo.findById(id).isPresent())
            bookRepo.deleteById(id);
    }

    @Override
    public void updateBook(int id, Book newBook) {
        Book book = null;
        if(bookRepo.findById(id).isPresent()) {
            book = bookRepo.findById(id).get();
            newBook.setID(book.getID());
        }
        bookRepo.save(newBook);
    }

    @Override
    public List<Course> getCourse(int id) {
        List<Course> courseList = new ArrayList<>();
        if(String.valueOf(id) != null){
            courseList .add(courseRepo.findById(id).get());
        }
        else courseList  = courseRepo.findAll();
        return courseList ;
    }

    @Override
    public void addCourse(Course course) {
        courseRepo.save(course);
    }

    @Override
    public void deleteCourse(int id) {
        if(courseRepo.findById(id).isPresent())
            courseRepo.deleteById(id);
    }

    @Override
    public void updateCourse(int id, Course newCourse) {
        Course course = null;
        if(courseRepo.findById(id).isPresent()) {
            course = courseRepo.findById(id).get();
            newCourse.setID(course.getID());
        }
        courseRepo.save(newCourse);
    }

    @Override
    public List<Laptop> getLaptop(int id) {
        List<Laptop> laptopList = new ArrayList<>();
        if(String.valueOf(id) != null){
            laptopList.add(laptopRepo.findById(id).get());
        }
        else laptopList = laptopRepo.findAll();
        return laptopList;
    }

    @Override
    public void addLaptop(Laptop laptop) {
        laptopRepo.save(laptop);
    }

    @Override
    public void deleteLaptop(int id) {
        if(laptopRepo.findById(id).isPresent())
            laptopRepo.deleteById(id);
    }

    @Override
    public void updateLaptop(int id, Laptop newLaptop) {
        Laptop laptop = null;
        if(laptopRepo.findById(id).isPresent()) {
            laptop = laptopRepo.findById(id).get();
            newLaptop.setID(laptop.getID());
        }
        laptopRepo.save(newLaptop);
    }

    @Override
    public List<Student> getStudent(int id) {
        List<Student> studentList = new ArrayList<>();
        if(String.valueOf(id) != null){
            studentList.add(studentRepo.findById(id).get());
        }
        else studentList = studentRepo.findAll();
        return studentList;
    }

    @Override
    public void addStudent(Student student) {
        studentRepo.save(student);
    }

    @Override
    public void deleteStudent(int id) {
        if(studentRepo.findById(id).isPresent())
            studentRepo.deleteById(id);
    }

    @Override
    public void updateStudent(int id, Student newStudent) {
        Student student =null;
        if(studentRepo.findById(id).isPresent()) {
            student = studentRepo.findById(id).get();
            newStudent.setID(student.getID());
        }
        studentRepo.save(newStudent);
    }

}
