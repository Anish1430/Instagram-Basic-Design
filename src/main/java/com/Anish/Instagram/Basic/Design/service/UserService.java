package com.Anish.Instagram.Basic.Design.service;

import com.Anish.Instagram.Basic.Design.model.User;
import com.Anish.Instagram.Basic.Design.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User createUser(User user);
    User signIn(String email, String password) throws Exception;
    User updateUser(User user);
}
