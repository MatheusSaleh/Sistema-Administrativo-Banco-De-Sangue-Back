package com.bancodesangue.hemocentro.doacao.service;

import com.bancodesangue.hemocentro.doacao.dto.DoacaoDTO;
import com.bancodesangue.hemocentro.doacao.model.Doacao;
import com.bancodesangue.hemocentro.doacao.repository.DoacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoacaoService {

    @Autowired
    DoacaoRepository doacaoRepository;

    public ResponseEntity<List<DoacaoDTO>> listarDoacoes(){
        List<Doacao> doacoes = doacaoRepository.findAll();
        return ResponseEntity.ok(DoacaoDTO.converter(doacoes));
    }
}
