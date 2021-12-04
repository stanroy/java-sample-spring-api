package com.stanroy.javaspringdemo.repository;

import com.stanroy.javaspringdemo.model.Article;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {

    Article findBySlug(String slug);

    Iterable<Article> findAll();

}
