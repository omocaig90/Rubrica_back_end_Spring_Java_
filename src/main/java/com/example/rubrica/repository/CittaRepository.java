package com.example.rubrica.repository;

import com.example.rubrica.db.entity.Citta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CittaRepository extends JpaRepository<Citta, Long> {
    @Query("SELECT c.nome FROM Citta c ORDER BY c.nome ASC")
    List<String> findNomeByOrderByNomeAsc();
}
