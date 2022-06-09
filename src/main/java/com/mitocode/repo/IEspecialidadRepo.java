package com.mitocode.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mitocode.model.Especialidad;

public interface IEspecialidadRepo extends JpaRepository<Especialidad, Integer> {

	@Query(value="select count(*) as cantidad,\r\n"
			+ "(select count(*) from ficha_medica where :variable = 'Si') as Si,\r\n"
			+ "(select count(*) from ficha_medica where variable = 'No') as No\r\n"
			+ "from ficha_medica f", nativeQuery = true)
	List<Object[]> EstadisticaPorFicha(@Param("variable") String variable);
}
