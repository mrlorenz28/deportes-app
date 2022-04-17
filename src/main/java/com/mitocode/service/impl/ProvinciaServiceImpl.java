package com.mitocode.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.User;

import com.mitocode.model.Localidad;
import com.mitocode.model.Paciente;
import com.mitocode.model.Provincia;
import com.mitocode.model.Usuario;
import com.mitocode.repo.IProvinciaRepo;
import com.mitocode.repo.IUsuarioRepo;
import com.mitocode.service.IProvinciaService;
import com.mitocode.service.UsuarioService;

@Service
public class ProvinciaServiceImpl implements IProvinciaService {

	@Autowired
	private IProvinciaRepo repo;

	@Override
	public List<Provincia> listar() throws Exception {
		return repo.findAll();
	}

	



	
	





}
