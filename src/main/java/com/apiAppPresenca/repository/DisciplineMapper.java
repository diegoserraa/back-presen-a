package com.apiAppPresenca.repository;

import com.apiAppPresenca.model.entity.Discipline;
import org.springframework.jdbc.core.RowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;

public class DisciplineMapper implements RowMapper<Discipline> {

    @Override
    public Discipline mapRow(ResultSet resultSet, int i) throws SQLException{
        Discipline discipline = new Discipline();
        discipline.setId(resultSet.getInt("id"));
        discipline.setName(resultSet.getString("name"));
        discipline.setDescricao(resultSet.getString("descricao"));
        return discipline;
    }

}
