package com.apiAppPresenca.controller;


import com.apiAppPresenca.model.entity.Presenca;
import com.apiAppPresenca.repository.PresencaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/info")

public class PresencaController {

    private PresencaRepository presencaRepository;

    public PresencaController(JdbcTemplate jdbcTemplate){
        presencaRepository = new PresencaRepository(jdbcTemplate);
    }

    @GetMapping("presencas/{id_student}/{id_discipline}")
    public List<Presenca> searchAllPresencasOfStudentAtSomeDiscipline(@PathVariable("id_student") Integer id_student, @PathVariable("id_discipline") Integer id_discipline){
        return presencaRepository.getAllPresencasOfStudentAtSomeDiscipline(id_student, id_discipline);
    }

    @GetMapping("ausencias/{id_student}/{id_discipline}")
    public List<Presenca> searchAllAusenciasOfStudentAtSomeDiscipline(@PathVariable("id_student") Integer id_student, @PathVariable("id_discipline") Integer id_discipline){
        return presencaRepository.getAllAusenciasOfStudentArSomeDiscipline(id_student, id_discipline);
    }

    @PostMapping("/add")
    public Presenca insert(@RequestBody Presenca presenca) throws Exception{
        return presencaRepository.insert(presenca);
    }

}
