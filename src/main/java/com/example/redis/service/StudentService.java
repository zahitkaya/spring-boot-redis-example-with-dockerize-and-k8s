package com.example.redis.service;

import com.example.redis.model.Student;
import com.example.redis.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    @Cacheable(cacheNames = "students")
    public List<Student> findAllStudent() throws InterruptedException {
        Thread.sleep(2000);
        return studentRepository.findAll();
    }

    @CacheEvict(cacheNames = "students")
    public String deleteCache(){
        return "cache is deleted";
    }

}
