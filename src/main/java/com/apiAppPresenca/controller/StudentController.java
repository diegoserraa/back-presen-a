package com.apiAppPresenca.controller;


import com.apiAppPresenca.model.entity.Student;
import com.apiAppPresenca.repository.StudentRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")

public class StudentController {

    private StudentRepository studentRepository;

    public StudentController(JdbcTemplate jdbcTemplate){
        studentRepository = new StudentRepository(jdbcTemplate);
    }

    @GetMapping
    public List<Student> getAllStudents(){
        return studentRepository.getStudents();
    }

    @PostMapping("/create")
    public Student insert(@RequestBody Student student) throws Exception{
        return studentRepository.registerStudent(student);
    }

}
