package com.apiAppPresenca.repository;

import com.apiAppPresenca.model.entity.Student;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class StudentRepository {

    private JdbcTemplate jdbcTemplate;

    public StudentRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public Student registerStudent(Student student) throws Exception{
        String sql = "insert into student(name, email, photo) values (?, ?, ?)";
        int insert = jdbcTemplate.update(sql,
                student.getNome(),
                student.getEmail(),
                student.getFoto());
        if (insert == 1){
            return student;
        }
        throw new Exception("O Estudante não foi inserido com sucesso");
    }

    public List<Student> getStudents(){
        return jdbcTemplate.query("select * from student", new StudentMapper());
    }

}
