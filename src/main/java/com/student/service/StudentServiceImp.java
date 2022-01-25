package com.student.service;

import com.student.model.Student;
import com.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentServiceImp implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Integer studentId) {
        return studentRepository.findById(studentId).get();
    }

    @Override
    public void updateStudent(Student student) {
            studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Integer studentId) {
        studentRepository.deleteById(studentId
        );
    }


    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

}
