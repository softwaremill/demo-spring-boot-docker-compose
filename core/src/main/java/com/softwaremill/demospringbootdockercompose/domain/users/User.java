package com.softwaremill.demospringbootdockercompose.domain.users;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public record User(@Id String id, String name) {
}
