package com.mitocode.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mitocode.model.Ayuda;
import com.mitocode.model.Especialidad;

public interface IAyudaRepo extends JpaRepository<Ayuda, Integer> {

}
