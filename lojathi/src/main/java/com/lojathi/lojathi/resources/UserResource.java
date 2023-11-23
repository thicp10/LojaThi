package com.lojathi.lojathi.resources;

import com.lojathi.lojathi.entities.User;
import jakarta.persistence.Id;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(3L,"Moh","monica@gmail.com","11949183932","123456");
        return ResponseEntity.ok().body(u);
    }


}
