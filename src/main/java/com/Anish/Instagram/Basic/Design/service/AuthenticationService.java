package com.Anish.Instagram.Basic.Design.service;

import com.Anish.Instagram.Basic.Design.model.AuthenticationToken;
import com.Anish.Instagram.Basic.Design.model.User;
import com.Anish.Instagram.Basic.Design.repository.AuthenticationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class AuthenticationService {
    @Autowired
     AuthenticationRepo authenticationrepo;
}
