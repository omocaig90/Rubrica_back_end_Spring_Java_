package com.example.rubrica.repository;

import com.example.rubrica.db.entity.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UtenteRepository extends JpaRepository<Utente, Long> {
    Optional<Utente> findByUsernameAndPassword(String username, String password);
}

