package com.bancodesangue.hemocentro.questoes.service;

import com.bancodesangue.hemocentro.questoes.dto.QuestaoDTO;
import com.bancodesangue.hemocentro.questoes.model.Questao;
import com.bancodesangue.hemocentro.questoes.repository.QuestaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestaoService {

    @Autowired
    QuestaoRepository questaoRepository;

    public ResponseEntity<List<QuestaoDTO>> listarQuestoes(){
        List<Questao> questoes = questaoRepository.findAll();
        return ResponseEntity.ok(QuestaoDTO.converter(questoes));
    }
}
