package com.bancodesangue.hemocentro.doador.dto;

import com.bancodesangue.hemocentro.doador.model.Doador;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public record DoadorDTO(String nomeCompleto, String email, String dataNascimento, BigDecimal pontuacao, Long nivel) {

    public static DoadorDTO fromDoador(Doador doador){
        return new DoadorDTO(doador.getNomeCompleto(), doador.getEmail(), doador.getDataNascimento(), doador.getPontuacao(), doador.getNivel());
    }

    public static List<DoadorDTO> converter(List<Doador> doadores){
        return doadores.stream().map(DoadorDTO::fromDoador).collect(Collectors.toList());
    }
}
