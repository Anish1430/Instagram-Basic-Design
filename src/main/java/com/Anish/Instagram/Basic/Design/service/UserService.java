package com.Anish.Instagram.Basic.Design.service;


import com.Anish.Instagram.Basic.Design.model.AuthenticationToken;
import com.Anish.Instagram.Basic.Design.model.User;
import com.Anish.Instagram.Basic.Design.repository.AuthenticationRepo;
import com.Anish.Instagram.Basic.Design.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class UserService {
    @Autowired
     UserRepo userRepo;

    @Autowired
     AuthenticationRepo authenticationRepo;

    public User signUp(User user) {
        return userRepo.save(user);
    }


    public AuthenticationToken signIn(SignInRequest request) throws ResourceNotFoundException {
        String email = request.getEmail();
        String password = request.getPassword(); // Assuming you have a password field in User model

        // Add authentication logic here, for example, check if the email and password match
          User user = userRepo.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            // Generate and save authentication token
            AuthenticationToken authToken = new AuthenticationToken();
            authToken.setToken("generated_token_here");
            authToken.setTokenCreationDate(LocalDate.now());
            authToken.setUser(user);
            return authenticationRepo.save(authToken);
        } else {
            throw new ResourceNotFoundException("Invalid email or password");
        }
    }


        public User updateDetails(Long userId, User updatedUser) throws ResourceNotFoundException {
        User existingUser = userRepo.findById(userId).orElse(null);
        if (existingUser != null) {
            existingUser.setFirstName(updatedUser.getFirstName());
            existingUser.setLastName(updatedUser.getLastName());
            existingUser.setAge(updatedUser.getAge());
            existingUser.setEmail(updatedUser.getEmail());
            existingUser.setPhoneNumber(updatedUser.getPhoneNumber());
            return userRepo.save(existingUser);
        } else {
            throw new ResourceNotFoundException("User not found with id: " + userId);
        }
    }
}
