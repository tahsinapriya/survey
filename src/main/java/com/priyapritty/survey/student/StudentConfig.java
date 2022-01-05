package com.priyapritty.survey.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            System.out.println("this is run from commandLineRunner");
            Student mariam = new Student(1L, "Mariam","mariam.jamal@gmail.com",
                    LocalDate.of(2000, Month.JANUARY,5));
            Student alex = new Student(2L,"Alex","alex@gmail.com",
                    LocalDate.of(2004, Month.JANUARY,5));

            repository.saveAll(Arrays.asList(mariam,alex));
        };

    }
}
