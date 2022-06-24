package com.springboot.app.spring.futbol.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.app.spring.futbol.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{

}
