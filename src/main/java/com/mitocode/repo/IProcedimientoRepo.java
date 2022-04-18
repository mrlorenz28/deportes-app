package com.mitocode.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mitocode.model.Diagnostico;
import com.mitocode.model.Grupo_sanguineo;
import com.mitocode.model.Paciente;
import com.mitocode.model.Procedimiento;


public interface IProcedimientoRepo extends JpaRepository<Procedimiento, Integer> {
	
	
}
	