package com.bancodesangue.hemocentro.enfermeiro.dto;

import com.bancodesangue.hemocentro.enfermeiro.model.Enfermeiro;

import java.util.List;
import java.util.stream.Collectors;

public record EnfermeiroDTO(String coren, String nomeCompleto, String dataNascimento, String dataContratacao) {
    public static EnfermeiroDTO fromEnfermeiro(Enfermeiro enfermeiro){
        return new EnfermeiroDTO(enfermeiro.getCoren(), enfermeiro.getNomeCompleto(), enfermeiro.getDataNascimento(), enfermeiro.getDataContratacao());
    }

    public static List<EnfermeiroDTO> converter(List<Enfermeiro> enfermeiros){
        return enfermeiros.stream().map(EnfermeiroDTO::fromEnfermeiro).collect(Collectors.toList());
    }
}
