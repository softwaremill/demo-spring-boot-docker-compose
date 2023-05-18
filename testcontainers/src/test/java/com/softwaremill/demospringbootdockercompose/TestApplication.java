package com.softwaremill.demospringbootdockercompose;

import com.softwaremill.demospringbootdockercompose.config.TestContainersConfiguration;
import org.springframework.boot.SpringApplication;

public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.from(Application::main)
                .with(TestContainersConfiguration.class)
                .run(args);
    }
}
