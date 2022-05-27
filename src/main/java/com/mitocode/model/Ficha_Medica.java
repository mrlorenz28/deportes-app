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

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Ficha_Medica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	//informacion de salud
	private Boolean problemas_cardiacos;
	
	private Boolean presion_arterial_elevada;
	
	private Boolean obesidad;
	
	private Boolean asma_bronquial;
	
	private Boolean perdida_de_conciencia;
	
	private Boolean convulsiones;
	
	private Boolean traumatisco_de_craneo;
	
	private Boolean diabetes;
	
	private Boolean alteraciones_sanguineas;
	
	private Boolean afecciones_auditivas;
	
	private Boolean fracturas_luxaciones_roturas_ligamentarias;
	
	private Boolean otros_problemas_en_huesos_y_articulaciones;
	
	private Boolean cirugias;
	
	private Boolean internaciones;
	
	private Boolean enfermedades_infecciosas;
	
	private Boolean falta_de_organo;
	
	private Boolean alergias;
	
	private Boolean tos_cronica;
	
	private Boolean medicacion_habitual;
	
	private Boolean alergia_a_medicamento;
	
	private Boolean consume_minerales_energizante_suplementos;
	
	private Boolean problemas_de_piel;
	
	private Boolean usa_anteojos;
	
	private Boolean consume_alcohol_cigarros_sustancias;
	
	//en relacion al ejercicio
	private Boolean desmayos;
	
	private Boolean mareos;
	
	private Boolean dolor_fuerte_de_pecho;
	
	private Boolean mayor_cansancio_que_sus_compañeros;
	
	private Boolean palpitaciones;
		
	private Boolean dificultad_para_espirar;
	
	//antecedentes de familiares
	
	private Boolean familiar_por_muerte_subita;
	
	private Boolean familiar_con_problemas_cardiacos;
	
	private Boolean familiar_con_presion_arterial;
	
	private Boolean familiar_con_obesidad;
	
	private Boolean familiar_con_diabetes;
	
	private Boolean familiar_con_colesterol_elevado;
	
	private Boolean familiar_con_tos_cronica;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Boolean getProblemas_cardiacos() {
		return problemas_cardiacos;
	}

	public void setProblemas_cardiacos(Boolean problemas_cardiacos) {
		this.problemas_cardiacos = problemas_cardiacos;
	}

	public Boolean getPresion_arterial_elevada() {
		return presion_arterial_elevada;
	}

	public void setPresion_arterial_elevada(Boolean presion_arterial_elevada) {
		this.presion_arterial_elevada = presion_arterial_elevada;
	}

	public Boolean getObesidad() {
		return obesidad;
	}

	public void setObesidad(Boolean obesidad) {
		this.obesidad = obesidad;
	}

	public Boolean getAsma_bronquial() {
		return asma_bronquial;
	}

	public void setAsma_bronquial(Boolean asma_bronquial) {
		this.asma_bronquial = asma_bronquial;
	}

	public Boolean getPerdida_de_conciencia() {
		return perdida_de_conciencia;
	}

	public void setPerdida_de_conciencia(Boolean perdida_de_conciencia) {
		this.perdida_de_conciencia = perdida_de_conciencia;
	}

	public Boolean getConvulsiones() {
		return convulsiones;
	}

	public void setConvulsiones(Boolean convulsiones) {
		this.convulsiones = convulsiones;
	}

	public Boolean getTraumatisco_de_craneo() {
		return traumatisco_de_craneo;
	}

	public void setTraumatisco_de_craneo(Boolean traumatisco_de_craneo) {
		this.traumatisco_de_craneo = traumatisco_de_craneo;
	}

	public Boolean getDiabetes() {
		return diabetes;
	}

	public void setDiabetes(Boolean diabetes) {
		this.diabetes = diabetes;
	}

	public Boolean getAlteraciones_sanguineas() {
		return alteraciones_sanguineas;
	}

	public void setAlteraciones_sanguineas(Boolean alteraciones_sanguineas) {
		this.alteraciones_sanguineas = alteraciones_sanguineas;
	}

	public Boolean getAfecciones_auditivas() {
		return afecciones_auditivas;
	}

	public void setAfecciones_auditivas(Boolean afecciones_auditivas) {
		this.afecciones_auditivas = afecciones_auditivas;
	}

	public Boolean getFracturas_luxaciones_roturas_ligamentarias() {
		return fracturas_luxaciones_roturas_ligamentarias;
	}

	public void setFracturas_luxaciones_roturas_ligamentarias(Boolean fracturas_luxaciones_roturas_ligamentarias) {
		this.fracturas_luxaciones_roturas_ligamentarias = fracturas_luxaciones_roturas_ligamentarias;
	}

	public Boolean getOtros_problemas_en_huesos_y_articulaciones() {
		return otros_problemas_en_huesos_y_articulaciones;
	}

	public void setOtros_problemas_en_huesos_y_articulaciones(Boolean otros_problemas_en_huesos_y_articulaciones) {
		this.otros_problemas_en_huesos_y_articulaciones = otros_problemas_en_huesos_y_articulaciones;
	}

	public Boolean getCirugias() {
		return cirugias;
	}

	public void setCirugias(Boolean cirugias) {
		this.cirugias = cirugias;
	}

	public Boolean getInternaciones() {
		return internaciones;
	}

	public void setInternaciones(Boolean internaciones) {
		this.internaciones = internaciones;
	}

	public Boolean getEnfermedades_infecciosas() {
		return enfermedades_infecciosas;
	}

	public void setEnfermedades_infecciosas(Boolean enfermedades_infecciosas) {
		this.enfermedades_infecciosas = enfermedades_infecciosas;
	}

	public Boolean getFalta_de_organo() {
		return falta_de_organo;
	}

	public void setFalta_de_organo(Boolean falta_de_organo) {
		this.falta_de_organo = falta_de_organo;
	}

	public Boolean getAlergias() {
		return alergias;
	}

	public void setAlergias(Boolean alergias) {
		this.alergias = alergias;
	}

	public Boolean getTos_cronica() {
		return tos_cronica;
	}

	public void setTos_cronica(Boolean tos_cronica) {
		this.tos_cronica = tos_cronica;
	}

	public Boolean getMedicacion_habitual() {
		return medicacion_habitual;
	}

	public void setMedicacion_habitual(Boolean medicacion_habitual) {
		this.medicacion_habitual = medicacion_habitual;
	}

	public Boolean getAlergia_a_medicamento() {
		return alergia_a_medicamento;
	}

	public void setAlergia_a_medicamento(Boolean alergia_a_medicamento) {
		this.alergia_a_medicamento = alergia_a_medicamento;
	}

	public Boolean getConsume_minerales_energizante_suplementos() {
		return consume_minerales_energizante_suplementos;
	}

	public void setConsume_minerales_energizante_suplementos(Boolean consume_minerales_energizante_suplementos) {
		this.consume_minerales_energizante_suplementos = consume_minerales_energizante_suplementos;
	}

	public Boolean getProblemas_de_piel() {
		return problemas_de_piel;
	}

	public void setProblemas_de_piel(Boolean problemas_de_piel) {
		this.problemas_de_piel = problemas_de_piel;
	}

	public Boolean getUsa_anteojos() {
		return usa_anteojos;
	}

	public void setUsa_anteojos(Boolean usa_anteojos) {
		this.usa_anteojos = usa_anteojos;
	}

	public Boolean getConsume_alcohol_cigarros_sustancias() {
		return consume_alcohol_cigarros_sustancias;
	}

	public void setConsume_alcohol_cigarros_sustancias(Boolean consume_alcohol_cigarros_sustancias) {
		this.consume_alcohol_cigarros_sustancias = consume_alcohol_cigarros_sustancias;
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

	public Boolean getDolor_fuerte_de_pecho() {
		return dolor_fuerte_de_pecho;
	}

	public void setDolor_fuerte_de_pecho(Boolean dolor_fuerte_de_pecho) {
		this.dolor_fuerte_de_pecho = dolor_fuerte_de_pecho;
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

	public Boolean getDificultad_para_espirar() {
		return dificultad_para_espirar;
	}

	public void setDificultad_para_espirar(Boolean dificultad_para_espirar) {
		this.dificultad_para_espirar = dificultad_para_espirar;
	}

	public Boolean getFamiliar_por_muerte_subita() {
		return familiar_por_muerte_subita;
	}

	public void setFamiliar_por_muerte_subita(Boolean familiar_por_muerte_subita) {
		this.familiar_por_muerte_subita = familiar_por_muerte_subita;
	}

	public Boolean getFamiliar_con_problemas_cardiacos() {
		return familiar_con_problemas_cardiacos;
	}

	public void setFamiliar_con_problemas_cardiacos(Boolean familiar_con_problemas_cardiacos) {
		this.familiar_con_problemas_cardiacos = familiar_con_problemas_cardiacos;
	}

	public Boolean getFamiliar_con_presion_arterial() {
		return familiar_con_presion_arterial;
	}

	public void setFamiliar_con_presion_arterial(Boolean familiar_con_presion_arterial) {
		this.familiar_con_presion_arterial = familiar_con_presion_arterial;
	}

	public Boolean getFamiliar_con_obesidad() {
		return familiar_con_obesidad;
	}

	public void setFamiliar_con_obesidad(Boolean familiar_con_obesidad) {
		this.familiar_con_obesidad = familiar_con_obesidad;
	}

	public Boolean getFamiliar_con_diabetes() {
		return familiar_con_diabetes;
	}

	public void setFamiliar_con_diabetes(Boolean familiar_con_diabetes) {
		this.familiar_con_diabetes = familiar_con_diabetes;
	}

	public Boolean getFamiliar_con_colesterol_elevado() {
		return familiar_con_colesterol_elevado;
	}

	public void setFamiliar_con_colesterol_elevado(Boolean familiar_con_colesterol_elevado) {
		this.familiar_con_colesterol_elevado = familiar_con_colesterol_elevado;
	}

	public Boolean getFamiliar_con_tos_cronica() {
		return familiar_con_tos_cronica;
	}

	public void setFamiliar_con_tos_cronica(Boolean familiar_con_tos_cronica) {
		this.familiar_con_tos_cronica = familiar_con_tos_cronica;
	}

	
	
	
	
}
	
