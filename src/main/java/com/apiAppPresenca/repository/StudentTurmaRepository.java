package com.apiAppPresenca.repository;

import com.apiAppPresenca.model.entity.StudentDiscipline;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentTurmaRepository {

    private JdbcTemplate jdbcTemplate;

    public StudentTurmaRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public StudentDiscipline registerStudentTurma(StudentDiscipline studentDiscipline) throws Exception{
        String sql = "insert into studentDiscipline(id_student, id_discipline) values (?, ?)";
        int insert = jdbcTemplate.update(sql,
                studentDiscipline.getId_aluno(),
                studentDiscipline.getId_discipline());
        if (insert == 1){
            return studentDiscipline;
        }
        throw new Exception("O aluno(a) não foi inserido(a) corretamente");
    }

}
