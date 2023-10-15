package com.Anish.Instagram.Basic.Design.controller;


import com.Anish.Instagram.Basic.Design.model.User;
import com.Anish.Instagram.Basic.Design.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")

public class UserController {
    @Autowired
     UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<User> signUp(@RequestBody User user) {
        User createdUser = userService.createUser(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    @PostMapping("/signin")
    public ResponseEntity<User> signIn(@RequestParam String email, @RequestParam String password) throws Exception {
        User signedInUser = userService.signIn(email, password);
        return new ResponseEntity<>(signedInUser, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        User updatedUser = userService.updateUser(user);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }
}
