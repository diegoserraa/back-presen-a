package com.apiAppPresenca.controller;


import com.apiAppPresenca.model.entity.StudentTurma;
import com.apiAppPresenca.repository.StudentTurmaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/group")
public class StudentTurmaController {

    private StudentTurmaRepository StudentTurmaRepository;

    public StudentTurmaController(JdbcTemplate jdbcTemplate){
        StudentTurmaRepository = new StudentTurmaRepository(jdbcTemplate);
    }

    @PostMapping("/add")
    public StudentTurma insert(@RequestBody StudentTurma studentTurma) throws Exception{
        return StudentTurmaRepository.registerStudentTurma(studentTurma);
    }

}
