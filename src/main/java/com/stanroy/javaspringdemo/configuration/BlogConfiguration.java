package com.stanroy.javaspringdemo.configuration;

import com.stanroy.javaspringdemo.model.Article;
import com.stanroy.javaspringdemo.model.User;
import com.stanroy.javaspringdemo.repository.ArticleRepository;
import com.stanroy.javaspringdemo.repository.UserRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BlogConfiguration {

    @Bean
    ApplicationRunner initDatabase(UserRepository userRepository, ArticleRepository articleRepository) {
        return args -> {
            User stanroy = userRepository.save(new User("stanroy", "Stanroy", "Miles", "yep"));
            articleRepository.save(new Article("New ps6 is out", "Lorem ipsum", "dolor sit amet", stanroy));
        };
    }

}

