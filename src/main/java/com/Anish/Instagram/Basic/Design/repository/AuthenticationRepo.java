package com.Anish.Instagram.Basic.Design.repository;

import com.Anish.Instagram.Basic.Design.model.AuthenticationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthenticationRepo extends JpaRepository<AuthenticationToken,Long> {
}
