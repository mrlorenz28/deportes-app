package com.mitocode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.model.Producto;
import com.mitocode.repo.IProductoRepo;
import com.mitocode.service.IProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {

	@Autowired
	private IProductoRepo repo;
	
	
	@GetMapping
	public List<Producto> listar() throws Exception{
		return repo.findAll();
	}
	
	@PostMapping
	public Producto registrar(@RequestBody Producto p) throws Exception {
		return repo.save(p);
	}
	
	
	@PutMapping
	public Producto modificar(@RequestBody Producto p) throws Exception {
		return repo.save(p);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) throws Exception{
		 repo.deleteById(id);
	}
}
