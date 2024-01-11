package com.bancodesangue.hemocentro.equipamento_medico.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "equipamento_medico")
@Getter
@Setter
public class EquipamentoMedico {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "equipamento_id")
    private Long id;

    @Column(name = "nome_equipamento")
    private String nomeEquipamento;

    @Column(name = "numero_serie")
    private String numeroSerie;

    private String fabricante;

    private String modelo;

    @Column(name = "data_fabricacao")
    private LocalDate dataFabricacao;

    @Column(name = "data_aquisicao")
    private LocalDate dataAquisicao;

    @Column(name = "data_ultima_manutencao")
    private LocalDate dataUltimaManutencao;

    @Column(name = "status_manutencao")
    private String statusManutencao;

    private String localizacao;

    private String condicao;

    private String certificacoes;

    @Column(name = "historico_manutencao")
    private String historicoManutencao;

    @Column(name = "custo_manutencao")
    private String custoManutencao;

    private LocalDate calibracao;

    @Column(name = "documentacao_tecnica")
    private String documentacaoTecnica;
}
