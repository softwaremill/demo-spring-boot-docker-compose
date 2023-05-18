package com.softwaremill.demospringbootdockercompose.domain.articles;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public record Article(@Id ArticleId articleId, Author author, Content content) {
}
