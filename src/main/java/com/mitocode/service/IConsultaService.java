package com.mitocode.service;

import java.util.List;

import com.mitocode.model.Examen_Fisico;
import com.mitocode.model.Localidad;
import com.mitocode.model.Paciente;
import com.mitocode.model.Provincia;

public interface IConsultaService  {

		List<Paciente> listar() throws Exception;
		
		byte[] generarReporte(Examen_Fisico examen);

		Paciente ListarPorId(Integer id) throws Exception;

		void eliminar(Integer id) throws Exception;

		Paciente ListarPorDni(Integer dni) throws Exception;
		
		List<Paciente> ListarPorApellido(String apellido) throws Exception;

		List<Provincia> listarProvincia();
		
		List<Localidad> ListarLocalidadPorId(Integer id) throws Exception;


		
}
