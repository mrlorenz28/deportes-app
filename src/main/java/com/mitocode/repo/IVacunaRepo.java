package com.mitocode.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mitocode.model.Especialidad;
import com.mitocode.model.Vacuna;

public interface IVacunaRepo extends JpaRepository<Vacuna, Integer> {

}
