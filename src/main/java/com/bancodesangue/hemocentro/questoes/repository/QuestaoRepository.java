package com.bancodesangue.hemocentro.questoes.repository;

import com.bancodesangue.hemocentro.questoes.model.Questao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestaoRepository extends JpaRepository<Questao, Long> {
}
