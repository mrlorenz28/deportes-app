package com.mitocode.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.model.Rol;
import com.mitocode.repo.IRolRepo;
import com.mitocode.service.IRolService;


@Service
public class RolServiceImpl implements IRolService {

	@Autowired
	private IRolRepo repo;
	
	
	@Override
	public Rol registrar(Rol p) throws Exception {
		return repo.save(p);
	}
	

	@Override
	public Rol modificar(Rol p) throws Exception {
		return repo.save(p);
	}

	@Override
	public List<Rol> listar() throws Exception {
		return repo.findAll();
	}

	@Override
	public Rol ListarPorId(Integer id) throws Exception {
		
		Optional<Rol> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Rol();
	}

	@Override
	public void eliminar(Integer id) throws Exception {
		repo.deleteById(id);
		
	}


	@Override
	public List<Rol> listarSinProgramador() throws Exception {
		// TODO Auto-generated method stub
		return repo.ListarSinProgramador();
	}
	
}
