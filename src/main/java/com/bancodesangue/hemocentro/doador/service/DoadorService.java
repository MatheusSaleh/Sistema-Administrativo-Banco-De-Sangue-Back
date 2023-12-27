package com.bancodesangue.hemocentro.doador.service;

import com.bancodesangue.hemocentro.doador.dto.DoadorDTO;
import com.bancodesangue.hemocentro.doador.model.Doador;
import com.bancodesangue.hemocentro.doador.repository.DoadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoadorService {

    @Autowired
    DoadorRepository doadorRepository;

    public ResponseEntity<List<DoadorDTO>> listarDoadores(){
        List<Doador> doadores = doadorRepository.findAll();

        return ResponseEntity.ok(DoadorDTO.converter(doadores));
    }
}
