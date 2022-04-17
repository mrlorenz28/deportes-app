package com.mitocode.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.model.Grupo_sanguineo;
import com.mitocode.model.Paciente;
import com.mitocode.repo.IGrupoSanguineoRepo;
import com.mitocode.repo.IPacienteRepo;
import com.mitocode.service.IGrupoSanguineoService;
import com.mitocode.service.IPacienteService;


@Service
public class GrupoSanguineoServiceImpl implements IGrupoSanguineoService {

	@Autowired
	private IGrupoSanguineoRepo repo;

	@Override
	public List<Grupo_sanguineo> listar() throws Exception {
		// TODO Auto-generated method stub
		return repo.listar();
	}
	
	
	
}
