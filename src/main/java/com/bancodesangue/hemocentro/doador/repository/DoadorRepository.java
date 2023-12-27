package com.bancodesangue.hemocentro.doador.repository;

import com.bancodesangue.hemocentro.doador.model.Doador;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DoadorRepository extends JpaRepository<Doador, Long> {
}
