package com.mitocode.model;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Ayuda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne
    @JoinColumn(name="paciente_id")
	private Paciente paciente;
	
	@OneToOne
    @JoinColumn(name="medico_id")
	private Usuario medico;
	
	@OneToOne
    @JoinColumn(name="pediatra_id")
	private Usuario pediatra;
	
	@OneToOne
    @JoinColumn(name="enfermera_id")
	private Usuario enfermera;
	
	@OneToOne
    @JoinColumn(name="examen_fisico_id")
	private Examen_Fisico examen_fisico;
	
	private String estado_medico;
	
	private String estado_pediatra;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Usuario getMedico() {
		return medico;
	}

	public void setMedico(Usuario medico) {
		this.medico = medico;
	}

	public Usuario getPediatra() {
		return pediatra;
	}

	public void setPediatra(Usuario pediatra) {
		this.pediatra = pediatra;
	}

	public Examen_Fisico getExamen_fisico() {
		return examen_fisico;
	}

	public void setExamen_fisico(Examen_Fisico examen_fisico) {
		this.examen_fisico = examen_fisico;
	}

	public String getEstado_medico() {
		return estado_medico;
	}

	public void setEstado_medico(String estado_medico) {
		this.estado_medico = estado_medico;
	}

	public String getEstado_pediatra() {
		return estado_pediatra;
	}

	public void setEstado_pediatra(String estado_pediatra) {
		this.estado_pediatra = estado_pediatra;
	}

	public Usuario getEnfermera() {
		return enfermera;
	}

	public void setEnfermera(Usuario enfermera) {
		this.enfermera = enfermera;
	}
	
	
	
}
