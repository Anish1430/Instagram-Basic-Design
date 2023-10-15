package com.Anish.Instagram.Basic.Design.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
    public class SignInRequest {

        private String email;
        private String password;

        // Getters and setters
    }

