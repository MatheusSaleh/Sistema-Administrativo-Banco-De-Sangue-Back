package com.bancodesangue.hemocentro.equipamento_medico.service;

import com.bancodesangue.hemocentro.equipamento_medico.dto.EquipamentoMedicoDTO;
import com.bancodesangue.hemocentro.equipamento_medico.model.EquipamentoMedico;
import com.bancodesangue.hemocentro.equipamento_medico.repository.EquipamentoMedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipamentoMedicoService {

    @Autowired
    EquipamentoMedicoRepository equipamentoMedicoRepository;

    public ResponseEntity<List<EquipamentoMedicoDTO>> listarEquipamentos(){
        List<EquipamentoMedico> equipamentos = equipamentoMedicoRepository.findAll();

        return ResponseEntity.ok(EquipamentoMedicoDTO.converter(equipamentos));
    }
}
