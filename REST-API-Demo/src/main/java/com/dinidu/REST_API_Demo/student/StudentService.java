package com.dinidu.REST_API_Demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getAllStudents() {
        return List.of(
                new Student("John Doe", 24, LocalDate.of(2000, 1, 15), "john.doe@example.com"),
                new Student("Jane Doe", 26, LocalDate.of(1998, 5, 10), "jane.doe@example.com")
        );
    }
}
