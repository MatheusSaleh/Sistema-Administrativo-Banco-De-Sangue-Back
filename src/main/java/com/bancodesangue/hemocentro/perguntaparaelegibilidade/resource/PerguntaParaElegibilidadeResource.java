package com.bancodesangue.hemocentro.perguntaparaelegibilidade.resource;

import com.bancodesangue.hemocentro.perguntaparaelegibilidade.dto.PerguntaDTO;
import com.bancodesangue.hemocentro.perguntaparaelegibilidade.service.PerguntaParaElegibilidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/perguntas-para-elegibilidade")
@RestController
public class PerguntaParaElegibilidadeResource {

    @Autowired
    private PerguntaParaElegibilidadeService perguntaParaElegibilidadeService;

    @GetMapping
    public ResponseEntity<List<PerguntaDTO>> listarPerguntas(){
        return this.perguntaParaElegibilidadeService.listarPerguntas();
    }
}
