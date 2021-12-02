package com.example.demo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "login")
public class Login {

    @Id
    private String id;
    private String username;
    private String password;
}
