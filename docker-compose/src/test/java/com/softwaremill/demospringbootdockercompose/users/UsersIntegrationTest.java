package com.softwaremill.demospringbootdockercompose.users;

import com.softwaremill.demospringbootdockercompose.BaseIntegrationTest;
import com.softwaremill.demospringbootdockercompose.domain.users.User;
import com.softwaremill.demospringbootdockercompose.infrastructure.users.api.Users;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

public class UsersIntegrationTest extends BaseIntegrationTest {

    @Test
    void shouldReturnSavedUser() {
        // given
        var user = new User(UUID.randomUUID().toString(), "username");
        usersRepository.save(user);

        // when
        Users users = testRestTemplate.getForObject("/api/users", Users.class);

        // then
        assertThat(users).isEqualTo(new Users(List.of(user)));
    }
}
