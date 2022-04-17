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

import com.mitocode.model.Diagnostico;
import com.mitocode.model.Grupo_sanguineo;
import com.mitocode.model.Historial_Vacuna;
import com.mitocode.model.Paciente;
import com.mitocode.model.Vacuna;
import com.mitocode.repo.IDiagnosticoRepo;
import com.mitocode.repo.IHistorial_VacunasRepo;
import com.mitocode.repo.IVacunaRepo;
import com.mitocode.service.IHistorial_VacunasService;
import com.mitocode.service.IPacienteService;



@RestController
@RequestMapping("/consulta")
public class ConsultaController {

	@Autowired
	private IPacienteService service;
	
	@Autowired
	private IDiagnosticoRepo diagnostico;
	
	@GetMapping
	public List<Paciente> listar() throws Exception{
		return service.listar();
	}
	
	@GetMapping("/diagnostico")
	public List<Diagnostico> ListarDiagnostico() throws Exception{
		return diagnostico.findAll();
	}
	
	
}
