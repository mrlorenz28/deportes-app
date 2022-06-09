package com.mitocode.model;

import javax.persistence.Entity;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
public class Cardiologo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	

	private String inspeccion;
	
	private String auscultacion;
	
	private String FC;
	
	private String TA;
	
	private String TA_pc;
	
	private String pulsos_humerales;
	
	private String pulsos_femorales;
	
	private String observacion;

	
	
	@JsonIgnore
	@OneToOne(mappedBy = "cardiologo")
	private Examen_Fisico examen;
	
	
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getInspeccion() {
		return inspeccion;
	}

	public void setInspeccion(String inspeccion) {
		this.inspeccion = inspeccion;
	}

	public String getAuscultacion() {
		return auscultacion;
	}

	public void setAuscultacion(String auscultacion) {
		this.auscultacion = auscultacion;
	}

	public String getFC() {
		return FC;
	}

	public void setFC(String fC) {
		FC = fC;
	}

	public String getTA() {
		return TA;
	}

	public void setTA(String tA) {
		TA = tA;
	}

	public String getTA_pc() {
		return TA_pc;
	}

	public void setTA_pc(String tA_pc) {
		TA_pc = tA_pc;
	}

	public String getPulsos_humerales() {
		return pulsos_humerales;
	}

	public void setPulsos_humerales(String pulsos_humerales) {
		this.pulsos_humerales = pulsos_humerales;
	}

	public String getPulsos_femorales() {
		return pulsos_femorales;
	}

	public void setPulsos_femorales(String pulsos_femorales) {
		this.pulsos_femorales = pulsos_femorales;
	}

	public Examen_Fisico getExamen() {
		return examen;
	}

	public void setExamen(Examen_Fisico examen) {
		this.examen = examen;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}


	
	

}
