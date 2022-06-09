package com.mitocode.service;

import java.util.List;

import com.mitocode.dto.ConsultaFichaMedicaDTO;
import com.mitocode.model.Especialidad;

public interface IEstadisticaService  {

	List<ConsultaFichaMedicaDTO> EstadisticaPorAfecciones_auditivas();
	
	List<ConsultaFichaMedicaDTO> EstadisticaPorProblemas_cardiacos();
	
	List<ConsultaFichaMedicaDTO> EstadisticaPorPresion_arterial_elevada();

	List<ConsultaFichaMedicaDTO> EstadisticaPorObesidad();

	List<ConsultaFichaMedicaDTO> EstadisticaPorAsma_bronquial();

	List<ConsultaFichaMedicaDTO> EstadisticaPorPerdida_de_conciencia();

	List<ConsultaFichaMedicaDTO> EstadisticaPorConvulsiones();

	List<ConsultaFichaMedicaDTO> EstadisticaPorTraumatisco_de_craneo();

	List<ConsultaFichaMedicaDTO> EstadisticaPorDiabetes();

	List<ConsultaFichaMedicaDTO> EstadisticaPorAlteraciones_sanguineas();

	List<ConsultaFichaMedicaDTO> EstadisticaPorFracturas_luxaciones_roturas_ligamentarias();

	List<ConsultaFichaMedicaDTO> EstadisticaPorOtros_problemas_en_huesos_y_articulaciones();

	List<ConsultaFichaMedicaDTO> EstadisticaPorCirugias();

	List<ConsultaFichaMedicaDTO> EstadisticaPorInternaciones();

	List<ConsultaFichaMedicaDTO> EstadisticaPorEnfermedades_infecciosas();

	List<ConsultaFichaMedicaDTO> EstadisticaPorFalta_de_organo();
	
	List<ConsultaFichaMedicaDTO> EstadisticaPorAlergias();

	List<ConsultaFichaMedicaDTO> EstadisticaPorTos_cronica();

	List<ConsultaFichaMedicaDTO> EstadisticaPorMedicacion_habitual();

	List<ConsultaFichaMedicaDTO> EstadisticaPorAlergia_a_medicamento();
	
	List<ConsultaFichaMedicaDTO> EstadisticaPorConsume_minerales_energizante_suplementos();

	List<ConsultaFichaMedicaDTO> EstadisticaPorProblemas_de_piel();

	List<ConsultaFichaMedicaDTO> EstadisticaPorUsa_anteojos();

	List<ConsultaFichaMedicaDTO> EstadisticaPorConsume_alcohol_cigarros_sustancias();

	List<ConsultaFichaMedicaDTO> EstadisticaPorDesmayos();

	List<ConsultaFichaMedicaDTO> EstadisticaPorMareos();

	List<ConsultaFichaMedicaDTO> EstadisticaPorDolor_fuerte_de_pecho();

	List<ConsultaFichaMedicaDTO> EstadisticaPorMayor_cansancio_que_sus_companeros();

	List<ConsultaFichaMedicaDTO> EstadisticaPorPalpitaciones();

	List<ConsultaFichaMedicaDTO> EstadisticaPorDificultad_para_respirar();

	List<ConsultaFichaMedicaDTO> EstadisticaPorFamiliar_por_muerte_subita();

	List<ConsultaFichaMedicaDTO> EstadisticaPorFamiliar_con_problemas_cardiacos();
	
	List<ConsultaFichaMedicaDTO> EstadisticaPorFamiliar_con_presion_arterial();

	List<ConsultaFichaMedicaDTO> EstadisticaPorFamiliar_con_obesidad();

	List<ConsultaFichaMedicaDTO> EstadisticaPorFamiliar_con_diabetes();

	List<ConsultaFichaMedicaDTO> EstadisticaPorFamiliar_con_colesterol_elevado();
	
	List<ConsultaFichaMedicaDTO> EstadisticaPorFamiliar_con_tos_cronica();

	

	
}
