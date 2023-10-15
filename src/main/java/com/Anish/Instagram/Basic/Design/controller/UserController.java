package com.Anish.Instagram.Basic.Design.controller;

import com.Anish.Instagram.Basic.Design.model.AuthenticationToken;
import com.Anish.Instagram.Basic.Design.model.User;
import com.Anish.Instagram.Basic.Design.service.ResourceNotFoundException;
import com.Anish.Instagram.Basic.Design.service.SignInRequest;
import com.Anish.Instagram.Basic.Design.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
     UserService userService;

    @PostMapping("/sign-up")
    public ResponseEntity<User> signUp(@RequestBody User user) {
        User createdUser = userService.signUp(user);
        return ResponseEntity.ok(createdUser);
    }

    @PostMapping("/sign-in")
    public ResponseEntity<AuthenticationToken> signIn(@RequestBody SignInRequest request) throws ResourceNotFoundException {
        AuthenticationToken authToken = userService.signIn(request);
        return ResponseEntity.ok(authToken);
    }

    @PutMapping("/update-details/{userId}")
    public ResponseEntity<User> updateDetails(@PathVariable Long userId, @RequestBody User updatedUser) throws ResourceNotFoundException {
        User updatedUserInfo = userService.updateDetails(userId, updatedUser);
        return ResponseEntity.ok(updatedUserInfo);
    }

    @GetMapping("/get-all-Users")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }
}
