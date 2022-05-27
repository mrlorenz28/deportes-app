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

import com.mitocode.model.Rol;
import com.mitocode.service.IRolService;

@RestController
@RequestMapping("/rol")
public class RolController {

	@Autowired
	private IRolService service;
	
	@GetMapping
	public List<Rol> listar() throws Exception{
		return service.listar();
	}
	
	@GetMapping("/listarSinProgramador")
	public List<Rol> listarSinProgramador() throws Exception{
		return service.listarSinProgramador();
	}
	
	@GetMapping("/{id}")
	public Rol ListarPorId(@PathVariable("id") Integer id) throws Exception{
		return service.ListarPorId(id);
	}
	
	
	@PostMapping
	public Rol registrar(@RequestBody Rol p) throws Exception {
		return service.registrar(p);
	}
	
	@PutMapping
	public Rol modificar(@RequestBody Rol p) throws Exception {
		return service.modificar(p);
	}
	
	 
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) throws Exception{
		service.eliminar(id);
	}
}
