package com.apiAppPresenca.repository;

import com.apiAppPresenca.model.entity.Discipline;
import com.apiAppPresenca.model.entity.Student;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class DisciplineRepository {

    private JdbcTemplate jdbcTemplate;

    public DisciplineRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Discipline registerDiscipline(Discipline discipline) throws Exception{
        String sql = "insert into discipline(name, descricao) values (?, ?)";
        int insert = jdbcTemplate.update(sql,
                discipline.getName(),
                discipline.getDescricao());
        if (insert == 1){
            return discipline;
        }
        throw new Exception("A disciplina não foi inserida corretamente");
    }

    public List<Discipline> getDisciplines(){
        return jdbcTemplate.query("select * from discipline", new DisciplineMapper());
    }

}
