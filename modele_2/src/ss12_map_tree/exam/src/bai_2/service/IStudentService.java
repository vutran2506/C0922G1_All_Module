package bai_2.service;

import bai_2.model.Student;

import java.util.List;

public interface IService {
    List<Student> getStudent();
    void deleteStudent(int id);
    void addStudent(Student student);
}
