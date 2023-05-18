package com.softwaremill.demospringbootdockercompose;

import com.softwaremill.demospringbootdockercompose.config.TestContainersConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import(TestContainersConfiguration.class)
class ApplicationTest {

    @Test
    void contextLoads(){

    }
}
