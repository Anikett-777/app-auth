package com.org.auth.auth_app_backend.repositories;

import com.org.auth.auth_app_backend.entities.User;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

//@Autowired
public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findByEmail(String email);
    boolean existByEmail(String email);
}
