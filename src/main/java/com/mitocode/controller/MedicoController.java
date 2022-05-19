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

import com.mitocode.model.Examen_Fisico;
import com.mitocode.model.Grupo_sanguineo;
import com.mitocode.model.Historial_Vacuna;
import com.mitocode.model.Paciente;
import com.mitocode.model.Vacuna;
import com.mitocode.repo.IExamen_FisicoRepo;
import com.mitocode.repo.IHistorial_VacunasRepo;
import com.mitocode.repo.IVacunaRepo;
import com.mitocode.service.IHistorial_VacunasService;
import com.mitocode.service.IPacienteService;



@RestController
@RequestMapping("/medico")
public class MedicoController {

	@Autowired
	private IPacienteService service;
	
	@Autowired
	private IHistorial_VacunasRepo HistorialVacunaRepo;
	
	@Autowired
	private IExamen_FisicoRepo examen;
	
	@GetMapping
	public List<Examen_Fisico> ListarExamenFisico() throws Exception{
		return examen.findAll();
	}
	
	
}
