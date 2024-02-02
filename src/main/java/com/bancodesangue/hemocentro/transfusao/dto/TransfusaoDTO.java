package com.bancodesangue.hemocentro.transfusao.dto;

import com.bancodesangue.hemocentro.doador.model.Doador;
import com.bancodesangue.hemocentro.medico.model.Medico;
import com.bancodesangue.hemocentro.receptor.model.Receptor;
import com.bancodesangue.hemocentro.transfusao.model.Transfusao;

import java.util.List;
import java.util.stream.Collectors;

public record TransfusaoDTO(Doador doador, Receptor receptor, Medico medico, String dataHoraTransfusao, String tipoSangueDoador, String quantidadeTransfusa, String componentesSanguineos, String medicoResponsavel, String localTransfusao) {

    public static TransfusaoDTO fromTransfusao(Transfusao transfusao){
        return new TransfusaoDTO(transfusao.getDoador(), transfusao.getReceptor(), transfusao.getMedico(), transfusao.getDataHoraTransfusao(), transfusao.getTipoSangueDoador(), transfusao.getQuantidadeTransfusa(), transfusao.getComponentesSanguineos(), transfusao.getMedicoResponsavel(), transfusao.getLocalTransfusao());
    }

    public static List<TransfusaoDTO> converter(List<Transfusao> transfusoes){
        return transfusoes.stream().map(TransfusaoDTO::fromTransfusao).collect(Collectors.toList());
    }
}
