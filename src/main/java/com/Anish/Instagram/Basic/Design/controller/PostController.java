package com.Anish.Instagram.Basic.Design.controller;


import com.Anish.Instagram.Basic.Design.model.Post;
import com.Anish.Instagram.Basic.Design.model.User;
import com.Anish.Instagram.Basic.Design.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    @Autowired
     PostService postService;

    @PostMapping("/save")
    public ResponseEntity<Post> savePost(@RequestBody Post post) {
        Post savedPost = postService.savePost(post);
        return new ResponseEntity<>(savedPost, HttpStatus.CREATED);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Post>> getPostsByUser(@PathVariable Long userId) {
        User user = new User();
        user.setId(userId);
        List<Post> posts = postService.getPostsByUser(user);
        return new ResponseEntity<>(posts, HttpStatus.OK);
    }
}
