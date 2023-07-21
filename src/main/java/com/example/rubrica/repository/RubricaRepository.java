package com.example.rubrica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.rubrica.db.entity.Rubrica;

@Repository
public interface RubricaRepository extends JpaRepository<Rubrica, Long> {
}

