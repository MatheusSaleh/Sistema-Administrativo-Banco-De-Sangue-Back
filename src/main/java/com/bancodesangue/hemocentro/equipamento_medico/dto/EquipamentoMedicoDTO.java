package com.bancodesangue.hemocentro.equipamento_medico.dto;

import com.bancodesangue.hemocentro.equipamento_medico.model.EquipamentoMedico;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public record EquipamentoMedicoDTO(String nomeEquipamento, String numeroSerie, String fabricante, String modelo, LocalDate dataFabricacao, LocalDate dataAquisicao, LocalDate dataUltimaManutencao, String statusManutencao, String localizacao, String condicacao, String certificacoes, String historicoManutencao, String custoManutencao, LocalDate calibracao, String documentacaoTecnica) {

    public static EquipamentoMedicoDTO fromEquipamento(EquipamentoMedico equipamentoMedico){
        return new EquipamentoMedicoDTO(equipamentoMedico.getNomeEquipamento(), equipamentoMedico.getNumeroSerie(), equipamentoMedico.getFabricante(), equipamentoMedico.getModelo(), equipamentoMedico.getDataFabricacao(), equipamentoMedico.getDataAquisicao(), equipamentoMedico.getDataUltimaManutencao(), equipamentoMedico.getStatusManutencao(), equipamentoMedico.getLocalizacao(), equipamentoMedico.getCondicao(), equipamentoMedico.getCertificacoes(), equipamentoMedico.getHistoricoManutencao(), equipamentoMedico.getCustoManutencao(), equipamentoMedico.getCalibracao(), equipamentoMedico.getDocumentacaoTecnica());
    }

    public static List<EquipamentoMedicoDTO> converter(List<EquipamentoMedico> equipamentos){
        return equipamentos.stream().map(EquipamentoMedicoDTO::fromEquipamento).collect(Collectors.toList());
    }
}
