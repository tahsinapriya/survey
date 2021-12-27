package com.priyapritty.survey;

import com.priyapritty.survey.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;


@SpringBootApplication
@RestController
public class SurveyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SurveyApplication.class, args);
	}
    @GetMapping
	public List<Student> hello() {
		return Arrays.asList(new Student(1L, "mariam","mariam.jamal@gmail.com",
				LocalDate.of(2000, Month.JANUARY,5),21));
	}
}

