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
import com.mitocode.model.Paciente;
import com.mitocode.service.IGrupoSanguineoService;
import com.mitocode.service.IPacienteService;



@RestController
@RequestMapping("/grupoSanguineo")
public class GrupoSanguineoController {

	@Autowired
	private IGrupoSanguineoService service;
	
	@GetMapping
	public List<Grupo_sanguineo> listar() throws Exception{
		return service.listar();
	}
	
}
