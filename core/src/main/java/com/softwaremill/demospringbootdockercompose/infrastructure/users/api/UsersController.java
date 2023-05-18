package com.softwaremill.demospringbootdockercompose.infrastructure.users.api;

import com.softwaremill.demospringbootdockercompose.infrastructure.users.database.UsersRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    private final UsersRepository usersRepository;

    public UsersController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @GetMapping
    public Users getAllUsers() {
        var users = usersRepository.findAll();
        return new Users(users);
    }
}
