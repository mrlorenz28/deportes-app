package com.mitocode.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.mitocode.model.Menu;
import com.mitocode.model.Producto;

public interface IProductoService extends ICRUD<Producto, Integer>{
	
	UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

	Producto registrar(Producto p) throws Exception;

	Producto modificar(Producto p) throws Exception;

	List<Producto> listar() throws Exception;

	Producto ListarPorId(Integer id) throws Exception;
	
	void eliminar(Integer id) throws Exception;

	
}
