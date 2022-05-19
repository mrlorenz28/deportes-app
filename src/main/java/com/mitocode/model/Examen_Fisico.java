package com.mitocode.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Examen_Fisico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	private Boolean desmayos;
	
	private Boolean mareos;
	
	private Boolean dolor_fuerte_en_el_pecho;
	
	private Boolean mayor_cansancio_que_sus_compañeros;
	
	private Boolean palpitaciones;
	
	private Boolean dificultad_para_respirar_durante_o_despues_de_la_actividad_fisica;
	
	//datos
	private Integer peso;
	
	private Integer peso_pc;
	
	private Integer talla;
	
	private Integer talla_pc;
	
	private Integer IMC;

	private Integer IMC_pc;
	
	private String examen_bucodental;
	
	private Boolean caries;
	
	private Boolean ortodoncia_fija;
	
	private String examen_visual;
	
	private String OD;
	
	private String OI;
	
	private String pupilas;
	
	private String vision_cromatica;
	
	private String examen_cardiovascular;

	private String inspeccion;
	
	private String auscultacion;
	
	private String FC;
	
	private String TA;
	
	private String TA_pc;
	
	private String pulsos_humerales;
	
	private String pulsos_femorales;
	
	private String examen_respiratorio;
	
	private String respiracion_inspeccion;
	
	private String respiracion_auscultacion;
	
	private String examen_abdominagenital;
	
	private String abdominogenital_inspeccion;
	
	private String abdominogenital_auscultacion;
	
	private String examen_musculo_esqueletico;
	
	private String actitud;

	private String posturas;
	
	private String asimetrias;
	
	private String movilidad_articular;
	
	private String cuello;
	
	private String tronco;
	
	private String apoyo_plantar;
	
	private String extremidades_superiores;
	
	private String extremidades_inferiores;
	
	private String evaluacion_madurativa;
	
	private String estadio_tanner;
	
	private String menarca;
	
	private String ritmo_menstrual;
	
	private Boolean vacunacion_completa;
	
	private String Observaciones;
	
	private String estadoMedico;
	
	private String estadoPediatra;

	private LocalDateTime fecha;
	
	@ManyToOne()
    @JoinColumn(name = "paciente_id")
	private Paciente paciente;

	
	
	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getEstadoMedico() {
		return estadoMedico;
	}

	public void setEstadoMedico(String estadoMedico) {
		this.estadoMedico = estadoMedico;
	}

	public String getEstadoPediatra() {
		return estadoPediatra;
	}

	public void setEstadoPediatra(String estadoPediatra) {
		this.estadoPediatra = estadoPediatra;
	}

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

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public Integer getPeso_pc() {
		return peso_pc;
	}

	public void setPeso_pc(Integer peso_pc) {
		this.peso_pc = peso_pc;
	}

	public Integer getTalla() {
		return talla;
	}

	public void setTalla(Integer talla) {
		this.talla = talla;
	}

	public Integer getTalla_pc() {
		return talla_pc;
	}

	public void setTalla_pc(Integer talla_pc) {
		this.talla_pc = talla_pc;
	}

	public Integer getIMC() {
		return IMC;
	}

	public void setIMC(Integer iMC) {
		IMC = iMC;
	}

	public Integer getIMC_pc() {
		return IMC_pc;
	}

	public void setIMC_pc(Integer iMC_pc) {
		IMC_pc = iMC_pc;
	}

	public String getExamen_bucodental() {
		return examen_bucodental;
	}

	public void setExamen_bucodental(String examen_bucodental) {
		this.examen_bucodental = examen_bucodental;
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

	public String getExamen_visual() {
		return examen_visual;
	}

	public void setExamen_visual(String examen_visual) {
		this.examen_visual = examen_visual;
	}

	public String getOD() {
		return OD;
	}

	public void setOD(String oD) {
		OD = oD;
	}

	public String getOI() {
		return OI;
	}

	public void setOI(String oI) {
		OI = oI;
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

	public String getExamen_cardiovascular() {
		return examen_cardiovascular;
	}

	public void setExamen_cardiovascular(String examen_cardiovascular) {
		this.examen_cardiovascular = examen_cardiovascular;
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

	public String getExamen_respiratorio() {
		return examen_respiratorio;
	}

	public void setExamen_respiratorio(String examen_respiratorio) {
		this.examen_respiratorio = examen_respiratorio;
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

	public String getExamen_abdominagenital() {
		return examen_abdominagenital;
	}

	public void setExamen_abdominagenital(String examen_abdominagenital) {
		this.examen_abdominagenital = examen_abdominagenital;
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

	public String getExamen_musculo_esqueletico() {
		return examen_musculo_esqueletico;
	}

	public void setExamen_musculo_esqueletico(String examen_musculo_esqueletico) {
		this.examen_musculo_esqueletico = examen_musculo_esqueletico;
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

	public String getMovilidad_articular() {
		return movilidad_articular;
	}

	public void setMovilidad_articular(String movilidad_articular) {
		this.movilidad_articular = movilidad_articular;
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

	public String getApoyo_plantar() {
		return apoyo_plantar;
	}

	public void setApoyo_plantar(String apoyo_plantar) {
		this.apoyo_plantar = apoyo_plantar;
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

	public String getEvaluacion_madurativa() {
		return evaluacion_madurativa;
	}

	public void setEvaluacion_madurativa(String evaluacion_madurativa) {
		this.evaluacion_madurativa = evaluacion_madurativa;
	}

	public String getEstadio_tanner() {
		return estadio_tanner;
	}

	public void setEstadio_tanner(String estadio_tanner) {
		this.estadio_tanner = estadio_tanner;
	}

	public String getMenarca() {
		return menarca;
	}

	public void setMenarca(String menarca) {
		this.menarca = menarca;
	}

	public String getRitmo_menstrual() {
		return ritmo_menstrual;
	}

	public void setRitmo_menstrual(String ritmo_menstrual) {
		this.ritmo_menstrual = ritmo_menstrual;
	}

	public Boolean getVacunacion_completa() {
		return vacunacion_completa;
	}

	public void setVacunacion_completa(Boolean vacunacion_completa) {
		this.vacunacion_completa = vacunacion_completa;
	}

	public String getObservaciones() {
		return Observaciones;
	}

	public void setObservaciones(String observaciones) {
		Observaciones = observaciones;
	}

	


































	
	
	
	
}
