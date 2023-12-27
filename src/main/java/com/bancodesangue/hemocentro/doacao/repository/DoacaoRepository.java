package com.bancodesangue.hemocentro.doacao.repository;

import com.bancodesangue.hemocentro.doacao.model.Doacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoacaoRepository extends JpaRepository<Doacao, Long> {
}
