package com.bancodesangue.hemocentro.medico.service;

import com.bancodesangue.hemocentro.medico.dto.MedicoDTO;
import com.bancodesangue.hemocentro.medico.model.Medico;
import com.bancodesangue.hemocentro.medico.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoService {

    @Autowired
    MedicoRepository medicoRepository;

    public ResponseEntity<List<MedicoDTO>> listarMedicos(){
        List<Medico> medicos = medicoRepository.findAll();
        return ResponseEntity.ok(MedicoDTO.converter(medicos));
    }
}
