package com.bancodesangue.hemocentro.medico.dto;

import com.bancodesangue.hemocentro.medico.model.Medico;

import java.util.List;
import java.util.stream.Collectors;

public record MedicoDTO(String nome, String especialidade, String crm, String endereco, String telefone, String email, String dataNascimento, String dataCadastro) {

    public static MedicoDTO fromMedico(Medico medico){
        return new MedicoDTO(medico.getNome(), medico.getEspecialidade(), medico.getCrm(), medico.getEndereco(), medico.getTelefone(), medico.getEmail(), medico.getDataNascimento(), medico.getDataCadastro());
        }

    public static List<MedicoDTO> converter(List<Medico> medicos){
        return medicos.stream().map(MedicoDTO::fromMedico).collect(Collectors.toList());
    }
}


