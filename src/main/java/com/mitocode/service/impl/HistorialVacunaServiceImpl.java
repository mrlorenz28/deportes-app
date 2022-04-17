package com.mitocode.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.model.Especialidad;
import com.mitocode.repo.IEspecialidadRepo;
import com.mitocode.repo.IHistorial_VacunasRepo;
import com.mitocode.repo.IPacienteRepo;
import com.mitocode.service.IEspecialidadService;
import com.mitocode.service.IHistorial_VacunasService;
import com.mitocode.service.IPacienteService;


@Service
public class HistorialVacunaServiceImpl implements IHistorial_VacunasService {

	@Autowired
	private IHistorial_VacunasRepo repo;

	@Override
	public Especialidad registrar(Especialidad p) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Especialidad modificar(Especialidad p) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Especialidad> listar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Especialidad ListarPorId(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Integer id) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
