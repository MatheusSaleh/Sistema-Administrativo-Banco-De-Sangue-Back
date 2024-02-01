package com.bancodesangue.hemocentro.medico.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "medico")
@Getter
@Setter
public class Medico {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String nome;

    private String especialidade;

    private String crm;

    private String endereco;

    private String telefone;

    private String email;

    @Column(name = "data_nascimento")
    private String dataNascimento;

    @Column(name = "data_cadastro")
    private String dataCadastro;
}
