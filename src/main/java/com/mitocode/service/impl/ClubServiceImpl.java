package com.mitocode.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.model.Club;
import com.mitocode.repo.IClubRepo;
import com.mitocode.service.IClubService;


@Service
public class ClubServiceImpl implements IClubService {

	@Autowired
	private IClubRepo repo;
	
	
	@Override
	public Club registrar(Club p) throws Exception {
		return repo.save(p);
	}

	@Override
	public Club modificar(Club p) throws Exception {
		return repo.save(p);
	}

	@Override
	public List<Club> listar() throws Exception {
		return repo.findAll();
	}

	@Override
	public Club ListarPorId(Integer id) throws Exception {
		
		Optional<Club> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Club();
	}

	@Override
	public void eliminar(Integer id) throws Exception {
		repo.deleteById(id);
		
	}
	
}
