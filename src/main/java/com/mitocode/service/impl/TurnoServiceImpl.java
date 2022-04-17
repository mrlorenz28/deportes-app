package com.mitocode.service.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.model.Turno;
import com.mitocode.model.Usuario;
import com.mitocode.repo.ITurnoRepo;
import com.mitocode.service.ITurnoService;


@Service
public class TurnoServiceImpl implements ITurnoService {

	@Autowired
	private ITurnoRepo repo;
	
	
	@Override
	public Turno registrar(Turno p) throws Exception {
		return repo.save(p);
	}

	@Override
	public Turno modificar(Turno p) throws Exception {
		return repo.save(p);
	}

	@Override
	public List<Turno> listar() throws Exception {
		return repo.findAll();
	}

	@Override
	public Turno ListarPorId(Integer id) throws Exception {
		
		Optional<Turno> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Turno();
	}
	
	@Override
	public List<Turno> listarDisponiblePorFecha(Integer id, LocalDate fecha) throws Exception {
		return repo.listarDisponiblePorFecha(id, fecha);
	}

	@Override
	public void eliminar(Integer id) throws Exception {
		repo.deleteById(id);
		
	}

	@Override
	public List<Turno> listarPorMedicoCategoriaFecha(Integer id_doctor, Integer idCategoria, LocalDate fecha)
			throws Exception {
				return repo.listarPorMedicoCategoriaFecha(id_doctor, idCategoria, fecha);
	}

	@Override
	public List<Turno> listarPorMedicoFechaDisponibilidad(Integer id, LocalDate fecha, String estado) {
		return repo.listarPorMedicoFechaDisponibilidad(id, fecha, estado);
	}

	@Override
	public List<Turno> listarProximos() {
		return repo.listarProximos();
	}

	@Override
	public List<Turno> UsuarioFecha(Integer id, LocalDate fecha) {
		return repo.UsuarioFecha(id, fecha);
	}
	
	
	
}
