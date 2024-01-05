package com.bancodesangue.hemocentro.noticia.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "noticia")
@Getter
@Setter
public class Noticia {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_noticia")
    private Long id;

    private String nomeAutor;

    private String noticia;

    private String resumo;

    private String titulo;
}
