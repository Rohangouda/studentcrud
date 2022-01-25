package com.student.controller;

import com.student.model.Student;
import com.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;


//    @PostMapping("/students-ave")
//    @ResponseStatus(HttpStatus.CREATED)
//    public Student addStudent(@RequestBody Student student) {
//        return studentService.addStudent(student);
//    }

    @PostMapping("/save")
    public Student addStudent(
            @RequestBody Student student)
    {
        return studentService.addStudent(student);
    }

    @GetMapping("/students")
    public List<Student> getAllStudent()
    {
        return studentService.getAllStudent();
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable("id") Integer studentId) {
       return studentService.getStudentById(studentId);
    }

    @PutMapping("/student")
    private Student update(@RequestBody Student student)
    {
        studentService.updateStudent(student);
        return student;
    }

    @DeleteMapping("student/{id}")
    public HttpStatus deleteStudentById(@PathVariable("id") Integer studentId) {
        studentService.deleteStudentById(studentId);
        return HttpStatus.OK;
    }
}
