package com.mainacad.entity;

import lombok.Getter;

@Getter
public enum Subject {

    C_PLUS_PLUS("C++"),
    C_SHARP("C#"),
    JAVA("java"),
    PYTHON("python"),
    JS("java script");

    private final String name;

    Subject(String name) {
        this.name = name;
    }
}
