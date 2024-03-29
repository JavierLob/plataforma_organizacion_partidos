package com.springboot.app.spring.futbol.models.services;

import java.util.List;

import com.springboot.app.spring.futbol.models.entity.Usuario;



public interface IUsuarioService {
	
	public List<Usuario> findAll();
	
	public Usuario findById(Long id);
	
	public Usuario save(Usuario usuario);
	
	public void delete(Long id);
}
