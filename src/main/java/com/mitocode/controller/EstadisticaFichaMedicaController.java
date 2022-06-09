package com.mitocode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.dto.ConsultaFichaMedicaDTO;
import com.mitocode.model.Categoria;
import com.mitocode.service.ICategoriaService;
import com.mitocode.service.IEstadisticaService;

@RestController
@RequestMapping("/estadistica")
public class EstadisticaFichaMedicaController {

	@Autowired
	private IEstadisticaService service;
	
	@GetMapping(value = "/EstadisticaPorAfecciones_auditivas")
	public List<ConsultaFichaMedicaDTO> EstadisticaPorAfecciones_auditivas() throws Exception{
		return service.EstadisticaPorAfecciones_auditivas();
	}
	
	@GetMapping(value = "/EstadisticaPorProblemas_cardiacos")
	public List<ConsultaFichaMedicaDTO> EstadisticaPorProblemas_cardiacos() throws Exception{
		return service.EstadisticaPorProblemas_cardiacos();
	}
	
	@GetMapping(value = "/EstadisticaPorPresion_arterial_elevada")
	public List<ConsultaFichaMedicaDTO> EstadisticaPorPresion_arterial_elevada() throws Exception{
		return service.EstadisticaPorPresion_arterial_elevada();
	}
	
	@GetMapping(value = "/EstadisticaPorObesidad")
	public List<ConsultaFichaMedicaDTO> EstadisticaPorObesidad() throws Exception{
		return service.EstadisticaPorObesidad();
	}
	
	@GetMapping(value = "/EstadisticaPorAsma_bronquial")
	public List<ConsultaFichaMedicaDTO> EstadisticaPorAsma_bronquial() throws Exception{
		return service.EstadisticaPorAsma_bronquial();
	}
	
	@GetMapping(value = "/EstadisticaPorPerdida_de_conciencia")
	public List<ConsultaFichaMedicaDTO> EstadisticaPorPerdida_de_conciencia() throws Exception{
		return service.EstadisticaPorPerdida_de_conciencia();
	}
	
	@GetMapping(value = "/EstadisticaPorConvulsiones")
	public List<ConsultaFichaMedicaDTO> EstadisticaPorConvulsiones() throws Exception{
		return service.EstadisticaPorConvulsiones();
	}
	
	@GetMapping(value = "/EstadisticaPorTraumatisco_de_craneo")
	public List<ConsultaFichaMedicaDTO> EstadisticaPorTraumatisco_de_craneo() throws Exception{
		return service.EstadisticaPorTraumatisco_de_craneo();
	}
	
	@GetMapping(value = "/EstadisticaPorDiabetes")
	public List<ConsultaFichaMedicaDTO> EstadisticaPorDiabetes() throws Exception{
		return service.EstadisticaPorDiabetes();
	}
	
	@GetMapping(value = "/EstadisticaPorAlteraciones_sanguineas")
	public List<ConsultaFichaMedicaDTO> EstadisticaPorAlteraciones_sanguineas() throws Exception{
		return service.EstadisticaPorAlteraciones_sanguineas();
	}
	
	@GetMapping(value = "/EstadisticaPorFracturas_luxaciones_roturas_ligamentarias")
	public List<ConsultaFichaMedicaDTO> EstadisticaPorFracturas_luxaciones_roturas_ligamentarias() throws Exception{
		return service.EstadisticaPorFracturas_luxaciones_roturas_ligamentarias();
	}
	
	@GetMapping(value = "/EstadisticaPorOtros_problemas_en_huesos_y_articulaciones")
	public List<ConsultaFichaMedicaDTO> EstadisticaPorOtros_problemas_en_huesos_y_articulaciones() throws Exception{
		return service.EstadisticaPorOtros_problemas_en_huesos_y_articulaciones();
	}
	
	@GetMapping(value = "/EstadisticaPorCirugias")
	public List<ConsultaFichaMedicaDTO> EstadisticaPorCirugias() throws Exception{
		return service.EstadisticaPorCirugias();
	}
	
	@GetMapping(value = "/EstadisticaPorInternaciones")
	public List<ConsultaFichaMedicaDTO> EstadisticaPorInternaciones() throws Exception{
		return service.EstadisticaPorInternaciones();
	}
	
	@GetMapping(value = "/EstadisticaPorEnfermedades_infecciosas")
	public List<ConsultaFichaMedicaDTO> EstadisticaPorEnfermedades_infecciosas() throws Exception{
		return service.EstadisticaPorEnfermedades_infecciosas();
	}
	
	@GetMapping(value = "/EstadisticaPorFalta_de_organo")
	public List<ConsultaFichaMedicaDTO> EstadisticaPorFalta_de_organo() throws Exception{
		return service.EstadisticaPorFalta_de_organo();
	}
	
	@GetMapping(value = "/EstadisticaPorAlergias")
	public List<ConsultaFichaMedicaDTO> EstadisticaPorAlergias() throws Exception{
		return service.EstadisticaPorAlergias();
	}
	
	@GetMapping(value = "/EstadisticaPorTos_cronica")
	public List<ConsultaFichaMedicaDTO> EstadisticaPorTos_cronica() throws Exception{
		return service.EstadisticaPorTos_cronica();
	}
	
