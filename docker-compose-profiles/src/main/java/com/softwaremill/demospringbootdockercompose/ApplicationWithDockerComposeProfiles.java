package com.softwaremill.demospringbootdockercompose;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationWithDockerComposeProfiles {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationWithDockerComposeProfiles.class, args);
    }
}
