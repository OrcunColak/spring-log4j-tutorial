package com.colak.springlog4jtutorial;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringLog4jTutorialApplication implements CommandLineRunner {

    public static void main(String[] args) {

        SpringApplication.run(SpringLog4jTutorialApplication.class, args);
    }

    @Override
    public void run(String... args) {
        log.debug("Debug message");
    }
}
