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

import com.mitocode.model.Usuario;
import com.mitocode.repo.IUsuarioRepo;
import com.mitocode.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private IUsuarioRepo repo;
	
	@Autowired
	private BCryptPasswordEncoder bcrypt;
	
	@GetMapping
	public List<Usuario> listar() throws Exception{
		return repo.findAll();
	}
	
	@GetMapping("/{id}")
	public Usuario ListarPorId(@PathVariable("id") Integer id) throws Exception{
		return repo.getOne(id);
	}
	
	@GetMapping("/username/{username}")
	public Usuario findOneByUsername(@PathVariable("username") String username) throws Exception{
		return repo.findOneByUsername(username);
	}
	
	@GetMapping("/especialidad/{id}")
	public List<Usuario> ListarPorEspecialidad(@PathVariable("id") Integer id) throws Exception{
		return repo.ListarPorEspecialidad(id);
	}
	
	@PostMapping
	public Usuario registrar(@RequestBody Usuario p) throws Exception {
		p.setPassword(bcrypt.encode(p.getPassword()));
		return repo.save(p);
	}
	
	@PutMapping
	public Usuario modificar(@RequestBody Usuario p) throws Exception {
		return repo.save(p);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) throws Exception{
		 repo.deleteById(id);
	}
}
