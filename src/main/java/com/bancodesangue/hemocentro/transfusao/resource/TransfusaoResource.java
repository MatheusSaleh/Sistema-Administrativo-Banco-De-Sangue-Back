package com.bancodesangue.hemocentro.transfusao.resource;

import com.bancodesangue.hemocentro.transfusao.dto.TransfusaoDTO;
import com.bancodesangue.hemocentro.transfusao.service.TransfusaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/transfusoes")
@RestController
public class TransfusaoResource {

    @Autowired
    private TransfusaoService transfusaoService;

    @GetMapping
    public ResponseEntity<List<TransfusaoDTO>> listarTransfusoes(){
        return this.transfusaoService.listarTransfusoes();
    }
}
