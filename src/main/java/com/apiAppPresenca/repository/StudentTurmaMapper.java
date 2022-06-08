package com.apiAppPresenca.repository;

import com.apiAppPresenca.model.entity.StudentDiscipline;
import org.springframework.jdbc.core.RowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentTurmaMapper implements RowMapper<StudentDiscipline> {

    @Override
    public StudentDiscipline mapRow(ResultSet resultSet, int i) throws SQLException{
        StudentDiscipline studentDiscipline = new StudentDiscipline();
        studentDiscipline.setId(resultSet.getInt("id"));
        studentDiscipline.setId_aluno(resultSet.getInt("id_student"));
        studentDiscipline.setId_discipline(resultSet.getInt("id_discipline"));
        return studentDiscipline;
    }

}
