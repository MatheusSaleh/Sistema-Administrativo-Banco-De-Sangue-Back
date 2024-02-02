package com.bancodesangue.hemocentro.transfusao.repository;

import com.bancodesangue.hemocentro.transfusao.model.Transfusao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransfusaoRepository extends JpaRepository<Transfusao, Long> {
}
