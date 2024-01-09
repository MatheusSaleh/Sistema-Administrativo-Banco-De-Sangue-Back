package com.bancodesangue.hemocentro.perguntaparaelegibilidade.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "pergunta_para_elegibilidade")
@Getter
@Setter
public class PerguntaParaElegibilidade {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pergunta")
    private Long id;

    private String titulo;

    private String pergunta;

    private String opcao1;

    private String opcao2;

    private String respostaCorreta;
}
