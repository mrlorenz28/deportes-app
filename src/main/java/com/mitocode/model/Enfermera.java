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
	
	private Boolean desmayos;
	
	private Boolean mareos;
	
	private Boolean dolor_fuerte_en_el_pecho;
	
	private Boolean mayor_cansancio_que_sus_compañeros;
	
	private Boolean palpitaciones;
	
	private Boolean dificultad_para_respirar_durante_o_despues_de_la_actividad_fisica;
		
	private Boolean caries;
	
	private Boolean ortodoncia_fija;
	
	private String oclusion_dental;
		
	private String od;
	
	private String oi;
	
	private String pupilas;
	
	private String vision_cromatica;
	
	@JsonIgnore
	@OneToOne(mappedBy = "enfermera")
	private Examen_Fisico examen;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Boolean getDesmayos() {
		return desmayos;
	}

	public void setDesmayos(Boolean desmayos) {
		this.desmayos = desmayos;
	}

	public Boolean getMareos() {
		return mareos;
	}

	public void setMareos(Boolean mareos) {
		this.mareos = mareos;
	}

	public Boolean getDolor_fuerte_en_el_pecho() {
		return dolor_fuerte_en_el_pecho;
	}

	public void setDolor_fuerte_en_el_pecho(Boolean dolor_fuerte_en_el_pecho) {
		this.dolor_fuerte_en_el_pecho = dolor_fuerte_en_el_pecho;
	}

	public Boolean getMayor_cansancio_que_sus_compañeros() {
		return mayor_cansancio_que_sus_compañeros;
	}

	public void setMayor_cansancio_que_sus_compañeros(Boolean mayor_cansancio_que_sus_compañeros) {
		this.mayor_cansancio_que_sus_compañeros = mayor_cansancio_que_sus_compañeros;
	}

	public Boolean getPalpitaciones() {
		return palpitaciones;
	}

	public void setPalpitaciones(Boolean palpitaciones) {
		this.palpitaciones = palpitaciones;
	}

	public Boolean getDificultad_para_respirar_durante_o_despues_de_la_actividad_fisica() {
		return dificultad_para_respirar_durante_o_despues_de_la_actividad_fisica;
	}

	public void setDificultad_para_respirar_durante_o_despues_de_la_actividad_fisica(
			Boolean dificultad_para_respirar_durante_o_despues_de_la_actividad_fisica) {
		this.dificultad_para_respirar_durante_o_despues_de_la_actividad_fisica = dificultad_para_respirar_durante_o_despues_de_la_actividad_fisica;
	}

	public Boolean getCaries() {
		return caries;
	}

	public void setCaries(Boolean caries) {
		this.caries = caries;
	}

	public Boolean getOrtodoncia_fija() {
		return ortodoncia_fija;
	}

	public void setOrtodoncia_fija(Boolean ortodoncia_fija) {
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

	public Examen_Fisico getExamen() {
		return examen;
	}

	public void setExamen(Examen_Fisico examen) {
		this.examen = examen;
	}
	
	

	
	

}
