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

import com.mitocode.model.Ayuda;
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
	
	@PostMapping
	public Examen_Fisico registrar(@RequestBody Examen_Fisico p) throws Exception {
		return service.registrar(p);
	}
	

}
