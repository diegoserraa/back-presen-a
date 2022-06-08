package com.apiAppPresenca.model.entity;

public class StudentDiscipline {

    Integer id;
    Integer id_student;
    Integer id_discipline;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_aluno() {
        return id_student;
    }

    public void setId_aluno(Integer id_aluno) {
        this.id_student = id_aluno;
    }

    public Integer getId_discipline() {
        return id_discipline;
    }

    public void setId_discipline(Integer id_turma) {
        this.id_discipline = id_turma;
    }
}
