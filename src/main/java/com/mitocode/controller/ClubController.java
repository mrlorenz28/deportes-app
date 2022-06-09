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

import com.mitocode.model.Club;
import com.mitocode.service.IClubService;

@RestController
@RequestMapping("/club")
public class ClubController {

	@Autowired
	private IClubService service;
	
	@GetMapping
	public List<Club> listar() throws Exception{
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public Club ListarPorId(@PathVariable("id") Integer id) throws Exception{
		return service.ListarPorId(id);
	}
	
	@PostMapping
	public ResponseEntity<Club> registrar(@RequestBody Club p) throws Exception {
		 p = service.registrar(p);
		return new ResponseEntity<Club>(p, HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Club> modificar(@RequestBody Club p) throws Exception {
		p =  service.modificar(p);
		return new ResponseEntity<Club>(p, HttpStatus.OK);
	}
	
	 
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) throws Exception{
		service.eliminar(id);
	}
}
