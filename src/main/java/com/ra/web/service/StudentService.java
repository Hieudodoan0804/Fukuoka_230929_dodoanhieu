package com.ra.web.service;

import com.ra.web.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student save(Student student);
}
