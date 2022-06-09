package com.apiAppPresenca.model.entity;

import java.sql.Date;

public class Presenca {

    Integer id;
    Integer id_student;
    Integer id_discipline;
    String status;
    Date data;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_student() {
        return id_student;
    }

    public void setId_student(Integer id_student) {
        this.id_student = id_student;
    }

    public Integer getId_discipline() {
        return id_discipline;
    }

    public void setId_discipline(Integer id_discipline) {
        this.id_discipline = id_discipline;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
