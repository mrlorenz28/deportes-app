package com.mitocode.service;

import java.util.List;

import com.mitocode.model.Club;

public interface IClubService  {


		Club registrar(Club p) throws Exception;

		Club modificar(Club p) throws Exception;

		List<Club> listar() throws Exception;

		Club ListarPorId(Integer id) throws Exception;

		void eliminar(Integer id) throws Exception;
}
