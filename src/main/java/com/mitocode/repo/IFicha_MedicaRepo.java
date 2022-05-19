package com.mitocode.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.mitocode.model.Examen_Fisico;
import com.mitocode.model.Ficha_Medica;



public interface IFicha_MedicaRepo extends JpaRepository<Ficha_Medica, Integer> {


	
}
	