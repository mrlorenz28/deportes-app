package com.mitocode.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mitocode.model.Especialidad;
import com.mitocode.model.Historial_Vacuna;
import com.mitocode.model.Turno;

public interface IHistorial_VacunasRepo extends JpaRepository<Historial_Vacuna, Integer> {
	
	@Query(value ="Select * FROM historial_vacuna where paciente_id = :id ", nativeQuery = true)
	List<Historial_Vacuna> HistorialPorId(@Param("id") Integer id);

}
