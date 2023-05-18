package com.softwaremill.demospringbootdockercompose.infrastructure.users.database;

import com.softwaremill.demospringbootdockercompose.domain.users.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<User, String> {
}
