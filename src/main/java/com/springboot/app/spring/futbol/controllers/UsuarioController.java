package com.springboot.app.spring.futbol.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.spring.futbol.models.entity.Usuario;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@GetMapping("/clientes")
	public List<Usuario> index(){		
		return usuarioService.findAll(); 
	}
}
