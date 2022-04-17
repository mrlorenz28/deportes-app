package com.mitocode.repo;


import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mitocode.model.Turno;

public interface ITurnoRepo extends JpaRepository<Turno, Integer> {
	
	//select * from turno where fecha = Date('2021-08-25') AND id_profesional = 1 AND estado = 'disponible'
	@Query(value ="Select * FROM turno t where fecha = Date(:fecha) AND id_usuario = :id AND estado = 'disponible'", nativeQuery = true)
	List<Turno> listarDisponiblePorFecha(@Param("id") Integer id, @Param("fecha") LocalDate fecha);
	
	
	@Query(value ="Select * FROM turno t where t.fecha = Date(:fecha) AND t.id_usuario = :id_usuario AND t.id_categoria = :idCategoria order by hora", nativeQuery = true)
	List<Turno> listarPorMedicoCategoriaFecha(@Param("id_usuario") Integer id_usuario, @Param("idCategoria") Integer idCategoria,  @Param("fecha") LocalDate fecha);
	 
	@Query(value ="Select * FROM turno t where t.fecha = Date(:fecha) AND t.id_usuario = :id AND estado = :estado order by hora", nativeQuery = true)
	List<Turno> listarPorMedicoFechaDisponibilidad(@Param("id") Integer id, @Param("fecha") LocalDate fecha, @Param("estado") String estado);
	
	@Query(value ="Select * FROM turno where estado = 'ocupado' ", nativeQuery = true)
	List<Turno> listarProximos();
	
	
	@Query(value ="Select * FROM turno where id_usuario = :id AND fecha = :fecha  ", nativeQuery = true)
	List<Turno> UsuarioFecha(@Param("id") Integer id, @Param("fecha") LocalDate fecha);

}
