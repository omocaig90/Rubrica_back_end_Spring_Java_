package com.example.rubrica.db.service;

import com.example.rubrica.db.entity.LoginRequest;
import com.example.rubrica.db.entity.Utente;
import com.example.rubrica.repository.UtenteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UtenteRepository utenteRepository;

    public boolean login(LoginRequest request) {
        Optional<Utente> user = utenteRepository.findByUsernameAndPassword(request.getUsername(), request.getPassword());
        return user.isPresent();
    }
}
