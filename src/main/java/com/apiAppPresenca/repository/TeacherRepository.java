package com.apiAppPresenca.repository;

import com.apiAppPresenca.model.entity.Teacher;
import org.springframework.jdbc.core.JdbcTemplate;

public class TeacherRepository {

    private JdbcTemplate jdbcTemplate;

    public TeacherRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public Teacher insert (Teacher teacher) throws Exception{
        String sql = "insert into teacher(nome, username, password) values (?, ?, ?)";
        int insert = jdbcTemplate.update(sql,
                teacher.getNome(),
                teacher.getUsername(),
                teacher.getPassword());
        if (insert == 1){
            return teacher;
        }
        throw new Exception("A compra não foi realizado com sucesso");
    }

    public Teacher alterData(Teacher teacher, Integer id)  throws Exception {

        String sql = "update teacher (nome, username, password) values (?, ?, ?) where id = ?";
        int insert = jdbcTemplate.update(sql,
                teacher.getNome(),
                teacher.getUsername(),
                teacher.getPassword(),
                id);
        if (insert == 1){
            return teacher;
        }
        throw new Exception("O Professor não foi atualizado corretamente");

    }

}
