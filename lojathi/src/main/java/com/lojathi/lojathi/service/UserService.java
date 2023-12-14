package com.lojathi.lojathi.service;

import com.lojathi.lojathi.entities.User;
import com.lojathi.lojathi.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepositories repositories;

    public List<User> finAll(){
       return repositories.findAll();
    }
}
