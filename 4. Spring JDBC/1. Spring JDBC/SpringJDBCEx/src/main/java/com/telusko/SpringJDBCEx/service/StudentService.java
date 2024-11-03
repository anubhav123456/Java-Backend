package com.telusko.SpringJDBCEx.service;

import com.telusko.SpringJDBCEx.dao.StudentRepo;
import com.telusko.SpringJDBCEx.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService
{
    private StudentRepo studentRepo;

    public StudentRepo getStudentRepo()
    {
        return studentRepo;
    }

    @Autowired
    public void setStudentRepo(StudentRepo studentRepo)
    {
        this.studentRepo = studentRepo;
    }

    public void addStudent(Student student)
    {
        studentRepo.save(student);
    }

    public List<Student> getStudents()
    {
        return studentRepo.findAll();
    }
}
