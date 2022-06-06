package com.apiAppPresenca.repository;

import com.apiAppPresenca.model.entity.Turma;
import org.springframework.jdbc.core.RowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;

public class TurmaMapper implements RowMapper<Turma> {

    @Override
    public Turma mapRow(ResultSet resultSet, int i) throws SQLException{
        Turma turma = new Turma();
        turma.setId(resultSet.getInt("id"));
        turma.setName(resultSet.getString("name"));
        turma.setId_discipline(resultSet.getInt("id_discipline"));
        return turma;
    }

}
