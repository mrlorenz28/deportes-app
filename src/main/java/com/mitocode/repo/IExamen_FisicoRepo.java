package com.mitocode.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mitocode.model.Examen_Fisico;



public interface IExamen_FisicoRepo extends JpaRepository<Examen_Fisico, Integer> {

	@Query(value ="Select * FROM examen_fisico e where estado = :pendiente", nativeQuery = true)
	List<Examen_Fisico> listarPendiente();
	
	@Query(value ="Select * FROM examen_fisico e where estado = :rechazado", nativeQuery = true)
	List<Examen_Fisico> listarRechazado();
	
	@Query(value ="Select * FROM examen_fisico e where estado = :desaprobado", nativeQuery = true)
	List<Examen_Fisico> listarDesaprobado();
	
	@Query(value ="Select * FROM examen_fisico e where estado = :aprobado", nativeQuery = true)
	List<Examen_Fisico> listarAprobado();
	
	@Query(value ="Select * FROM examen_fisico e where usuario_id = :id", nativeQuery = true)
	Examen_Fisico listarPorId(@Param("id") Integer id);
	
}
	