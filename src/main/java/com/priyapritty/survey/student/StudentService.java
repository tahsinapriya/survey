package com.priyapritty.survey.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return Arrays.asList(new Student(1L, "mariam","mariam.jamal@gmail.com",
                LocalDate.of(2000, Month.JANUARY,5),21));
    }
}
