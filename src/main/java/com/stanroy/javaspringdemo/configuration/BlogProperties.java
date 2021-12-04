package com.stanroy.javaspringdemo.configuration;

import lombok.Data;
import org.springframework.boot.Banner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties("blog")
@Data
public class BlogProperties {

    private String title;
    private Banner banner;

}
