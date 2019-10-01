package com.mainacad.entity;

import lombok.Getter;

@Getter
public enum UserRole {

    STUDENT("student"),
    TEACHER("teacher"),
    ADMIN("admin");

    private final String name;

    UserRole(String name) {
        this.name = name;
    }
}
