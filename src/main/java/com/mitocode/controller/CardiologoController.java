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

import com.mitocode.model.Cardiologo;
import com.mitocode.service.ICardiologoService;

@RestController
@RequestMapping("/cardiologo")
public class CardiologoController {

	@Autowired
	private ICardiologoService service;
	
	@GetMapping
	public List<Cardiologo> listar() throws Exception{
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public Cardiologo ListarPorId(@PathVariable("id") Integer id) throws Exception{
		return service.ListarPorId(id);
	}
	
	@PostMapping
	public Cardiologo registrar(@RequestBody Cardiologo p) throws Exception {
		return service.registrar(p);
	}
	
	@PutMapping
	public Cardiologo modificar(@RequestBody Cardiologo p) throws Exception {
		return service.modificar(p);
	}
	
	 
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) throws Exception{
		service.eliminar(id);
	}
}
