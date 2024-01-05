package com.bancodesangue.hemocentro.noticia.dto;

import com.bancodesangue.hemocentro.noticia.model.Noticia;

import java.util.List;
import java.util.stream.Collectors;

public record NoticiaDTO(String nomeAutor, String noticia, String resumo, String titulo) {

    public static NoticiaDTO fromNoticia(Noticia noticia){
        return new NoticiaDTO(noticia.getNomeAutor(), noticia.getNoticia(), noticia.getResumo(), noticia.getTitulo());
    }

    public static List<NoticiaDTO> converter(List<Noticia> noticias){
        return noticias.stream().map(NoticiaDTO::fromNoticia).collect(Collectors.toList());
    }
}
