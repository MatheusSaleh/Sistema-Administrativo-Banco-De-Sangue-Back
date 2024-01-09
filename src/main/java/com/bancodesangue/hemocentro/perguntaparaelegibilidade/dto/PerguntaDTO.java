package com.bancodesangue.hemocentro.perguntaparaelegibilidade.dto;

import com.bancodesangue.hemocentro.perguntaparaelegibilidade.model.PerguntaParaElegibilidade;

import java.util.List;
import java.util.stream.Collectors;

public record PerguntaDTO(String titulo, String pergunta, String opcao1, String opcao2, String respostaCorreta) {

    public static PerguntaDTO fromPergunta(PerguntaParaElegibilidade pergunta){
        return new PerguntaDTO(pergunta.getTitulo(), pergunta.getPergunta(), pergunta.getOpcao1(), pergunta.getOpcao2(), pergunta.getRespostaCorreta());
    }

    public static List<PerguntaDTO> converter(List<PerguntaParaElegibilidade> perguntas){
        return perguntas.stream().map(PerguntaDTO::fromPergunta).collect(Collectors.toList());
    }
}
