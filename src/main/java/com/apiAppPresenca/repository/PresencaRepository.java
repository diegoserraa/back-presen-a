package com.apiAppPresenca.repository;

import com.apiAppPresenca.model.entity.Presenca;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class PresencaRepository {

    private JdbcTemplate jdbcTemplate;

    public PresencaRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Presenca insert(Presenca presenca) throws Exception {
        String sql = "insert into presenca(id_student, id_discipline, status, data) values (?, ?, ?, ?)";
        int insert = jdbcTemplate.update(sql,
                presenca.getId_student(),
                presenca.getId_discipline(),
                presenca.getStatus(),
                presenca.getData());
        if (insert == 1) {
            return presenca;
        }
        throw new Exception("O Registro de presenca não foi inserido corretamente");
    }

    public List<Presenca> getAllPresencasOfStudentAtSomeDiscipline(Integer id_student, Integer id_discipline) {
        return jdbcTemplate.query("select * from presenca where id_student = ? and id_discipline = ? and status = 'Presente'", new Object[]{id_student, id_discipline}, new PresencaMapper());
    }

    public List<Presenca> getAllAusenciasOfStudentArSomeDiscipline(Integer id_student, Integer id_discipline) {
        return jdbcTemplate.query("select * from presenca where id_student = ? and id_discipline = ? and status = 'Ausente'", new Object[]{id_student, id_discipline}, new PresencaMapper());
    }
}
