package com.bancodesangue.hemocentro.receptor.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "receptor")
@Getter
@Setter
public class Receptor {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "receptor_id")
    private Long id;

    @Column(name = "nome_completo")
    private String nomeCompleto;

    private String email;

    @Column(name = "data_nascimento")
    private String dataNascimento;
}
