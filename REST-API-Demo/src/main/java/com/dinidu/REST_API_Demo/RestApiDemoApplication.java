package com.dinidu.REST_API_Demo;

import com.dinidu.REST_API_Demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class RestApiDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApiDemoApplication.class, args);
    }

	@GetMapping
	public List<Student> home() {
		return List.of(
				new Student("John Doe", 24, LocalDate.of(2000, 1, 15), "john.doe@example.com"),
				new Student("Jane Doe", 26, LocalDate.of(1998, 5, 10), "jane.doe@example.com")
		);
	}
}
