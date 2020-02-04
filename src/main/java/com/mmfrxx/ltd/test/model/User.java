package com.mmfrxx.ltd.test.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class User {
    private String name;
    private int age;

    public User(@JsonProperty("name") String name, @JsonProperty("age") int age){
        this.name = name;
        this.age = age;
    }

}
