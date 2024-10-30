package com.example.boot_demo.service;

import com.example.boot_demo.dao.Student;
import com.example.boot_demo.dto.StudentDTO;

public interface StudentService {

        public StudentDTO getStudentById(long id);

}
