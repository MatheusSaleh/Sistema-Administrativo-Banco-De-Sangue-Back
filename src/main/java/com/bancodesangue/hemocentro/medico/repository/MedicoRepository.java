package com.bancodesangue.hemocentro.medico.repository;

import com.bancodesangue.hemocentro.medico.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
