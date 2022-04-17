package com.mitocode.service;

import java.util.List;

import com.mitocode.model.Grupo_sanguineo;
import com.mitocode.model.Paciente;

public interface IPacienteService  {


		Paciente registrar(Paciente p) throws Exception;

		Paciente modificar(Paciente p) throws Exception;

		List<Paciente> listar() throws Exception;
		
		

		Paciente ListarPorId(Integer id) throws Exception;

		void eliminar(Integer id) throws Exception;

		Paciente ListarPorDni(Integer dni) throws Exception;
		
		List<Paciente> ListarPorApellido(String apellido) throws Exception;


		
}
