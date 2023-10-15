package com.Anish.Instagram.Basic.Design.controller;

import com.Anish.Instagram.Basic.Design.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    @Autowired
    AuthenticationService authenticationService;

}
