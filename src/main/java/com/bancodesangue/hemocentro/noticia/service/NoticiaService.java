package com.bancodesangue.hemocentro.noticia.service;

import com.bancodesangue.hemocentro.noticia.dto.NoticiaDTO;
import com.bancodesangue.hemocentro.noticia.model.Noticia;
import com.bancodesangue.hemocentro.noticia.repository.NoticiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticiaService {

    @Autowired
    NoticiaRepository noticiaRepository;

    public ResponseEntity<List<NoticiaDTO>> listarNoticias(){
        List<Noticia> noticias = noticiaRepository.findAll();
        return ResponseEntity.ok(NoticiaDTO.converter(noticias));
    }
}
