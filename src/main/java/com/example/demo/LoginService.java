package com.example.demo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    public Login addUser(Login login){
        return loginRepository.save(login);
    }
}
