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

import com.mitocode.model.Especialidad;
import com.mitocode.service.IEspecialidadService;

@RestController
@RequestMapping("/especialidad")
public class EspecialidadController {

	@Autowired
	private IEspecialidadService service;
	
	@GetMapping
	public List<Especialidad> listar() throws Exception{
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public Especialidad ListarPorId(@PathVariable("id") Integer id) throws Exception{
		return service.ListarPorId(id);
	}
	
	@PostMapping
	public Especialidad registrar(@RequestBody Especialidad p) throws Exception {
		return service.registrar(p);
	}
	
	@PutMapping
	public Especialidad modificar(@RequestBody Especialidad p) throws Exception {
		return service.modificar(p);
	}
	
	 
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) throws Exception{
		service.eliminar(id);
	}
}
