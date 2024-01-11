package com.bancodesangue.hemocentro.equipamento_medico.repository;

import com.bancodesangue.hemocentro.equipamento_medico.model.EquipamentoMedico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipamentoMedicoRepository extends JpaRepository<EquipamentoMedico, Long> {
}
