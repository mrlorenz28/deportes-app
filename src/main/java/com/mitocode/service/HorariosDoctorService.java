package com.mitocode.service;

import java.util.List;

import com.mitocode.model.HorariosDoctor;

public interface HorariosDoctorService  {


		HorariosDoctor registrar(HorariosDoctor p) throws Exception;

		HorariosDoctor modificar(HorariosDoctor p) throws Exception;

		List<HorariosDoctor> listar() throws Exception;

		HorariosDoctor ListarPorId(Integer id) throws Exception;
		

		void eliminar(Integer id) throws Exception;

		

}
