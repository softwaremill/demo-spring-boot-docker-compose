package com.softwaremill.demospringbootdockercompose.infrastructure.articles.api;

import com.softwaremill.demospringbootdockercompose.domain.articles.Article;
import com.softwaremill.demospringbootdockercompose.infrastructure.articles.database.ArticlesRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/articles")
public class ArticlesController {

    private final ArticlesRepository articlesRepository;

    public ArticlesController(ArticlesRepository articlesRepository) {
        this.articlesRepository = articlesRepository;
    }

    @GetMapping
    public Articles getAllArticles() {
        List<Article> articles = articlesRepository.findAll();
        return new Articles(articles);
    }
}


