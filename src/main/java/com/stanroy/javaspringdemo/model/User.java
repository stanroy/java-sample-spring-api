package com.stanroy.javaspringdemo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class User {

    private String login, firstName, lastName, description;

    @Id
    @GeneratedValue
    private Long id;

    public User(String login, String firstName, String lastName, String description) {
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
    }

    public User() {

    }
}
