package com.mitocode.repo;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mitocode.model.HorariosDoctor;

public interface IHorariosDoctorRepo extends JpaRepository<HorariosDoctor, Integer> {
	
	//@Query(JPQL)
	
	@Query(value ="Select * FROM horarios_doctor where id_doctor = :id", nativeQuery = true)
	List<HorariosDoctor> listarHorario(@Param("id") Integer id);
	
}
