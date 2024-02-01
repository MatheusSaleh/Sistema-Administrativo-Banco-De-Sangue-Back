package com.bancodesangue.hemocentro.medico.resource;

import com.bancodesangue.hemocentro.medico.dto.MedicoDTO;
import com.bancodesangue.hemocentro.medico.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/medicos")
@RestController
public class MedicoResource {

    @Autowired
    private MedicoService medicoService;

    @GetMapping
    public ResponseEntity<List<MedicoDTO>> listarMedicos(){
        return this.medicoService.listarMedicos();
    }
}
