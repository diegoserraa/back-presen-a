package com.apiAppPresenca.controller;


import com.apiAppPresenca.model.entity.Student;
import com.apiAppPresenca.repository.StudentRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")

public class StudentController {

    private StudentRepository studentRepository;

    public StudentController(JdbcTemplate jdbcTemplate){
        studentRepository = new StudentRepository(jdbcTemplate);
    }

    @PostMapping("/create")
    public Student insert(@RequestBody Student student) throws Exception{
        return studentRepository.registerStudent(student);
    }

}
