package com.mitocode.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.mitocode.model.Categoria;
import com.mitocode.model.Localidad;
import com.mitocode.model.Provincia;
import com.mitocode.model.Usuario;

public interface ILocalidadService  {

	
	List<Localidad> ListarLocalidadPorId(Integer id) throws Exception;


}
