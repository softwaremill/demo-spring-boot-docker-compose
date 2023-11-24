package com.softwaremill.demospringbootdockercompose;

import com.softwaremill.demospringbootdockercompose.infrastructure.articles.database.ArticlesRepository;
import com.softwaremill.demospringbootdockercompose.infrastructure.users.database.UsersRepository;
import org.junit.jupiter.api.AfterEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class BaseIntegrationTest {

    @Autowired
    protected TestRestTemplate testRestTemplate;

    @Autowired
    protected ArticlesRepository articlesRepository;

    @Autowired
    protected UsersRepository usersRepository;

    @AfterEach
    void cleanup() {
        articlesRepository.deleteAll();
        usersRepository.deleteAll();
    }
}
