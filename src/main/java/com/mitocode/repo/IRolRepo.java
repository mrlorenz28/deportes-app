package com.mitocode.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mitocode.model.Rol;

public interface IRolRepo extends JpaRepository<Rol, Integer> {


	@Query(value ="select * from rol where id_rol != 99", nativeQuery = true)
	List<Rol> ListarSinProgramador();
}
