package com.example.boot_demo.service;

import com.example.boot_demo.dao.Student;
import com.example.boot_demo.dto.StudentDTO;

public interface StudentService {

        public StudentDTO getStudentById(long id);

    long addNewStudent(StudentDTO studentDTO);

    void deleteStudentById(long id);

    StudentDTO updateStudentById(long id, String name, String email);
}
