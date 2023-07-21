package com.example.rubrica.presentation.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rubrica.db.service.CittaService;

import java.util.List;

@RestController
@RequestMapping("/citta")
public class CittaController {

    @Autowired
    private CittaService cittaService;

    @GetMapping
    public ResponseEntity<List<String>> getAllCitta() {
        return ResponseEntity.ok().body(cittaService.getAllCitta());
    }
}
