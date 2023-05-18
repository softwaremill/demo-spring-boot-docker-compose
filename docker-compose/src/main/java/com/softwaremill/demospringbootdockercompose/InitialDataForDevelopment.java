package com.softwaremill.demospringbootdockercompose;

import com.softwaremill.demospringbootdockercompose.domain.users.User;
import com.softwaremill.demospringbootdockercompose.infrastructure.users.database.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;

@Configuration
public class InitialDataForDevelopment {

    @Bean
    @ConditionalOnProperty(name = "data.initialize", havingValue = "true")
    public CommandLineRunner commandLineRunner(UsersRepository usersRepository) {
        return args -> usersRepository.save(new User(UUID.randomUUID().toString(), "name"));
    }
}
