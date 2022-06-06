package com.apiAppPresenca.repository;

import com.apiAppPresenca.model.entity.Turma;
import org.springframework.jdbc.core.JdbcTemplate;

public class TurmaRepository {

    private JdbcTemplate jdbcTemplate;

    public TurmaRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Turma registerTurma(Turma turma) throws Exception{
        String sql = "insert into turma(name, id_discipline) values (?, ?)";
        int insert = jdbcTemplate.update(sql,
                turma.getName(),
                turma.getId_discipline());
        if (insert == 1){
            return turma;
        }
        throw new Exception("A Turma não foi inserida corretamente");
    }

}
