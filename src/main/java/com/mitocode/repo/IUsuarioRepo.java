package com.mitocode.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mitocode.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer>  {

	//select * from usuario where username = ?
	Usuario findOneByUsername(String username);	
	
	@Query(value ="update usuario set estado = :estado where id_usuario = :id", nativeQuery = true)
	Usuario cambiarEstado(@Param("id") Integer id, @Param("estado") Boolean estado);
	
	@Query(value ="select * from usuario_categoria uc\r\n"
			+ "inner join usuario u on u.id_usuario = uc.id_usuario\r\n"
			+ "inner join categoria c on c.id_categoria = uc.id_rol\r\n"
			+ "where c.id_categoria = :id", nativeQuery = true)
	List<Usuario> ListarPorEspecialidad(@Param("id") Integer id);
	
	

}
