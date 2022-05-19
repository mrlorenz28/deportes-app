package com.mitocode.model;



import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class HistoriaL_Examen_Fisico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne(cascade=CascadeType.ALL)//one-to-one
    @JoinColumn(name="examen_fisico_id")
	private Examen_Fisico examen_fisico;
	
	@OneToOne(cascade=CascadeType.ALL)//one-to-one
    @JoinColumn(name="pediatra_id")
	private Usuario pediatra;
	
	@OneToOne(cascade=CascadeType.ALL)//one-to-one
    @JoinColumn(name="medico_id")
	private Usuario medico;
	
	@OneToOne(cascade=CascadeType.ALL)//one-to-one
    @JoinColumn(name="examen_id")
	private Examen_Fisico examen;
	
	private LocalDateTime fecha;
	
	private String estado;
	
	private String motivo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Examen_Fisico getExamen_fisico() {
		return examen_fisico;
	}
	
	

	public Examen_Fisico getExamen() {
		return examen;
	}

	public void setExamen(Examen_Fisico examen) {
		this.examen = examen;
	}

	public void setExamen_fisico(Examen_Fisico examen_fisico) {
		this.examen_fisico = examen_fisico;
	}



	public Usuario getPediatra() {
		return pediatra;
	}

	public void setPediatra(Usuario pediatra) {
		this.pediatra = pediatra;
	}

	public Usuario getMedico() {
		return medico;
	}

	public void setMedico(Usuario medico) {
		this.medico = medico;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	
	
}
