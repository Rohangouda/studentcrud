package com.student.service;

import com.student.model.Student;

import java.util.List;

public interface StudentService {

    Student addStudent(Student student);
    Student getStudentById(Integer studentId);
    void updateStudent(Student student);
    void deleteStudentById(Integer studentId);
    List<Student> getAllStudent();
}
