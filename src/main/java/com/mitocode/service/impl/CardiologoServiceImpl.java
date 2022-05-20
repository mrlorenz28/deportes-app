package com.mitocode.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.model.Cardiologo;
import com.mitocode.model.Paciente;
import com.mitocode.model.Cardiologo;
import com.mitocode.repo.ICardiologoRepo;
import com.mitocode.service.ICardiologoService;


@Service
public class CardiologoServiceImpl implements ICardiologoService {

	@Autowired
	private ICardiologoRepo repo;
	

	@Override
	public void eliminar(Integer id) throws Exception {
		repo.deleteById(id);
		
	}

	@Override
	public Cardiologo registrar(Cardiologo p) throws Exception {
		return repo.save(p);
	}

	@Override
	public Cardiologo modificar(Cardiologo p) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cardiologo ListarPorId(Integer id) throws Exception {
		Optional<Cardiologo> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Cardiologo();
	}

	@Override
	public List<Cardiologo> listar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}
