package com.bancodesangue.hemocentro.noticia.resource;

import com.bancodesangue.hemocentro.noticia.dto.NoticiaDTO;
import com.bancodesangue.hemocentro.noticia.service.NoticiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/noticias")
@RestController
public class NoticiaResource {

    @Autowired
    private NoticiaService noticiaService;

    @GetMapping
    public ResponseEntity<List<NoticiaDTO>> listarNoticias(){
        return this.noticiaService.listarNoticias();
    }
}
