package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.JANUARY;
import static java.time.Month.MARCH;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student martin = new Student(
                    "Martin",
                    "martin.thomson@gmaol.com",
                    LocalDate.of(2000, JANUARY, 5),
                    25
            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmaol.com",
                    LocalDate.of(2004, MARCH, 6),
                    21
            );

            repository.saveAll(List.of(martin, alex));
        };
    }
}
