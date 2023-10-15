package com.Anish.Instagram.Basic.Design.repository;

import com.Anish.Instagram.Basic.Design.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Long> {

    Optional<User> findByEmail(String email);
}
