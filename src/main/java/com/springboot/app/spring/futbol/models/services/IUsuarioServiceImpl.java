package com.springboot.app.spring.futbol.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.app.spring.futbol.models.dao.IUsuarioDao;
import com.springboot.app.spring.futbol.models.entity.Usuario;

public class IUsuarioServiceImpl implements IUsuarioService{

	@Autowired
	private IUsuarioDao usuarioDao; 
	
	@Override
	public List<Usuario> findAll() {
		
		return (List<Usuario>) usuarioDao.findAll();
	}

	@Override
	public Usuario findById(Long id) {
		return usuarioDao.findById(id).orElse(null);
	}

	@Override
	public Usuario save(Usuario usuario) {
		return usuarioDao.save(usuario);
	}

	@Override
	public void delete(Long id) {
		usuarioDao.deleteById(id);		
	}

}
