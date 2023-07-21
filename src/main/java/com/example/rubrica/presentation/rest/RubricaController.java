package com.example.rubrica.presentation.rest;

import com.example.rubrica.db.entity.DeleteRubricaRequest;
import com.example.rubrica.db.entity.Rubrica;
import com.example.rubrica.db.entity.RubricaRequest;
import com.example.rubrica.db.entity.UpdateRubricaRequest;
import com.example.rubrica.db.service.RubricaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rubrica")
public class RubricaController {

    @Autowired
    private RubricaService rubricaService;

    @GetMapping
    public ResponseEntity<List<Rubrica>> getAllRubrica() {
        return ResponseEntity.ok().body(rubricaService.getAllRubrica());
    }

    @PostMapping
    public ResponseEntity<?> createRubrica(@RequestBody RubricaRequest request) {
        try {
            Rubrica rubrica = rubricaService.createRubrica(request);
            return new ResponseEntity<>(rubrica, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @DeleteMapping
    public ResponseEntity<?> deleteRubrica(@RequestBody DeleteRubricaRequest request) {
        if (rubricaService.deleteRubrica(request.getId())) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Error: Not found", HttpStatus.NOT_FOUND);
        }
    }
    
    @PutMapping
    public ResponseEntity<?> updateRubrica(@RequestBody UpdateRubricaRequest request) {
        if (rubricaService.updateRubrica(request)) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Error: Not found", HttpStatus.NOT_FOUND);
        }
    }
}
