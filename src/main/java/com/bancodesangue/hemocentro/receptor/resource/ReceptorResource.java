package com.bancodesangue.hemocentro.receptor.resource;

import com.bancodesangue.hemocentro.receptor.dto.ReceptorDTO;
import com.bancodesangue.hemocentro.receptor.service.ReceptorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/receptores")
@RestController
public class ReceptorResource {

    @Autowired
    private ReceptorService receptorService;

    @GetMapping
    public ResponseEntity<List<ReceptorDTO>> listarReceptores(){
        return this.receptorService.listarReceptores();
    }
}
