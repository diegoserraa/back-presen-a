package com.apiAppPresenca.controller;


import com.apiAppPresenca.model.entity.Discipline;
import com.apiAppPresenca.repository.DisciplineRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/discipline")
public class DisciplineController {

    private DisciplineRepository DisciplineRepository;

    public DisciplineController(JdbcTemplate jdbcTemplate){
        DisciplineRepository = new DisciplineRepository(jdbcTemplate);
    }

    @PostMapping("/create")
    public Discipline insert(@RequestBody Discipline discipline) throws Exception{
        return DisciplineRepository.registerDiscipline(discipline);
    }

    @GetMapping
    public List<Discipline> getAllDisciplines(){
        return DisciplineRepository.getDisciplines();
    }

}
