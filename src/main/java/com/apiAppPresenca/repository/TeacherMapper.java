package com.apiAppPresenca.repository;

import com.apiAppPresenca.model.entity.Teacher;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TeacherMapper implements RowMapper<Teacher> {

    @Override
    public Teacher mapRow(ResultSet resultSet, int i) throws SQLException{
        Teacher teacher = new Teacher();
        teacher.setNome(resultSet.getString("nome"));
        teacher.setUsername(resultSet.getString("username"));
        teacher.setPassword(resultSet.getString("password"));
        return teacher;
    }

}
