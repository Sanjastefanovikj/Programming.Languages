package com.example.demo.event;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class EventConfig {

    @Bean
    CommandLineRunner commandLineRunner(EventRepository repository) {
        return args -> {

            Event concert = new Event (
                    "dnk",
                    "boris",
                    21.30,
                    LocalDate.of(2024, Month.JUNE, 5)
            );

            Event concert1 = new Event (
                    "maria",
                    "boris",
                    20.30,
                    LocalDate.of(2024, Month.JULY, 7)
            );

            repository.saveAll(
                    List.of(concert, concert1)
            );
        };
    }
}
