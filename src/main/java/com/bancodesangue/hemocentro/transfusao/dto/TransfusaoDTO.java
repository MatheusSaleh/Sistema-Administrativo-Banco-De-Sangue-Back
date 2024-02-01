package com.bancodesangue.hemocentro.transfusao.dto;

import com.bancodesangue.hemocentro.doador.model.Doador;
import com.bancodesangue.hemocentro.medico.model.Medico;
import com.bancodesangue.hemocentro.receptor.model.Receptor;

public record TransfusaoDTO(Doador doador, Receptor receptor, Medico medico, String dataHoraTransfusao, String tipoSangueDoador, String quantidadeTransfusa, String componentesSanguineos, String medicoResponsavel, String localTransfusao, String resultadoTransfusao, String observacoes) {

}
