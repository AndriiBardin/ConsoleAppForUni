package com.example.botscrew;

import com.example.botscrew.controller.Application;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BotscrewApplication implements CommandLineRunner {

    private Application application;

    public BotscrewApplication(Application application) {
        this.application = application;
    }

    public static void main(String[] args) {
        SpringApplication.run(BotscrewApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("UNIVERSITY SOFTWARE");
        application.run();
    }
}
