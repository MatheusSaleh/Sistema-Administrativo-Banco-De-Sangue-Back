package com.bancodesangue.hemocentro.doacao.model;

import com.bancodesangue.hemocentro.doador.model.Doador;
import com.bancodesangue.hemocentro.enfermeiro.model.Enfermeiro;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "doacao")
@Getter
@Setter
public class Doacao {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "id_doacao")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_enfermeiro")
    private Enfermeiro enfermeiro;

    @ManyToOne
    @JoinColumn(name = "id_doador")
    private Doador doador;

    private String dataDoacao;

    private String tipoDoacao;

    private String statusDoacao;
}
