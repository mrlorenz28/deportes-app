package com.mitocode.service;

import java.util.List;

import com.mitocode.model.Categoria;

public interface ICategoriaService  {


		Categoria registrar(Categoria p) throws Exception;

		Categoria modificar(Categoria p) throws Exception;

		List<Categoria> listar() throws Exception;

		Categoria ListarPorId(Integer id) throws Exception;

		void eliminar(Integer id) throws Exception;
}
