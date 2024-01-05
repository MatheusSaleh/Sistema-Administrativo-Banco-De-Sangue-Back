package com.bancodesangue.hemocentro.questoes.resource;

import com.bancodesangue.hemocentro.questoes.dto.QuestaoDTO;
import com.bancodesangue.hemocentro.questoes.service.QuestaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/questoes")
@RestController
public class QuestaoResource {

    @Autowired
    private QuestaoService questaoService;

    @GetMapping
    public ResponseEntity<List<QuestaoDTO>> listarQuestoes(){
        return this.questaoService.listarQuestoes();
    }
}
