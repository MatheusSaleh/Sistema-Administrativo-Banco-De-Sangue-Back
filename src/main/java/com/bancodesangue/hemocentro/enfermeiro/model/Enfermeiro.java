package com.bancodesangue.hemocentro.enfermeiro.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "enfermeiro")
@Getter
@Setter
public class Enfermeiro {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_enfermeiro")
    private Long id;

    private String coren;

    private String nomeCompleto;

    private String dataNascimento;

    private String dataContratacao;
}
