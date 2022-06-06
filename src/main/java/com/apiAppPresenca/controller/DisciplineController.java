package com.apiAppPresenca.controller;


import com.apiAppPresenca.model.entity.Discipline;
import com.apiAppPresenca.repository.DisciplineRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
