package com.mateus.java_api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Document("user")
@AllArgsConstructor
@Data
public class UserModel{
    @Id
    private String id;
    private String name;
    private short age;
}