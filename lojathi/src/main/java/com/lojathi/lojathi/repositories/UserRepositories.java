package com.lojathi.lojathi.repositories;


import com.lojathi.lojathi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositories extends JpaRepository<User, Long> {
}
