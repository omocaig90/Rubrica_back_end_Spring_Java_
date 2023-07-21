package com.example.rubrica.db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rubrica.db.entity.Rubrica;
import com.example.rubrica.db.entity.RubricaRequest;
import com.example.rubrica.db.entity.UpdateRubricaRequest;
import com.example.rubrica.repository.RubricaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class RubricaService {

    private final RubricaRepository rubricaRepository;

    @Autowired
    public RubricaService(RubricaRepository rubricaRepository) {
        this.rubricaRepository = rubricaRepository;
    }

    public List<Rubrica> getAllRubrica() {
        return rubricaRepository.findAll();
    }
    
    public Rubrica createRubrica(RubricaRequest request) {
        Rubrica rubrica = new Rubrica();
        rubrica.setNome(request.getNome());
        rubrica.setCognome(request.getCognome());
        rubrica.setSesso(request.getSesso());
        rubrica.setdata_di_nascita(request.getdata_di_nascita());
        rubrica.setnumero_di_telefono(request.getnumero_di_telefono());
        rubrica.setEmail(request.getEmail());
        rubrica.setCitta(request.getCitta());
        return rubricaRepository.save(rubrica);
    }
    
    public boolean deleteRubrica(Long id) {
        if (rubricaRepository.existsById(id)) {
            rubricaRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
    
    public boolean updateRubrica(UpdateRubricaRequest request) {
        Optional<Rubrica> rubricaOpt = rubricaRepository.findById(request.getId());
        if (!rubricaOpt.isPresent()) {
            return false;
        }
        Rubrica rubrica = rubricaOpt.get();
        rubrica.setNome(request.getNome());
        rubrica.setCognome(request.getCognome());
        rubrica.setSesso(request.getSesso());
        rubrica.setdata_di_nascita(request.getdata_di_nascita());
        rubrica.setnumero_di_telefono(request.getnumero_di_telefono());
        rubrica.setEmail(request.getEmail());
        rubrica.setCitta(request.getCitta());
        rubricaRepository.save(rubrica);
        return true;
    }
}
