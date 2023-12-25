package com.bancodesangue.hemocentro.enfermeiro.repository;

import com.bancodesangue.hemocentro.enfermeiro.model.Enfermeiro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnfermeiroRepository extends JpaRepository<Enfermeiro, Long> {
}
