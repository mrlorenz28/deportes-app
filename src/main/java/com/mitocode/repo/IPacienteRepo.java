package com.mitocode.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mitocode.model.Grupo_sanguineo;
import com.mitocode.model.Paciente;


public interface IPacienteRepo extends JpaRepository<Paciente, Integer> {

	@Query(value ="Select * FROM paciente p where dni = :dni", nativeQuery = true)
	Paciente listarPorDni(@Param("dni") Integer dni);
	
	@Query(value ="Select * FROM paciente p where apellido LIKE %:apellido% OR nombre LIKE %:apellido%", nativeQuery = true)
	List<Paciente> listarPorApellido(@Param("apellido") String apellido);
	
	@Query(value ="Select * FROM paciente p left join examen_fisico e on e.paciente_id = p.id where e.paciente_id is null", nativeQuery = true)
	List<Paciente> listarSinExamen();
	
	@Query(value ="select * from paciente p left join examen_fisico e on e.paciente_id = p.id where e.paciente_id is nulland p.club_id = :id", nativeQuery = true)
	List<Paciente> listarSinExamenPorClub();
}
	