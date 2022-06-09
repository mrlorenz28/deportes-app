package com.mitocode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.mitocode.model.Ayuda;
import com.mitocode.model.Cardiologo;
import com.mitocode.model.Examen_Fisico;
import com.mitocode.model.Ficha_Medica;
import com.mitocode.model.Grupo_sanguineo;
import com.mitocode.model.Historial_Vacuna;
import com.mitocode.model.Paciente;
import com.mitocode.model.Vacuna;
import com.mitocode.repo.IAyudaRepo;
import com.mitocode.repo.IFicha_MedicaRepo;
import com.mitocode.repo.IGenericRepo;
import com.mitocode.repo.IHistorial_VacunasRepo;
import com.mitocode.repo.IVacunaRepo;
import com.mitocode.service.IExamen_Fisico_Service;
import com.mitocode.service.IHistorial_VacunasService;
import com.mitocode.service.IPacienteService;


@RestController
@RequestMapping("/examen-fisico")
public class Examen_fisicoController {

	@Autowired
	private IExamen_Fisico_Service service;
	
	@GetMapping
	public List<Examen_Fisico> listar() throws Exception{
		return service.listar();
	}

	@GetMapping("/{id}")
	public Examen_Fisico ListarPorId(@PathVariable("id") Integer id) throws Exception{
		return service.ListarPorId(id);
	}
	
	@GetMapping("/listarPorEstado/{estado}")
	public List<Examen_Fisico> ListarPorEstado(@PathVariable("estado") String estado) throws Exception{
		return service.listarPorEstado(estado);
	}
	
	@GetMapping("/cardiologo-pendiente")
	public List<Examen_Fisico> listarCardiologoPendiente() throws Exception{
		return service.listarCardiologoPendiente();
	}
	
	@GetMapping("/listar-aprobado")
	public List<Examen_Fisico> listarAprobado() throws Exception{
		return service.listarAprobado();
	}
	
	@GetMapping("/listar-pendiente")
	public List<Examen_Fisico> listarPendiente() throws Exception{
		return service.listarPendiente();
	}
	
	@GetMapping("/pediatra-pendiente")
	public List<Examen_Fisico> listarPediatraPendiente() throws Exception{
		return service.listarPediatraPendiente();
	}
	
	@GetMapping("/enfermera-pendiente")
	public List<Examen_Fisico> listarEnfermeraPendiente() throws Exception{
		return service.listarEnfermeraPendiente();
	}
	
	@PostMapping
	public Examen_Fisico registrar(@RequestBody Examen_Fisico p) throws Exception {
		return service.registrar(p);
	}
	
	@PutMapping
	public ResponseEntity<Examen_Fisico> modificar(@RequestBody Examen_Fisico p) throws Exception {
		Examen_Fisico examen = service.modificar(p);
		return new ResponseEntity<Examen_Fisico>(examen, HttpStatus.OK);
	}
	
	
	

}
