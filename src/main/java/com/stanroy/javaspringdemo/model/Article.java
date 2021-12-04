package com.stanroy.javaspringdemo.model;

import com.stanroy.javaspringdemo.util.Extensions;
import lombok.Data;
import lombok.experimental.ExtensionMethod;
import lombok.val;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
@ExtensionMethod({Extensions.class})
@Data
public class Article {
    private String title, headline, content;

    @ManyToOne
    private User author;
    private String slug = title.toSlug();

    @Id
    @GeneratedValue
    private Long id;

    public Article(String title, String headline, String content, User author) {
        this.title = title;
        this.headline = headline;
        this.content = content;
        this.author = author;
    }

    public Article() {

    }

}