	@GetMapping(value = "/EstadisticaPorMedicacion_habitual")
	public List<ConsultaFichaMedicaDTO> EstadisticaPorMedicacion_habitual() throws Exception{
		return service.EstadisticaPorMedicacion_habitual();
	}
	
	@GetMapping(value = "/EstadisticaPorAlergia_a_medicamento")
	public List<ConsultaFichaMedicaDTO> EstadisticaPorAlergia_a_medicamento() throws Exception{
		return service.EstadisticaPorAlergia_a_medicamento();
	}
	
	@GetMapping(value = "/EstadisticaPorConsume_minerales_energizante_suplementos")
	public List<ConsultaFichaMedicaDTO> EstadisticaPorConsume_minerales_energizante_suplementos() throws Exception{
		return service.EstadisticaPorConsume_minerales_energizante_suplementos();
	}
	
	@GetMapping(value = "/EstadisticaPorProblemas_de_piel")
	public List<ConsultaFichaMedicaDTO> EstadisticaPorProblemas_de_piel() throws Exception{
		return service.EstadisticaPorProblemas_de_piel();
	}
	
	@GetMapping(value = "/EstadisticaPorUsa_anteojos")
	public List<ConsultaFichaMedicaDTO> EstadisticaPorUsa_anteojos() throws Exception{
		return service.EstadisticaPorUsa_anteojos();
	}
	
	@GetMapping(value = "/EstadisticaPorConsume_alcohol_cigarros_sustancias")
	public List<ConsultaFichaMedicaDTO> EstadisticaPorConsume_alcohol_cigarros_sustancias() throws Exception{
		return service.EstadisticaPorConsume_alcohol_cigarros_sustancias();
	}
	
	@GetMapping(value = "/EstadisticaPorDesmayos")
	public List<ConsultaFichaMedicaDTO> EstadisticaPorDesmayos() throws Exception{
		return service.EstadisticaPorDesmayos();
	}
	
	@GetMapping(value = "/EstadisticaPorMareos")
	public List<ConsultaFichaMedicaDTO> EstadisticaPorMareos() throws Exception{
		return service.EstadisticaPorMareos();
	}
	
	@GetMapping(value = "/EstadisticaPorDolor_fuerte_de_pecho")
	public List<ConsultaFichaMedicaDTO> EstadisticaPorDolor_fuerte_de_pecho() throws Exception{
		return service.EstadisticaPorDolor_fuerte_de_pecho();
	}
	
	@GetMapping(value = "/EstadisticaPorMayor_cansancio_que_sus_companeros")
	public List<ConsultaFichaMedicaDTO> EstadisticaPorMayor_cansancio_que_sus_companeros() throws Exception{
		return service.EstadisticaPorMayor_cansancio_que_sus_companeros();
	}
	
	@GetMapping(value = "/EstadisticaPorPalpitaciones")
	public List<ConsultaFichaMedicaDTO> EstadisticaPorPalpitaciones() throws Exception{
		return service.EstadisticaPorPalpitaciones();
	}
	
	@GetMapping(value = "/EstadisticaPorDificultad_para_respirar")
	public List<ConsultaFichaMedicaDTO> EstadisticaPorDificultad_para_respirar() throws Exception{
		return service.EstadisticaPorDificultad_para_respirar();
	}
	
	@GetMapping(value = "/EstadisticaPorFamiliar_por_muerte_subita")
	public List<ConsultaFichaMedicaDTO> EstadisticaPorFamiliar_por_muerte_subita() throws Exception{
		return service.EstadisticaPorFamiliar_por_muerte_subita();
	}
	
	@GetMapping(value = "/EstadisticaPorFamiliar_con_problemas_cardiacos")
	public List<ConsultaFichaMedicaDTO> EstadisticaPorFamiliar_con_problemas_cardiacos() throws Exception{
		return service.EstadisticaPorFamiliar_con_problemas_cardiacos();
	}
	
	@GetMapping(value = "/EstadisticaPorFamiliar_con_presion_arterial")
	public List<ConsultaFichaMedicaDTO> EstadisticaPorFamiliar_con_presion_arterial() throws Exception{
		return service.EstadisticaPorFamiliar_con_presion_arterial();
	}
	
	@GetMapping(value = "/EstadisticaPorFamiliar_con_obesidad")
	public List<ConsultaFichaMedicaDTO> EstadisticaPorFamiliar_con_obesidad() throws Exception{
		return service.EstadisticaPorFamiliar_con_obesidad();
	}
	
	@GetMapping(value = "/EstadisticaPorFamiliar_con_diabetes")
	public List<ConsultaFichaMedicaDTO> EstadisticaPorFamiliar_con_diabetes() throws Exception{
		return service.EstadisticaPorFamiliar_con_diabetes();
	}
	
	@GetMapping(value = "/EstadisticaPorFamiliar_con_colesterol_elevado")
	public List<ConsultaFichaMedicaDTO> EstadisticaPorFamiliar_con_colesterol_elevado() throws Exception{
		return service.EstadisticaPorFamiliar_con_colesterol_elevado();
	}
	
	@GetMapping(value = "/EstadisticaPorFamiliar_con_tos_cronica")
	public List<ConsultaFichaMedicaDTO> EstadisticaPorFamiliar_con_tos_cronica() throws Exception{
		return service.EstadisticaPorFamiliar_con_tos_cronica();
	}
	
	
}
