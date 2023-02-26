package com.geekster.studentinfo.controller;

import com.geekster.studentinfo.model.*;
import com.geekster.studentinfo.service.StudentService;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
    @Autowired
    public StudentService studentService;

    @GetMapping("/get-student")
    public List<Student> getStudent(@Nullable @RequestParam int id){

        return studentService.getStudent(id);
    }
    @PostMapping("/add-student")
    public ResponseEntity<String> addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        int id = student.getID();
        return new ResponseEntity<>("The new student with id: "+id+" has been added to the student table", HttpStatus.CREATED);
    }
    @DeleteMapping("/delete-student")
    public ResponseEntity<String> deleteStudent(@RequestParam int id){
        studentService.deleteStudent(id);
        return new ResponseEntity<>("Student deleted successfully", HttpStatus.OK);
    }
    @PutMapping("/update-student")
    public ResponseEntity<String> updateStudent(@RequestParam int id,@RequestBody Student student){
        studentService.updateStudent(id,student);
        return new ResponseEntity<>("Student with id:"+id+" has been updated",HttpStatus.OK);
    }


    @GetMapping("/get-laptop")
    public List<Laptop> getLaptop(@Nullable @RequestParam int id){
        return studentService.getLaptop(id);
    }
    @PostMapping("/add-laptop")
    public ResponseEntity<String> addLapotp(@RequestBody Laptop laptop){
        studentService.addLaptop(laptop);
        int id = laptop.getID();
        return new ResponseEntity<>("The new laptop with id: "+id+" has been added to the laptop table", HttpStatus.CREATED);
    }
    @DeleteMapping("/delete-laptop")
    public ResponseEntity<String> deleteLaptop(@RequestParam int id){
        studentService.deleteLaptop(id);
        return new ResponseEntity<>("Laptop deleted successfully", HttpStatus.OK);
    }
    @PutMapping("/update-laptop")
    public ResponseEntity<String> updateLaptop(@RequestParam int id,@RequestBody Laptop laptop){
        studentService.updateLaptop(id,laptop);
        return new ResponseEntity<>("Laptop with id:"+id+" has been updated",HttpStatus.OK);
    }




    @GetMapping("/get-course")
    public List<Course> getCourse(@Nullable @RequestParam int id){
        return studentService.getCourse(id);
    }
    @PostMapping("/add-course")
    public ResponseEntity<String> addCourse(@RequestBody Course course){
        studentService.addCourse(course);
        int id = course.getID();
        return new ResponseEntity<>("The new course with id: "+id+" has been added to the course table", HttpStatus.CREATED);
    }
    @DeleteMapping("/delete-course")
    public ResponseEntity<String> deleteCourse(@RequestParam int id){
        studentService.deleteCourse(id);
        return new ResponseEntity<>("Course deleted successfully", HttpStatus.OK);
    }
    @PutMapping("/update-course")
    public ResponseEntity<String> updateCourse(@RequestParam int id,@RequestBody Course course){
        studentService.updateCourse(id,course);
        return new ResponseEntity<>("Course with id:"+id+" has been updated",HttpStatus.OK);
    }



    @GetMapping("/get-book")
    public List<Book> getBook(@Nullable @RequestParam int id){
        return studentService.getBook(id);
    }
    @PostMapping("/add-book")
    public ResponseEntity<String> addCourse(@RequestBody Book book){
        studentService.addBook(book);
        int id = book.getID();
        return new ResponseEntity<>("The new book with id: "+id+" has been added to the book table", HttpStatus.CREATED);
    }
    @DeleteMapping("/delete-book")
    public ResponseEntity<String> deleteBook(@RequestParam int id){
        studentService.deleteBook(id);
        return new ResponseEntity<>("Book deleted successfully", HttpStatus.OK);
    }
    @PutMapping("/update-book")
    public ResponseEntity<String> updateBook(@RequestParam int id,@RequestBody Book book){
        studentService.updateBook(id,book);
        return new ResponseEntity<>("Book with id:"+id+" has been updated",HttpStatus.OK);
    }


}
