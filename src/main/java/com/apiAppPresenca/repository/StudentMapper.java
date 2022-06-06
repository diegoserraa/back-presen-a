package com.apiAppPresenca.repository;

import com.apiAppPresenca.model.entity.Student;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentMapper implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet resultSet, int i) throws SQLException{
        Student student = new Student();
        student.setId(resultSet.getInt("id"));
        student.setNome(resultSet.getString("name"));
        student.setEmail(resultSet.getString("email"));
        student.setFoto(resultSet.getString("foto"));
        return student;
    }

}
