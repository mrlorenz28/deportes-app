package com.mitocode.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.model.Categoria;
import com.mitocode.repo.ICategoriaRepo;
import com.mitocode.service.ICategoriaService;


@Service
public class CategoriaServiceImpl implements ICategoriaService {

	@Autowired
	private ICategoriaRepo repo;
	
	
	@Override
	public Categoria registrar(Categoria p) throws Exception {
		return repo.save(p);
	}

	@Override
	public Categoria modificar(Categoria p) throws Exception {
		return repo.save(p);
	}

	@Override
	public List<Categoria> listar() throws Exception {
		return repo.findAll();
	}

	@Override
	public Categoria ListarPorId(Integer id) throws Exception {
		
		Optional<Categoria> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Categoria();
	}

	@Override
	public void eliminar(Integer id) throws Exception {
		repo.deleteById(id);
		
	}
	
}
