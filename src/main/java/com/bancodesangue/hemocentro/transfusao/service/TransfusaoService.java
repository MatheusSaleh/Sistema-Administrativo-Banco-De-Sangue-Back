package com.bancodesangue.hemocentro.transfusao.service;

import com.bancodesangue.hemocentro.transfusao.dto.TransfusaoDTO;
import com.bancodesangue.hemocentro.transfusao.model.Transfusao;
import com.bancodesangue.hemocentro.transfusao.repository.TransfusaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransfusaoService {

    @Autowired
    TransfusaoRepository transfusaoRepository;

    public ResponseEntity<List<TransfusaoDTO>> listarTransfusoes(){
        List<Transfusao> transfusoes = transfusaoRepository.findAll();
        return ResponseEntity.ok(TransfusaoDTO.converter(transfusoes));
    }
}
