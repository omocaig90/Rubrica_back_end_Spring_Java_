package com.example.rubrica.presentation.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rubrica.db.entity.LoginRequest;
import com.example.rubrica.db.service.UserService;

@RestController
@RequestMapping("/login")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<Void> login(@RequestBody LoginRequest request) {
        boolean loginSuccessful = userService.login(request);
        if(loginSuccessful) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}

