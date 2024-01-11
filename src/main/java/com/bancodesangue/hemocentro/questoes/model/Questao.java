package com.bancodesangue.hemocentro.questoes.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "questao")
@Getter
@Setter
public class Questao {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_questao")
    private Long id;

    private String pergunta;

    private String opcaoA;

    private String opcaoB;

    private String opcaoC;

    private String opcaoD;

    private String respostaCorreta;

    private Long score;
}
