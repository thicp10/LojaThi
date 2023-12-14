package com.lojathi.lojathi.config;

import com.lojathi.lojathi.entities.User;
import com.lojathi.lojathi.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.ArrayList;
import java.util.Arrays;

@Configuration
@Profile("teste")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepositories userRepositories;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(1L, "Thiago", "thicp10@outlook.com", "1112123213", "1256");
        User u2 = new User(2L,"David","David@amazon,com","3613836818","282828");

        userRepositories.saveAll(Arrays.asList(u1,u2));

    }
}
