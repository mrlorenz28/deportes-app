package com.mitocode.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mitocode.model.Categoria;
import com.mitocode.model.Club;
import com.mitocode.model.Especialidad;
import com.mitocode.model.Rol;

public interface IClubRepo extends JpaRepository<Club, Integer> {

}
