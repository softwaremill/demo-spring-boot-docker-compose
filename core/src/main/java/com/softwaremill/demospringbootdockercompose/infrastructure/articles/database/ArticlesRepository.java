package com.softwaremill.demospringbootdockercompose.infrastructure.articles.database;

import com.softwaremill.demospringbootdockercompose.domain.articles.ArticleId;
import com.softwaremill.demospringbootdockercompose.domain.articles.Article;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArticlesRepository extends MongoRepository<Article, ArticleId> {
}
