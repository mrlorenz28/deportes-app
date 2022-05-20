package com.mitocode.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mitocode.model.Cardiologo;
import com.mitocode.model.Categoria;
import com.mitocode.model.Especialidad;
import com.mitocode.model.Rol;

public interface ICardiologoRepo extends JpaRepository<Cardiologo, Integer> {

}
