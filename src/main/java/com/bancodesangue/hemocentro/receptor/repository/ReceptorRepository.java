package com.bancodesangue.hemocentro.receptor.repository;

import com.bancodesangue.hemocentro.receptor.model.Receptor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceptorRepository extends JpaRepository<Receptor, Long> {
}
