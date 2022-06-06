package com.apiAppPresenca.repository;

import com.apiAppPresenca.model.entity.StudentTurma;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentTurmaRepository {

    private JdbcTemplate jdbcTemplate;

    public StudentTurmaRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public StudentTurma registerStudentTurma(StudentTurma studentTurma) throws Exception{
        String sql = "insert into studentTurma(id_aluno, id_turma) values (?, ?)";
        int insert = jdbcTemplate.update(sql,
                studentTurma.getId_aluno(),
                studentTurma.getId_turma());
        if (insert == 1){
            return studentTurma;
        }
        throw new Exception("O aluno(a) não foi inserido(a) corretamente");
    }

}
