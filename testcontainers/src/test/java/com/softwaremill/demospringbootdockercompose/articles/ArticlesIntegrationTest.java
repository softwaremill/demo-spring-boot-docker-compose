package com.softwaremill.demospringbootdockercompose.articles;

import com.softwaremill.demospringbootdockercompose.BaseIntegrationTest;
import com.softwaremill.demospringbootdockercompose.domain.articles.Article;
import com.softwaremill.demospringbootdockercompose.domain.articles.ArticleId;
import com.softwaremill.demospringbootdockercompose.domain.articles.Author;
import com.softwaremill.demospringbootdockercompose.domain.articles.Content;
import com.softwaremill.demospringbootdockercompose.infrastructure.articles.api.Articles;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

public class ArticlesIntegrationTest extends BaseIntegrationTest {

    @Test
    void shouldReturnSavedArticle() {
        // given
        var article = new Article(new ArticleId(UUID.randomUUID().toString()), new Author("test-author"), new Content("test content"));
        articlesRepository.save(article);

        // when
        Articles articles = testRestTemplate.getForObject("/api/articles", Articles.class);

        // then
        assertThat(articles).isEqualTo(new Articles(List.of(article)));
    }
}
