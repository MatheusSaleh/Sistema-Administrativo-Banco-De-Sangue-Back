package com.bancodesangue.hemocentro.doacao.dto;

import com.bancodesangue.hemocentro.doacao.model.Doacao;
import com.bancodesangue.hemocentro.doador.model.Doador;
import com.bancodesangue.hemocentro.enfermeiro.model.Enfermeiro;

import java.util.List;
import java.util.stream.Collectors;

public record DoacaoDTO(Enfermeiro enfermeiro, Doador doador, String dataDoacao, String tipoDoacao, String statusDoacao) {

    public static DoacaoDTO fromDoacao(Doacao doacao){
        return new DoacaoDTO(doacao.getEnfermeiro(), doacao.getDoador(), doacao.getDataDoacao(), doacao.getTipoDoacao(), doacao.getStatusDoacao());
    }

    public static List<DoacaoDTO> converter(List<Doacao> doacoes){
        return doacoes.stream().map(DoacaoDTO::fromDoacao).collect(Collectors.toList());
    }
}
