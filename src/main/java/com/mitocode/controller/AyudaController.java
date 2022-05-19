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
import com.mitocode.repo.IAyudaRepo;

@RestController
@RequestMapping("/ayuda")
public class AyudaController {

	@Autowired
	private IAyudaRepo repo;
	
	@GetMapping
	public List<Ayuda> listar() throws Exception{
		return repo.findAll();
	}
	

	
	@PostMapping
	public Ayuda registrar(@RequestBody Ayuda p) throws Exception {
		return repo.save(p);
	}
	
	@PutMapping
	public Ayuda modificar(@RequestBody Ayuda p) throws Exception {
		return repo.save(p);
	}
	

}
