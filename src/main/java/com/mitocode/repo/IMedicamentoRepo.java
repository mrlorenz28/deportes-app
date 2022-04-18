package com.mitocode.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mitocode.model.Especialidad;
import com.mitocode.model.Medicamento;

public interface IMedicamentoRepo extends JpaRepository<Medicamento, Integer> {

}
