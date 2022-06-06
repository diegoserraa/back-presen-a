package com.apiAppPresenca.controller;

import com.apiAppPresenca.model.entity.Turma;
import com.apiAppPresenca.repository.TurmaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/turma")
public class TurmaController {

    private TurmaRepository TurmaRepository;

    public TurmaController(JdbcTemplate jdbcTemplate){
        TurmaRepository = new TurmaRepository(jdbcTemplate);
    }

    @PostMapping("/create")
    public Turma insert(@RequestBody Turma turma) throws Exception{
        return TurmaRepository.registerTurma(turma);
    }

}
