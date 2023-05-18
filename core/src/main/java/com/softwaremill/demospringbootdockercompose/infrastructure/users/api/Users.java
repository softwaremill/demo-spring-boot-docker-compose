package com.softwaremill.demospringbootdockercompose.infrastructure.users.api;

import com.softwaremill.demospringbootdockercompose.domain.users.User;

import java.util.List;

public record Users(List<User> users) {
}
