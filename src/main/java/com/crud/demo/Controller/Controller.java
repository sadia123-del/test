package com.crud.demo.Controller;

import com.crud.demo.Domain.Student;
import com.crud.demo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    StudentRepository studentRepository;
    @GetMapping(value = "/a")
    public ResponseEntity<List<Student>> getAll(){
        List<Student> students = studentRepository.findAll();
        return new ResponseEntity<List<Student>>(students,new HttpHeaders(), HttpStatus.OK);
    }

}
