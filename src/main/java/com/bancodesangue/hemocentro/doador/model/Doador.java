package com.bancodesangue.hemocentro.doador.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "doador")
@Getter
@Setter
public class Doador {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "id_doador")
    private Long id;

    private String nomeCompleto;

    private String email;

    private String dataNascimento;

    private BigDecimal pontuacao;

    private Long nivel;
}
