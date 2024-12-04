package com.dinidu.REST_API_Demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student dinidu = new Student(
                    "Dinidu",
                    21,
                    LocalDate.of(2003, Month.JUNE, 21),
                    "Dinidu123@gmail.com");

            Student sachintha = new Student(
                    "Sachintha",
                    21,
                    LocalDate.of(2003, Month.JUNE, 22),
                    "Sachintha123@gmail.com");

            studentRepository.saveAll(List.of(dinidu, sachintha));
        };
    };
}