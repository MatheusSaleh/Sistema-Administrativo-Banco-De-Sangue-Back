package com.bancodesangue.hemocentro.receptor.service;

import com.bancodesangue.hemocentro.receptor.dto.ReceptorDTO;
import com.bancodesangue.hemocentro.receptor.model.Receptor;
import com.bancodesangue.hemocentro.receptor.repository.ReceptorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceptorService {

    @Autowired
    ReceptorRepository receptorRepository;

    public ResponseEntity<List<ReceptorDTO>> listarReceptores(){
        List<Receptor> receptores = receptorRepository.findAll();
        return ResponseEntity.ok(ReceptorDTO.converter(receptores));
    }

}
