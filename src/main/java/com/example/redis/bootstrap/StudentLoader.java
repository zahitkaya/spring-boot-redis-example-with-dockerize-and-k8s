package com.example.redis.bootstrap;

import com.example.redis.model.Student;
import com.example.redis.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class StudentLoader implements CommandLineRunner {

    private final StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {

        studentRepository.save(Student.builder().id("1").name("zahit").build());
        studentRepository.save(Student.builder().id("2").name("kaya").build());
        log.info("Students added");
    }
}
