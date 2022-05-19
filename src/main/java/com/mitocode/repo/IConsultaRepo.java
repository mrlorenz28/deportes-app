package com.mitocode.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mitocode.model.Localidad;
import com.mitocode.model.Paciente;


public interface IConsultaRepo extends JpaRepository<Paciente, Integer> {

	@Query(value ="Select * FROM paciente p where dni = :dni", nativeQuery = true)
	Paciente listarPorDni(@Param("dni") Integer dni);
	
	@Query(value ="Select * FROM paciente p where apellido LIKE %:apellido% OR nombre LIKE %:apellido%", nativeQuery = true)
	List<Paciente> listarPorApellido(@Param("apellido") String apellido);
	
	
	
}
	