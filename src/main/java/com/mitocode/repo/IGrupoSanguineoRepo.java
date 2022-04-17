package com.mitocode.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mitocode.model.Grupo_sanguineo;
import com.mitocode.model.Paciente;


public interface IGrupoSanguineoRepo extends JpaRepository<Grupo_sanguineo , Integer> {

	@Query(value ="Select * FROM grupo_sanguineo", nativeQuery = true)
	List<Grupo_sanguineo> listar();
	
	
	
}
	