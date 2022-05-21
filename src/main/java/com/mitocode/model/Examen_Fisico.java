package com.mitocode.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
@Entity
public class Examen_Fisico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@JoinColumn(name = "cardiologo_id")
	@OneToOne(cascade = CascadeType.ALL)
	private Cardiologo cardiologo;
	
	@JoinColumn(name = "pediatra_id")
	@OneToOne(cascade = CascadeType.ALL)
    private Pediatra pediatra;
	
	@JoinColumn(name = "enfermera_id")
	@OneToOne(cascade = CascadeType.ALL)
    private Enfermera enfermera;
	
	private String estado;

	@ManyToOne(optional = false)
	private Paciente paciente;

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cardiologo getCardiologo() {
		return cardiologo;
	}

	public void setCardiologo(Cardiologo cardiologo) {
		this.cardiologo = cardiologo;
	}

	public Pediatra getPediatra() {
		return pediatra;
	}

	public void setPediatra(Pediatra pediatra) {
		this.pediatra = pediatra;
	}

	public Enfermera getEnfermera() {
		return enfermera;
	}

	public void setEnfermera(Enfermera enfermera) {
		this.enfermera = enfermera;
	}
	
	
	


	
	
	
	
}
