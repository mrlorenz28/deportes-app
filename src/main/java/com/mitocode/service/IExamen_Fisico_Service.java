package com.mitocode.service;

import java.util.List;

import com.mitocode.model.Examen_Fisico;
import com.mitocode.model.Paciente;


public interface IExamen_Fisico_Service  {
	
	List<Examen_Fisico> listar();
	
	Examen_Fisico registrar(Examen_Fisico p);
	
	Examen_Fisico modificar(Examen_Fisico p);

	List<Examen_Fisico> listarPendiente();

	List<Examen_Fisico> listarRechazado();

	List<Examen_Fisico> listarDesaprobado();

	List<Examen_Fisico> listarAprobado();
	
	List<Examen_Fisico> listarCardiologoPendiente();

	Examen_Fisico ListarPorId(Integer id);
	
	List<Examen_Fisico> listarPediatraPendiente();
	
	List<Examen_Fisico> listarEnfermeraPendiente();

	
	

	
		
}
