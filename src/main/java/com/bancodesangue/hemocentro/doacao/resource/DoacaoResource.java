package com.bancodesangue.hemocentro.doacao.resource;

import com.bancodesangue.hemocentro.doacao.dto.DoacaoDTO;
import com.bancodesangue.hemocentro.doacao.service.DoacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/doacoes")
@RestController
public class DoacaoResource {
    @Autowired
    private DoacaoService doacaoService;

    @GetMapping
    public ResponseEntity<List<DoacaoDTO>> listarDoacoes(){
        return this.doacaoService.listarDoacoes();
    }
}
