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

import com.mitocode.model.Usuario;
import com.mitocode.repo.IUsuarioRepo;
import com.mitocode.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UserDetailsService {

	@Autowired
	private IUsuarioRepo repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Usuario usuario = repo.findOneByUsername(username);

		if (usuario == null) {
			throw new UsernameNotFoundException(String.format("Usuario no existe", username));
		}

		List<GrantedAuthority> roles = new ArrayList<>();

		usuario.getRol().forEach(rol -> {
			roles.add(new SimpleGrantedAuthority(rol.getNombre()));
		});

		UserDetails ud = new User(usuario.getUsername(), usuario.getPassword(), usuario.isEnabled(), true, true, true,
				roles);

		return ud;

	}
	





}
