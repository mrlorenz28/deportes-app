package com.mitocode.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Enfermera {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	private String desmayos;
	
	private String mareos;
	
	private String dolor_fuerte_en_el_pecho;
	
	private String mayor_cansancio_que_sus_companeros;
	
	private String palpitaciones;
	
	private String dificultad_para_respirar;
		
	private String caries;
	
	private String ortodoncia_fija;
	
	private String oclusion_dental;
		
	private String od;
	
	private String oi;
	
	private String pupilas;
	
	private String vision_cromatica;
	
	private String observacion;

	
	
	@JsonIgnore
	@OneToOne(mappedBy = "enfermera")
	private Examen_Fisico examen;



	public Integer getId() {
		return Id;
	}



	public void setId(Integer id) {
		Id = id;
	}



	public String getDesmayos() {
		return desmayos;
	}



	public void setDesmayos(String desmayos) {
		this.desmayos = desmayos;
	}



	public String getMareos() {
		return mareos;
	}



	public void setMareos(String mareos) {
		this.mareos = mareos;
	}



	public String getDolor_fuerte_en_el_pecho() {
		return dolor_fuerte_en_el_pecho;
	}



	public void setDolor_fuerte_en_el_pecho(String dolor_fuerte_en_el_pecho) {
		this.dolor_fuerte_en_el_pecho = dolor_fuerte_en_el_pecho;
	}



	public String getMayor_cansancio_que_sus_companeros() {
		return mayor_cansancio_que_sus_companeros;
	}



	public void setMayor_cansancio_que_sus_companeros(String mayor_cansancio_que_sus_companeros) {
		this.mayor_cansancio_que_sus_companeros = mayor_cansancio_que_sus_companeros;
	}



	public String getPalpitaciones() {
		return palpitaciones;
	}



	public void setPalpitaciones(String palpitaciones) {
		this.palpitaciones = palpitaciones;
	}

	public String getDificultad_para_respirar() {
		return dificultad_para_respirar;
	}



	public void setDificultad_para_respirar(String dificultad_para_respirar) {
		this.dificultad_para_respirar = dificultad_para_respirar;
	}



	public String getCaries() {
		return caries;
	}



	public void setCaries(String caries) {
		this.caries = caries;
	}



	public String getOrtodoncia_fija() {
		return ortodoncia_fija;
	}



	public void setOrtodoncia_fija(String ortodoncia_fija) {
		this.ortodoncia_fija = ortodoncia_fija;
	}



	public String getOclusion_dental() {
		return oclusion_dental;
	}



	public void setOclusion_dental(String oclusion_dental) {
		this.oclusion_dental = oclusion_dental;
	}



	public String getOd() {
		return od;
	}



	public void setOd(String od) {
		this.od = od;
	}



	public String getOi() {
		return oi;
	}



	public void setOi(String oi) {
		this.oi = oi;
	}



	public String getPupilas() {
		return pupilas;
	}



	public void setPupilas(String pupilas) {
		this.pupilas = pupilas;
	}



	public String getVision_cromatica() {
		return vision_cromatica;
	}



	public void setVision_cromatica(String vision_cromatica) {
		this.vision_cromatica = vision_cromatica;
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
