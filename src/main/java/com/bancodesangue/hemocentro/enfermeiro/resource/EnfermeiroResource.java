package com.bancodesangue.hemocentro.enfermeiro.resource;

import com.bancodesangue.hemocentro.enfermeiro.dto.EnfermeiroDTO;
import com.bancodesangue.hemocentro.enfermeiro.service.EnfermeiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/enfermeiros")
@RestController
public class EnfermeiroResource {
    @Autowired
    private EnfermeiroService enfermeiroService;

    @GetMapping
    public ResponseEntity<List<EnfermeiroDTO>> listarEnfermeiros(){
        return this.enfermeiroService.listarEnfermeiros();
    }
}
