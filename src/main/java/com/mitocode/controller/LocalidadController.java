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

import com.mitocode.model.Localidad;
import com.mitocode.model.Provincia;
import com.mitocode.model.Usuario;
import com.mitocode.repo.IUsuarioRepo;
import com.mitocode.service.ICategoriaService;
import com.mitocode.service.ILocalidadService;
import com.mitocode.service.IProvinciaService;
import com.mitocode.service.UsuarioService;

@RestController
@RequestMapping("/localidad")
public class LocalidadController {

	@Autowired
	private ILocalidadService service;
	
	
	@GetMapping("/provincia/{id}")
	public List<Localidad> ListarLocalidadPorId(@PathVariable("id") Integer id) throws Exception{
		return service.ListarLocalidadPorId(id);
	}
	
	
	
}