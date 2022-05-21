package com.mitocode.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.model.Grupo_sanguineo;
import com.mitocode.model.Paciente;
import com.mitocode.repo.IPacienteRepo;
import com.mitocode.service.IPacienteService;


@Service
public class PacienteServiceImpl implements IPacienteService {

	@Autowired
	private IPacienteRepo repo;
	
	
	@Override
	public Paciente registrar(Paciente p) throws Exception {
		return repo.save(p);
	}

	@Override
	public Paciente modificar(Paciente p) throws Exception {
		return repo.save(p);
	}

	@Override
	public List<Paciente> listar() throws Exception {
		return repo.findAll();
	}

	@Override
	public Paciente ListarPorId(Integer id) throws Exception {
		
		Optional<Paciente> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Paciente();
	}
	
	@Override
	public List<Paciente> ListarPorApellido(String apellido) throws Exception {
		return repo.listarPorApellido(apellido);
	}
	
	@Override
	public Paciente ListarPorDni(Integer dni) throws Exception {
		return repo.listarPorDni(dni);
	}
	

	@Override
	public void eliminar(Integer id) throws Exception {
		repo.deleteById(id);
		
	}

	@Override
	public List<Paciente> listarSinExamen() {
		return repo.listarSinExamen();
	}


	@Override
	public List<Paciente> listarSinExamenPorClub(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
