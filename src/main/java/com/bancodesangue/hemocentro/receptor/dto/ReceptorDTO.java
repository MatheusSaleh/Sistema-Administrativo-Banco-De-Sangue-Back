package com.bancodesangue.hemocentro.receptor.dto;

import com.bancodesangue.hemocentro.receptor.model.Receptor;

import java.util.List;
import java.util.stream.Collectors;

public record ReceptorDTO(String nomeCompleto, String email, String dataNascimento) {

    public static ReceptorDTO fromReceptor(Receptor receptor){
        return new ReceptorDTO(receptor.getNomeCompleto(), receptor.getEmail(), receptor.getDataNascimento());
    }

    public static List<ReceptorDTO> converter(List<Receptor> receptores){
        return receptores.stream().map(ReceptorDTO::fromReceptor).collect(Collectors.toList());
    }
}
