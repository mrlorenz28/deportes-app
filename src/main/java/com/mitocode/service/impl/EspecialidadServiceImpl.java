package com.mitocode.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.model.Especialidad;
import com.mitocode.repo.IEspecialidadRepo;
import com.mitocode.repo.IPacienteRepo;
import com.mitocode.service.IEspecialidadService;
import com.mitocode.service.IPacienteService;


@Service
public class EspecialidadServiceImpl implements IEspecialidadService {

	@Autowired
	private IEspecialidadRepo repo;
	
	
	@Override
	public Especialidad registrar(Especialidad p) throws Exception {
		return repo.save(p);
	}

	@Override
	public Especialidad modificar(Especialidad p) throws Exception {
		return repo.save(p);
	}

	@Override
	public List<Especialidad> listar() throws Exception {
		return repo.findAll();
	}

	@Override
	public Especialidad ListarPorId(Integer id) throws Exception {
		
		Optional<Especialidad> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Especialidad();
	}

	@Override
	public void eliminar(Integer id) throws Exception {
		repo.deleteById(id);
		
	}
	
}
