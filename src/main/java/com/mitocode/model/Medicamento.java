package com.mitocode.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Medicamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nombre;
	
	 @OneToOne(mappedBy = "medicamento")
	 private Preescripcion preescripcion;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Preescripcion getPreescripcion() {
		return preescripcion;
	}

	public void setPreescripcion(Preescripcion preescripcion) {
		this.preescripcion = preescripcion;
	}
	
	
}
