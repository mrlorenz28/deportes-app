package com.mitocode.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Pediatra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	//datos generales
	private String peso;
	
	private String peso_pc;
	
	private String talla;
	
	private String talla_pc;
	
	private String imc;

	private String imc_pc;
		
	//examen respiratorio
	private String respiracion_inspeccion;
	
	private String respiracion_auscultacion;
		
	//examen abdominogenital
	private String abdominogenital_inspeccion;
	
	private String abdominogenital_auscultacion;
		
	//examen musculo esqueletico
	private String actitud;

	private String posturas;
	
	private String asimetrias;
	
	
	private String cuello;
	
	private String tronco;
	
	
	//apoyo_plantar;
	
	private String extremidades_superiores;
	
	private String extremidades_inferiores;
	
	private Boolean vacunacion_completa;
	
	private String observacion;

	
	@JsonIgnore
	@OneToOne(mappedBy = "pediatra")
	private Examen_Fisico examen;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}



	public String getPeso() {
		return peso;
	}


	public void setPeso(String peso) {
		this.peso = peso;
	}


	public String getPeso_pc() {
		return peso_pc;
	}


	public void setPeso_pc(String peso_pc) {
		this.peso_pc = peso_pc;
	}


	public String getTalla() {
		return talla;
	}


	public void setTalla(String talla) {
		this.talla = talla;
	}


	public String getTalla_pc() {
		return talla_pc;
	}


	public void setTalla_pc(String talla_pc) {
		this.talla_pc = talla_pc;
	}


	public String getImc() {
		return imc;
	}


	public void setImc(String imc) {
		this.imc = imc;
	}


	public String getImc_pc() {
		return imc_pc;
	}


	public void setImc_pc(String imc_pc) {
		this.imc_pc = imc_pc;
	}


	public String getRespiracion_inspeccion() {
		return respiracion_inspeccion;
	}


	public void setRespiracion_inspeccion(String respiracion_inspeccion) {
		this.respiracion_inspeccion = respiracion_inspeccion;
	}


	public String getRespiracion_auscultacion() {
		return respiracion_auscultacion;
	}


	public void setRespiracion_auscultacion(String respiracion_auscultacion) {
		this.respiracion_auscultacion = respiracion_auscultacion;
	}


	public String getAbdominogenital_inspeccion() {
		return abdominogenital_inspeccion;
	}


	public void setAbdominogenital_inspeccion(String abdominogenital_inspeccion) {
		this.abdominogenital_inspeccion = abdominogenital_inspeccion;
	}


	public String getAbdominogenital_auscultacion() {
		return abdominogenital_auscultacion;
	}


	public void setAbdominogenital_auscultacion(String abdominogenital_auscultacion) {
		this.abdominogenital_auscultacion = abdominogenital_auscultacion;
	}


	public String getActitud() {
		return actitud;
	}


	public void setActitud(String actitud) {
		this.actitud = actitud;
	}


	public String getPosturas() {
		return posturas;
	}


	public void setPosturas(String posturas) {
		this.posturas = posturas;
	}


	public String getAsimetrias() {
		return asimetrias;
	}


	public void setAsimetrias(String asimetrias) {
		this.asimetrias = asimetrias;
	}


	public String getCuello() {
		return cuello;
	}


	public void setCuello(String cuello) {
		this.cuello = cuello;
	}


	public String getTronco() {
		return tronco;
	}


	public void setTronco(String tronco) {
		this.tronco = tronco;
	}


	public String getExtremidades_superiores() {
		return extremidades_superiores;
	}


	public void setExtremidades_superiores(String extremidades_superiores) {
		this.extremidades_superiores = extremidades_superiores;
	}


	public String getExtremidades_inferiores() {
		return extremidades_inferiores;
	}


	public void setExtremidades_inferiores(String extremidades_inferiores) {
		this.extremidades_inferiores = extremidades_inferiores;
	}


	public Boolean getVacunacion_completa() {
		return vacunacion_completa;
	}


	public void setVacunacion_completa(Boolean vacunacion_completa) {
		this.vacunacion_completa = vacunacion_completa;
	}


	public String getObservacion() {
		return observacion;
	}


	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}


	public Examen_Fisico getExamen() {
		return examen;
	}


	public void setExamen(Examen_Fisico examen) {
		this.examen = examen;
	}

	
	
	
	
	
	
}
