package com.example.redis.controller;

import com.example.redis.model.Student;
import com.example.redis.repository.StudentRepository;
import com.example.redis.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {


    private final StudentService studentService;


    @GetMapping
    public List<Student> getAllUsers() throws InterruptedException {
        return studentService.findAllStudent();
    }

    @GetMapping("/delete")
    public String deleteCache(){
        return studentService.deleteCache();
    }
}
