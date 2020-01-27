package com.example.demo;

import com.example.demo.domain.Hartsa;
import com.example.demo.domain.HartsaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoHartsaApplication {

    private static final Logger log = LoggerFactory.getLogger(DemoHartsaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoHartsaApplication.class, args);
    }


    @Bean
    public CommandLineRunner hartsaDemo(HartsaRepository hRepo) {
        return (args) -> {
            log.info("save a couple of strings");

            // Save a few strings
            hRepo.save(new Hartsa("e-mail: harrinupponen@gmail.com"));
            hRepo.save(new Hartsa("tel: +358 (0) 40 739 8459"));
        };
    }
}