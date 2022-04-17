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

import com.mitocode.model.Categoria;
import com.mitocode.service.ICategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

	@Autowired
	private ICategoriaService service;
	
	@GetMapping
	public List<Categoria> listar() throws Exception{
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public Categoria ListarPorId(@PathVariable("id") Integer id) throws Exception{
		return service.ListarPorId(id);
	}
	
	@PostMapping
	public Categoria registrar(@RequestBody Categoria p) throws Exception {
		return service.registrar(p);
	}
	
	@PutMapping
	public Categoria modificar(@RequestBody Categoria p) throws Exception {
		return service.modificar(p);
	}
	
	 
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) throws Exception{
		service.eliminar(id);
	}
}
