package com.bancodesangue.hemocentro.transfusao.model;

import com.bancodesangue.hemocentro.doador.model.Doador;
import com.bancodesangue.hemocentro.medico.model.Medico;
import com.bancodesangue.hemocentro.receptor.model.Receptor;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "transfusaosanguinea")
@Getter
@Setter
public class Transfusao {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transfusao")
    private Long id;

    @ManyToOne()
    @JoinColumn(name = "id_doador")
    private Doador doador;

    @ManyToOne()
    @JoinColumn(name = "id_receptor")
    private Receptor receptor;

    @ManyToOne()
    @JoinColumn(name = "id_medico")
    private Medico medico;

    @Column(name = "datahoratransfusao")
    private String dataHoraTransfusao;

    @Column(name = "tiposanguedoador")
    private String tipoSangueDoador;

    @Column(name = "quantidadetransfusa")
    private String quantidadeTransfusa;

    @Column(name = "componentessanguineos")
    private String componentesSanguineos;

    @Column(name = "medicoresponsavel")
    private String medicoResponsavel;

    @Column(name = "localtransfusao")
    private String localTransfusao;

    @Column(name = "resultadotransfusao")
    private String resultadoTransfusao;

    private String observacoes;
}
