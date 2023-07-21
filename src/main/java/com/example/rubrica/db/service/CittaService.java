package com.example.rubrica.db.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rubrica.db.entity.Citta;
import com.example.rubrica.repository.CittaRepository;

import java.util.List;

@Service
public class CittaService {

    @Autowired
    private CittaRepository cittaRepository;

    public List<String> getAllCitta() {
        return cittaRepository.findNomeByOrderByNomeAsc();
    }
}