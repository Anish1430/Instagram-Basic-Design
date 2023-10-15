package com.Anish.Instagram.Basic.Design.controller;

import com.Anish.Instagram.Basic.Design.repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @Autowired
    PostRepo postRepo;
}
