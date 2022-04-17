package com.mitocode.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.model.HorariosDoctor;
import com.mitocode.repo.IHorariosDoctorRepo;
import com.mitocode.service.HorariosDoctorService;

@Service
public class HorariosDoctorServiceImpl implements HorariosDoctorService {

	@Autowired
	private IHorariosDoctorRepo repo;
	
	
	@Override
	public HorariosDoctor registrar(HorariosDoctor p) throws Exception {
		return repo.save(p);
	}

	@Override
	public HorariosDoctor modificar(HorariosDoctor p) throws Exception {
		return repo.save(p);
	}
	

	@Override
	public List<HorariosDoctor> listar() throws Exception {
		return repo.findAll();
	}
	

	@Override
	public HorariosDoctor ListarPorId(Integer id) throws Exception {
		
		Optional<HorariosDoctor> op = repo.findById(id);
		return op.isPresent() ? op.get() : new HorariosDoctor();
	}
	

	@Override
	public void eliminar(Integer id) throws Exception {
		repo.deleteById(id);
		
	}


	
}
