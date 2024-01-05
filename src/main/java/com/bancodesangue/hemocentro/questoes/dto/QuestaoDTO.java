package com.bancodesangue.hemocentro.questoes.dto;

import com.bancodesangue.hemocentro.questoes.model.Questao;

import java.util.List;
import java.util.stream.Collectors;

public record QuestaoDTO(String pergunta, String opcaoA, String opcaoB, String opcaoC, String opcaoD, String respostaCorreta) {

    public static QuestaoDTO fromQuestao(Questao questao){
        return new QuestaoDTO(questao.getPergunta(), questao.getOpcaoA(), questao.getOpcaoB(), questao.getOpcaoC(), questao.getOpcaoD(), questao.getRespostaCorreta());
    }

    public static List<QuestaoDTO> converter(List<Questao> questoes){
        return questoes.stream().map(QuestaoDTO::fromQuestao).collect(Collectors.toList());
    }
}
