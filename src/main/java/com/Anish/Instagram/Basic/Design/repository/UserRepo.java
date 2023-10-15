package com.Anish.Instagram.Basic.Design.repository;

import com.Anish.Instagram.Basic.Design.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
    User findByEmail(String email);
}
