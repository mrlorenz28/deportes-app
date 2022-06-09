package com.mitocode.model;



import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Ficha_Medica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	//informacion de salud
	private String problemas_cardiacos;
	
	private String presion_arterial_elevada;
	
	private String obesidad;
	
	private String asma_bronquial;
	
	private String perdida_de_conciencia;
	
	private String convulsiones;
	
	private String traumatisco_de_craneo;
	
	private String diabetes;
	
	private String alteraciones_sanguineas;
	
	private String afecciones_auditivas;
	
	private String fracturas_luxaciones_roturas_ligamentarias;
	
	private String otros_problemas_en_huesos_y_articulaciones;
	
	private String cirugias;
	
	private String internaciones;
	
	private String enfermedades_infecciosas;
	
	private String falta_de_organo;
	
	private String alergias;
	
	private String tos_cronica;
	
	private String medicacion_habitual;
	
	private String alergia_a_medicamento;
	
	private String consume_minerales_energizante_suplementos;
	
	private String problemas_de_piel;
	
	private String usa_anteojos;
	
	private String consume_alcohol_cigarros_sustancias;
	
	//en relacion al ejercicio
	private String desmayos;
	
	private String mareos;
	
	private String dolor_fuerte_de_pecho;
	
	private String mayor_cansancio_que_sus_companeros;
	
	private String palpitaciones;
		
	private String dificultad_para_respirar;
	
	//antecedentes de familiares
	
	private String familiar_por_muerte_subita;
	
	private String familiar_con_problemas_cardiacos;
	
	private String familiar_con_presion_arterial;
	
	private String familiar_con_obesidad;
	
	private String familiar_con_diabetes;
	
	private String familiar_con_colesterol_elevado;
	
	private String familiar_con_tos_cronica;
	

	
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getProblemas_cardiacos() {
		return problemas_cardiacos;
	}

	public void setProblemas_cardiacos(String problemas_cardiacos) {
		this.problemas_cardiacos = problemas_cardiacos;
	}

	public String getPresion_arterial_elevada() {
		return presion_arterial_elevada;
	}

	public void setPresion_arterial_elevada(String presion_arterial_elevada) {
		this.presion_arterial_elevada = presion_arterial_elevada;
	}

	public String getObesidad() {
		return obesidad;
	}

	public void setObesidad(String obesidad) {
		this.obesidad = obesidad;
	}

	public String getAsma_bronquial() {
		return asma_bronquial;
	}

	public void setAsma_bronquial(String asma_bronquial) {
		this.asma_bronquial = asma_bronquial;
	}

	public String getPerdida_de_conciencia() {
		return perdida_de_conciencia;
	}

	public void setPerdida_de_conciencia(String perdida_de_conciencia) {
		this.perdida_de_conciencia = perdida_de_conciencia;
	}

	public String getConvulsiones() {
		return convulsiones;
	}

	public void setConvulsiones(String convulsiones) {
		this.convulsiones = convulsiones;
	}

	public String getTraumatisco_de_craneo() {
		return traumatisco_de_craneo;
	}

	public void setTraumatisco_de_craneo(String traumatisco_de_craneo) {
		this.traumatisco_de_craneo = traumatisco_de_craneo;
	}

	public String getDiabetes() {
		return diabetes;
	}

	public void setDiabetes(String diabetes) {
		this.diabetes = diabetes;
	}

	public String getAlteraciones_sanguineas() {
		return alteraciones_sanguineas;
	}

	public void setAlteraciones_sanguineas(String alteraciones_sanguineas) {
		this.alteraciones_sanguineas = alteraciones_sanguineas;
	}

	public String getAfecciones_auditivas() {
		return afecciones_auditivas;
	}

	public void setAfecciones_auditivas(String afecciones_auditivas) {
		this.afecciones_auditivas = afecciones_auditivas;
	}

	public String getFracturas_luxaciones_roturas_ligamentarias() {
		return fracturas_luxaciones_roturas_ligamentarias;
	}

	public void setFracturas_luxaciones_roturas_ligamentarias(String fracturas_luxaciones_roturas_ligamentarias) {
		this.fracturas_luxaciones_roturas_ligamentarias = fracturas_luxaciones_roturas_ligamentarias;
	}

	public String getOtros_problemas_en_huesos_y_articulaciones() {
		return otros_problemas_en_huesos_y_articulaciones;
	}

	public void setOtros_problemas_en_huesos_y_articulaciones(String otros_problemas_en_huesos_y_articulaciones) {
		this.otros_problemas_en_huesos_y_articulaciones = otros_problemas_en_huesos_y_articulaciones;
	}

	public String getCirugias() {
		return cirugias;
	}

	public void setCirugias(String cirugias) {
		this.cirugias = cirugias;
	}

	public String getInternaciones() {
		return internaciones;
	}

	public void setInternaciones(String internaciones) {
		this.internaciones = internaciones;
	}

	public String getEnfermedades_infecciosas() {
		return enfermedades_infecciosas;
	}

	public void setEnfermedades_infecciosas(String enfermedades_infecciosas) {
		this.enfermedades_infecciosas = enfermedades_infecciosas;
	}

	public String getFalta_de_organo() {
		return falta_de_organo;
	}

	public void setFalta_de_organo(String falta_de_organo) {
		this.falta_de_organo = falta_de_organo;
	}

	public String getAlergias() {
		return alergias;
	}

	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}

	public String getTos_cronica() {
		return tos_cronica;
	}

	public void setTos_cronica(String tos_cronica) {
		this.tos_cronica = tos_cronica;
	}

	public String getMedicacion_habitual() {
		return medicacion_habitual;
	}

	public void setMedicacion_habitual(String medicacion_habitual) {
		this.medicacion_habitual = medicacion_habitual;
	}

	public String getAlergia_a_medicamento() {
		return alergia_a_medicamento;
	}

	public void setAlergia_a_medicamento(String alergia_a_medicamento) {
		this.alergia_a_medicamento = alergia_a_medicamento;
	}

	public String getConsume_minerales_energizante_suplementos() {
		return consume_minerales_energizante_suplementos;
	}

	public void setConsume_minerales_energizante_suplementos(String consume_minerales_energizante_suplementos) {
		this.consume_minerales_energizante_suplementos = consume_minerales_energizante_suplementos;
	}

	public String getProblemas_de_piel() {
		return problemas_de_piel;
	}

	public void setProblemas_de_piel(String problemas_de_piel) {
		this.problemas_de_piel = problemas_de_piel;
	}

	public String getUsa_anteojos() {
		return usa_anteojos;
	}

	public void setUsa_anteojos(String usa_anteojos) {
		this.usa_anteojos = usa_anteojos;
	}

	public String getConsume_alcohol_cigarros_sustancias() {
		return consume_alcohol_cigarros_sustancias;
	}

	public void setConsume_alcohol_cigarros_sustancias(String consume_alcohol_cigarros_sustancias) {
		this.consume_alcohol_cigarros_sustancias = consume_alcohol_cigarros_sustancias;
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

	public String getDolor_fuerte_de_pecho() {
		return dolor_fuerte_de_pecho;
	}

	public void setDolor_fuerte_de_pecho(String dolor_fuerte_de_pecho) {
		this.dolor_fuerte_de_pecho = dolor_fuerte_de_pecho;
	}



	public String getPalpitaciones() {
		return palpitaciones;
	}

	public void setPalpitaciones(String palpitaciones) {
		this.palpitaciones = palpitaciones;
	}



	public String getMayor_cansancio_que_sus_companeros() {
		return mayor_cansancio_que_sus_companeros;
	}

	public void setMayor_cansancio_que_sus_companeros(String mayor_cansancio_que_sus_companeros) {
		this.mayor_cansancio_que_sus_companeros = mayor_cansancio_que_sus_companeros;
	}

	public String getDificultad_para_respirar() {
		return dificultad_para_respirar;
	}

	public void setDificultad_para_respirar(String dificultad_para_respirar) {
		this.dificultad_para_respirar = dificultad_para_respirar;
	}

	public String getFamiliar_por_muerte_subita() {
		return familiar_por_muerte_subita;
	}

	public void setFamiliar_por_muerte_subita(String familiar_por_muerte_subita) {
		this.familiar_por_muerte_subita = familiar_por_muerte_subita;
	}

	public String getFamiliar_con_problemas_cardiacos() {
		return familiar_con_problemas_cardiacos;
	}

	public void setFamiliar_con_problemas_cardiacos(String familiar_con_problemas_cardiacos) {
		this.familiar_con_problemas_cardiacos = familiar_con_problemas_cardiacos;
	}

	public String getFamiliar_con_presion_arterial() {
		return familiar_con_presion_arterial;
	}

	public void setFamiliar_con_presion_arterial(String familiar_con_presion_arterial) {
		this.familiar_con_presion_arterial = familiar_con_presion_arterial;
	}

	public String getFamiliar_con_obesidad() {
		return familiar_con_obesidad;
	}

	public void setFamiliar_con_obesidad(String familiar_con_obesidad) {
		this.familiar_con_obesidad = familiar_con_obesidad;
	}

	public String getFamiliar_con_diabetes() {
		return familiar_con_diabetes;
	}

	public void setFamiliar_con_diabetes(String familiar_con_diabetes) {
		this.familiar_con_diabetes = familiar_con_diabetes;
	}

	public String getFamiliar_con_colesterol_elevado() {
		return familiar_con_colesterol_elevado;
	}

	public void setFamiliar_con_colesterol_elevado(String familiar_con_colesterol_elevado) {
		this.familiar_con_colesterol_elevado = familiar_con_colesterol_elevado;
	}

	public String getFamiliar_con_tos_cronica() {
		return familiar_con_tos_cronica;
	}

	public void setFamiliar_con_tos_cronica(String familiar_con_tos_cronica) {
		this.familiar_con_tos_cronica = familiar_con_tos_cronica;
	}

	
	
	
	
}
	
