package com.apiAppPresenca.controller;


import com.apiAppPresenca.model.entity.Teacher;
import com.apiAppPresenca.repository.TeacherRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    private TeacherRepository teacherRepository;

    public TeacherController(JdbcTemplate jdbcTemplate){
        teacherRepository = new TeacherRepository(jdbcTemplate);
    }

    @PostMapping("/create")
    public Teacher insert(@RequestBody Teacher teacher) throws Exception{
        return teacherRepository.insert(teacher);
    }

    @PostMapping("/update/{id}")
    public Teacher update(Teacher teacher, @PathVariable("id") Integer id) throws Exception{
        return teacherRepository.alterData(teacher, id);
    }
}
