package com.bancodesangue.hemocentro.equipamento_medico.resource;

import com.bancodesangue.hemocentro.equipamento_medico.dto.EquipamentoMedicoDTO;
import com.bancodesangue.hemocentro.equipamento_medico.service.EquipamentoMedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/equipamentos")
@RestController
public class EquipamentoMedicoResource {

    @Autowired
    private EquipamentoMedicoService equipamentoMedicoService;

    @GetMapping
    public ResponseEntity<List<EquipamentoMedicoDTO>> listarEquipamentos(){
        return this.equipamentoMedicoService.listarEquipamentos();
    }
}
