package com.springboot.app.spring.futbol.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "clientes")
public class Usuario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	@Size(min = 4, max = 20)
	@Column(nullable = false)
	private String username;

	@NotEmpty
	@Size(min = 9, max = 12)
	@Column(nullable = false)
	private String numero;

	@NotEmpty
	@Size(min = 4, max = 50)
	@Column(nullable = false)
	private String nombre;

	@NotEmpty
	@Size(min = 4, max = 50)
	@Column(nullable = false)
	private String apellido;

	@NotEmpty
	@Email
	@Column(nullable = false)
	private String email;

	@NotEmpty
	@Digits(fraction = 0, integer = 2, message = "Ingresa solo números")
	@Column(nullable = false)
	private Integer edad;

	@NotEmpty
	@Column(nullable = false)
	private String genero;

	@NotEmpty
	@Column(nullable = false)
	private String direccion;

	@Column(name = "creado")
	@Temporal(TemporalType.DATE)
	private Date creado;

	@Column(name = "ultimo_acceso")
	@Temporal(TemporalType.DATE)
	private Date ultimo_acceso;

	@PrePersist
	public void prePersist() {
		creado = new Date();
	}


	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Date getCreado() {
		return creado;
	}

	public void setCreado(Date creado) {
		this.creado = creado;
	}

	public Date getUltimo_acceso() {
		return ultimo_acceso;
	}

	public void setUltimo_acceso(Date ultimo_acceso) {
		this.ultimo_acceso = ultimo_acceso;
	}

}
