package com.softwaremill.demospringbootdockercompose.infrastructure.articles.api;

import com.softwaremill.demospringbootdockercompose.domain.articles.Article;

import java.util.List;

public record Articles(List<Article> articles) {
}
