package com.bancodesangue.hemocentro.noticia.repository;

import com.bancodesangue.hemocentro.noticia.model.Noticia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticiaRepository extends JpaRepository<Noticia, Long> {

}
