package com.apiAppPresenca.repository;

import com.apiAppPresenca.model.entity.StudentTurma;
import org.springframework.jdbc.core.RowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentTurmaMapper implements RowMapper<StudentTurma> {

    @Override
    public StudentTurma mapRow(ResultSet resultSet, int i) throws SQLException{
        StudentTurma studentTurma = new StudentTurma();
        studentTurma.setId(resultSet.getInt("id"));
        studentTurma.setId_aluno(resultSet.getInt("id_student"));
        studentTurma.setId_turma(resultSet.getInt("id_discipline"));
        return studentTurma;
    }

}
