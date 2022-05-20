package com.mitocode.service;

import java.util.List;

import com.mitocode.model.Cardiologo;

public interface ICardiologoService  {


		Cardiologo registrar(Cardiologo p) throws Exception;

		Cardiologo modificar(Cardiologo p) throws Exception;

		List<Cardiologo> listar() throws Exception;

		Cardiologo ListarPorId(Integer id) throws Exception;

		void eliminar(Integer id) throws Exception;
}
