package com.mitocode.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.mitocode.model.Usuario;

public interface UsuarioService  {

	
		UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

		Usuario registrar(Usuario p) throws Exception;

		Usuario modificar(Usuario p) throws Exception;

		List<Usuario> listar() throws Exception;

		Usuario ListarPorId(Integer id) throws Exception;
		
		List<Usuario> ListarPorEspecialidad(Integer id) throws Exception;

		void eliminar(Integer id) throws Exception;

		

}
