package com.apiAppPresenca.controller;


import com.apiAppPresenca.model.entity.StudentDiscipline;
import com.apiAppPresenca.repository.StudentTurmaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/group")
public class StudentTurmaController {

    private StudentTurmaRepository StudentTurmaRepository;

    public StudentTurmaController(JdbcTemplate jdbcTemplate){
        StudentTurmaRepository = new StudentTurmaRepository(jdbcTemplate);
    }

    @GetMapping("/students/{id}")
    public List<StudentDiscipline> searchAllStudentsDisciplineByIdDiscipline(@PathVariable("id") Integer id){
        return StudentTurmaRepository.getAllStudentsDisciplineByIdDiscipline(id);
    }

    @PostMapping("/add")
    public StudentDiscipline insert(@RequestBody StudentDiscipline studentDiscipline) throws Exception{
        return StudentTurmaRepository.registerStudentTurma(studentDiscipline);
    }

}
