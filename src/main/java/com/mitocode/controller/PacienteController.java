package com.mitocode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.model.Grupo_sanguineo;
import com.mitocode.model.Historial_Vacuna;
import com.mitocode.model.Paciente;
import com.mitocode.model.Vacuna;
import com.mitocode.repo.IHistorial_VacunasRepo;
import com.mitocode.repo.IVacunaRepo;
import com.mitocode.service.IHistorial_VacunasService;
import com.mitocode.service.IPacienteService;



@RestController
@RequestMapping("/paciente")
public class PacienteController {

	@Autowired
	private IPacienteService service;
	
	@Autowired
	private IHistorial_VacunasRepo HistorialVacunaRepo;
	
	@Autowired
	private IVacunaRepo vacunas;
	
	@GetMapping
	public List<Paciente> listar() throws Exception{
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public Paciente ListarPorId(@PathVariable("id") Integer id) throws Exception{
		return service.ListarPorId(id);
	}
	
	@GetMapping("/dni/{dni}")
	public Paciente ListarPorDni(@PathVariable("dni") Integer dni) throws Exception{
		return service.ListarPorDni(dni);
	}
	
	@GetMapping("/vacunas")
	public List<Vacuna> ListarVacunas() throws Exception{
		return vacunas.findAll();
	}
	
	@PostMapping("/registrarHistorialVacuna")
	public Historial_Vacuna registrarHistorial(@RequestBody Historial_Vacuna h) throws Exception {
		return HistorialVacunaRepo.save(h);
	}
	
	@GetMapping("/apellido/{apellido}")
	public List<Paciente> ListarPorApellido(@PathVariable("apellido") String apellido) throws Exception{
		return service.ListarPorApellido(apellido);
	}
	
	@GetMapping("/listarSinExamen")
	public List<Paciente> listarSinExamen() throws Exception{
		return service.listarSinExamen();
	}
	
	@GetMapping("/listarSinExamenPorClub/{id}")
	public List<Paciente> listarSinExamenPorClub(@PathVariable("apellido") Integer id) throws Exception{
		return service.listarSinExamenPorClub(id);
	}
	
	
	
	@PostMapping
	public Paciente registrar(@RequestBody Paciente p) throws Exception {
		return service.registrar(p);
	}
	
	@PutMapping
	public Paciente modificar(@RequestBody Paciente p) throws Exception {
		return service.modificar(p);
	}
	
	 
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) throws Exception{
		service.eliminar(id);
	}
	
	
	
	//HISTORIAL
	@GetMapping("/historialVacunas/{id}")
	public List<Historial_Vacuna> HistorialPorId(@PathVariable("id") Integer id) throws Exception{
		return HistorialVacunaRepo.HistorialPorId(id);
	}
	
}
