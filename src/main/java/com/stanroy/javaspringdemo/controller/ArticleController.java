package com.stanroy.javaspringdemo.controller;

import com.stanroy.javaspringdemo.repository.ArticleRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/article")
public class ArticleController {

    private ArticleRepository articleRepository;

    public ArticleController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @GetMapping("/")
    void findAll() {
        articleRepository.findAll();
    }

    @GetMapping("/{slug}")
    void findOne(@PathVariable String slug) {
        articleRepository.findBySlug(slug);
    }
}
