package com.mitocode.service;

import java.util.List;

import com.mitocode.model.Rol;

public interface IRolService  {


		Rol registrar(Rol p) throws Exception;

		Rol modificar(Rol p) throws Exception;

		List<Rol> listar() throws Exception;
		
		List<Rol> listarSinProgramador() throws Exception;

		Rol ListarPorId(Integer id) throws Exception;

		void eliminar(Integer id) throws Exception;
}
