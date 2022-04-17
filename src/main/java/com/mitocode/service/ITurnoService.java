package com.mitocode.service;

import java.time.LocalDate;
import java.util.List;

import com.mitocode.model.Turno;
import com.mitocode.model.Usuario;

public interface ITurnoService  {


		Turno registrar(Turno p) throws Exception;

		Turno modificar(Turno p) throws Exception;

		List<Turno> listar() throws Exception;
		
		List<Turno> listarDisponiblePorFecha(Integer id, LocalDate fecha) throws Exception;

		Turno ListarPorId(Integer id) throws Exception;

		void eliminar(Integer id) throws Exception;
		
		List<Turno> listarPorMedicoCategoriaFecha(Integer id_doctor, Integer idCategoria, LocalDate fecha) throws Exception;
		
		List<Turno> listarPorMedicoFechaDisponibilidad(Integer id, LocalDate fecha, String estado);

		List<Turno> listarProximos();

		List<Turno> UsuarioFecha(Integer id, LocalDate fecha);

		
}
