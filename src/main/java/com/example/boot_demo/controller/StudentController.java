package com.example.boot_demo.controller;


import com.example.boot_demo.Response;
import com.example.boot_demo.dao.Student;
import com.example.boot_demo.dto.StudentDTO;
import com.example.boot_demo.service.StudentService;
import com.example.boot_demo.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/student/{id}")
    public Response<StudentDTO> getStudentById(@PathVariable long id){
        return Response.newSuccess(studentService.getStudentById(id));
    }

    @PostMapping("/student")
    public long addNewStudent(@RequestBody StudentDTO studentDTO){
        return Response.newSuccess(studentService.add)
    }
}
