package com.mitocode.service;

import java.util.List;

import com.mitocode.model.Especialidad;

public interface IHistorial_VacunasService  {


		Especialidad registrar(Especialidad p) throws Exception;

		Especialidad modificar(Especialidad p) throws Exception;

		List<Especialidad> listar() throws Exception;

		Especialidad ListarPorId(Integer id) throws Exception;

		void eliminar(Integer id) throws Exception;
}
