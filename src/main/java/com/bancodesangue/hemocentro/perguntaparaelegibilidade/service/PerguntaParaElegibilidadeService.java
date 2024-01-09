package com.bancodesangue.hemocentro.perguntaparaelegibilidade.service;

import com.bancodesangue.hemocentro.perguntaparaelegibilidade.dto.PerguntaDTO;
import com.bancodesangue.hemocentro.perguntaparaelegibilidade.model.PerguntaParaElegibilidade;
import com.bancodesangue.hemocentro.perguntaparaelegibilidade.repository.PerguntaParaElegibilidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerguntaParaElegibilidadeService {

    @Autowired
    PerguntaParaElegibilidadeRepository perguntaParaElegibilidadeRepository;

    public ResponseEntity<List<PerguntaDTO>> listarPerguntas(){
        List<PerguntaParaElegibilidade> perguntas = perguntaParaElegibilidadeRepository.findAll();
        return ResponseEntity.ok(PerguntaDTO.converter(perguntas));
    }
}
