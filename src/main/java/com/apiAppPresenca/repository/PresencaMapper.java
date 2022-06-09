package com.apiAppPresenca.repository;

import com.apiAppPresenca.model.entity.Presenca;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PresencaMapper implements RowMapper<Presenca> {

    @Override
    public Presenca mapRow(ResultSet resultSet, int i) throws SQLException {
        Presenca presenca = new Presenca();
        presenca.setId(resultSet.getInt("id"));
        presenca.setId_student(resultSet.getInt("id_student"));
        presenca.setId_discipline(resultSet.getInt("id_discipline"));
        presenca.setStatus(resultSet.getString("status"));
        presenca.setData(resultSet.getDate("data"));
        return presenca;
    }



}
