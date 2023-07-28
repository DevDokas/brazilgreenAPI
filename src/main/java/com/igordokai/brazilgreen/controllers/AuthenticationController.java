package com.igordokai.brazilgreen.controllers;

import com.igordokai.brazilgreen.config.security.UserRole;
import com.igordokai.brazilgreen.dto.AuthenticationDTO;
import com.igordokai.brazilgreen.dto.RegisterDTO;
import com.igordokai.brazilgreen.entities.Users;
import com.igordokai.brazilgreen.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("auth")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class AuthenticationController {

    @Autowired
    private UsersRepository repository;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody @Valid AuthenticationDTO data) {
        var usernamePassword = new UsernamePasswordAuthenticationToken(data.getLogin(), data.getPassword());
        var auth = authenticationManager.authenticate(usernamePassword);

        return ResponseEntity.ok().build();
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody @Valid RegisterDTO data) {
        if (this.repository.findByLogin(data.getLogin()) != null) {
            return ResponseEntity.badRequest().build();
        }

        String encryptedPassword = new BCryptPasswordEncoder().encode(data.getPassword());
        Users newUser = new Users(data.getId(), data.getLogin(), encryptedPassword, data.getRole());

        this.repository.save(newUser);

        return ResponseEntity.ok().build();
    }
}
