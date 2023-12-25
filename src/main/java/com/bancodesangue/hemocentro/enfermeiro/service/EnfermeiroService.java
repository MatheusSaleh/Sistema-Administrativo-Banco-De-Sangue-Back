package com.bancodesangue.hemocentro.enfermeiro.service;


import com.bancodesangue.hemocentro.enfermeiro.dto.EnfermeiroDTO;
import com.bancodesangue.hemocentro.enfermeiro.model.Enfermeiro;
import com.bancodesangue.hemocentro.enfermeiro.repository.EnfermeiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnfermeiroService {
    @Autowired
    EnfermeiroRepository enfermeiroRepository;

    public ResponseEntity<List<EnfermeiroDTO>> listarEnfermeiros(){
        List<Enfermeiro> enfermeiros = enfermeiroRepository.findAll();
        return ResponseEntity.ok(EnfermeiroDTO.converter(enfermeiros));
    }
}
