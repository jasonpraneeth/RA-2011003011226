package com.example.trainmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.example.trainmicroservice.*")
@EntityScan("com.example.trainmicroservice.model") // Provide the base package(s) for entity scanning
@EnableJpaRepositories("com.example.trainmicroservice.repository")

public class trainmicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(trainmicroserviceApplication.class, args);
    }

}
