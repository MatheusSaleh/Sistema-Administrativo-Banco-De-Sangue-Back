package com.bancodesangue.hemocentro.doador.resource;

import com.bancodesangue.hemocentro.doador.dto.DoadorDTO;
import com.bancodesangue.hemocentro.doador.service.DoadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/doadores")
@RestController
public class DoadorResource {

    @Autowired
    private DoadorService doadorService;

    @GetMapping
    public ResponseEntity<List<DoadorDTO>> listarDoadores(){
        return this.doadorService.listarDoadores();
    }
}
