package com.mitocode.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.dto.ConsultaFichaMedicaDTO;
import com.mitocode.model.Grupo_sanguineo;
import com.mitocode.model.Paciente;
import com.mitocode.repo.IEstadisticaRepo;
import com.mitocode.repo.IGrupoSanguineoRepo;
import com.mitocode.repo.IPacienteRepo;
import com.mitocode.service.IEstadisticaService;
import com.mitocode.service.IGrupoSanguineoService;
import com.mitocode.service.IPacienteService;


@Service
public class EstadisticaServiceImpl implements IEstadisticaService {

	@Autowired
	private IEstadisticaRepo repo;

	


	@Override
	public List<ConsultaFichaMedicaDTO> EstadisticaPorPresion_arterial_elevada() {
		List<ConsultaFichaMedicaDTO> consultas = new ArrayList<>();
		repo.EstadisticaPorPresion_arterial_elevada().forEach(x -> {
			ConsultaFichaMedicaDTO cr = new ConsultaFichaMedicaDTO();
			cr.setCantidad(Integer.parseInt(String.valueOf(x[0])));
			cr.setSi(Integer.parseInt(String.valueOf(x[1])));
			cr.setNo(Integer.parseInt(String.valueOf(x[2])));
			consultas.add(cr);
		});
		return consultas;
	}

	@Override
	public List<ConsultaFichaMedicaDTO> EstadisticaPorObesidad() {
		List<ConsultaFichaMedicaDTO> consultas = new ArrayList<>();
		repo.EstadisticaPorObesidad().forEach(x -> {
			ConsultaFichaMedicaDTO cr = new ConsultaFichaMedicaDTO();
			cr.setCantidad(Integer.parseInt(String.valueOf(x[0])));
			cr.setSi(Integer.parseInt(String.valueOf(x[1])));
			cr.setNo(Integer.parseInt(String.valueOf(x[2])));
			consultas.add(cr);
		});
		return consultas;
	}

	@Override
	public List<ConsultaFichaMedicaDTO> EstadisticaPorAsma_bronquial() {
		List<ConsultaFichaMedicaDTO> consultas = new ArrayList<>();
		repo.EstadisticaPorAsma_bronquial().forEach(x -> {
			ConsultaFichaMedicaDTO cr = new ConsultaFichaMedicaDTO();
			cr.setCantidad(Integer.parseInt(String.valueOf(x[0])));
			cr.setSi(Integer.parseInt(String.valueOf(x[1])));
			cr.setNo(Integer.parseInt(String.valueOf(x[2])));
			consultas.add(cr);
		});
		return consultas;
	}

	@Override
	public List<ConsultaFichaMedicaDTO> EstadisticaPorPerdida_de_conciencia() {
		List<ConsultaFichaMedicaDTO> consultas = new ArrayList<>();
		repo.EstadisticaPorPerdida_de_conciencia().forEach(x -> {
			ConsultaFichaMedicaDTO cr = new ConsultaFichaMedicaDTO();
			cr.setCantidad(Integer.parseInt(String.valueOf(x[0])));
			cr.setSi(Integer.parseInt(String.valueOf(x[1])));
			cr.setNo(Integer.parseInt(String.valueOf(x[2])));
			consultas.add(cr);
		});
		return consultas;
	}

	@Override
	public List<ConsultaFichaMedicaDTO> EstadisticaPorConvulsiones() {
		List<ConsultaFichaMedicaDTO> consultas = new ArrayList<>();
		repo.EstadisticaPorConvulsiones().forEach(x -> {
			ConsultaFichaMedicaDTO cr = new ConsultaFichaMedicaDTO();
			cr.setCantidad(Integer.parseInt(String.valueOf(x[0])));
			cr.setSi(Integer.parseInt(String.valueOf(x[1])));
			cr.setNo(Integer.parseInt(String.valueOf(x[2])));
			consultas.add(cr);
		});
		return consultas;
	}

	@Override
	public List<ConsultaFichaMedicaDTO> EstadisticaPorTraumatisco_de_craneo() {
		List<ConsultaFichaMedicaDTO> consultas = new ArrayList<>();
		repo.EstadisticaPorTraumatisco_de_craneo().forEach(x -> {
			ConsultaFichaMedicaDTO cr = new ConsultaFichaMedicaDTO();
			cr.setCantidad(Integer.parseInt(String.valueOf(x[0])));
			cr.setSi(Integer.parseInt(String.valueOf(x[1])));
			cr.setNo(Integer.parseInt(String.valueOf(x[2])));
			consultas.add(cr);
		});
		return consultas;
	}

	@Override
	public List<ConsultaFichaMedicaDTO> EstadisticaPorDiabetes() {
		List<ConsultaFichaMedicaDTO> consultas = new ArrayList<>();
		repo.EstadisticaPorDiabetes().forEach(x -> {
			ConsultaFichaMedicaDTO cr = new ConsultaFichaMedicaDTO();
			cr.setCantidad(Integer.parseInt(String.valueOf(x[0])));
			cr.setSi(Integer.parseInt(String.valueOf(x[1])));
			cr.setNo(Integer.parseInt(String.valueOf(x[2])));
			consultas.add(cr);
		});
		return consultas;
	}

	@Override
	public List<ConsultaFichaMedicaDTO> EstadisticaPorAlteraciones_sanguineas() {
		List<ConsultaFichaMedicaDTO> consultas = new ArrayList<>();
		repo.EstadisticaPorAlteraciones_sanguineas().forEach(x -> {
			ConsultaFichaMedicaDTO cr = new ConsultaFichaMedicaDTO();
			cr.setCantidad(Integer.parseInt(String.valueOf(x[0])));
			cr.setSi(Integer.parseInt(String.valueOf(x[1])));
			cr.setNo(Integer.parseInt(String.valueOf(x[2])));
			consultas.add(cr);
		});
		return consultas;
	}

	@Override
	public List<ConsultaFichaMedicaDTO> EstadisticaPorFracturas_luxaciones_roturas_ligamentarias() {
		List<ConsultaFichaMedicaDTO> consultas = new ArrayList<>();
		repo.EstadisticaPorFracturas_luxaciones_roturas_ligamentarias().forEach(x -> {
			ConsultaFichaMedicaDTO cr = new ConsultaFichaMedicaDTO();
			cr.setCantidad(Integer.parseInt(String.valueOf(x[0])));
			cr.setSi(Integer.parseInt(String.valueOf(x[1])));
			cr.setNo(Integer.parseInt(String.valueOf(x[2])));
			consultas.add(cr);
		});
		return consultas;
	}

	@Override
	public List<ConsultaFichaMedicaDTO> EstadisticaPorOtros_problemas_en_huesos_y_articulaciones() {
		List<ConsultaFichaMedicaDTO> consultas = new ArrayList<>();
		repo.EstadisticaPorOtros_problemas_en_huesos_y_articulaciones().forEach(x -> {
			ConsultaFichaMedicaDTO cr = new ConsultaFichaMedicaDTO();
			cr.setCantidad(Integer.parseInt(String.valueOf(x[0])));
			cr.setSi(Integer.parseInt(String.valueOf(x[1])));
			cr.setNo(Integer.parseInt(String.valueOf(x[2])));
			consultas.add(cr);
		});
		return consultas;
	}

	@Override
	public List<ConsultaFichaMedicaDTO> EstadisticaPorCirugias() {
		List<ConsultaFichaMedicaDTO> consultas = new ArrayList<>();
		repo.EstadisticaPorCirugias().forEach(x -> {
			ConsultaFichaMedicaDTO cr = new ConsultaFichaMedicaDTO();
			cr.setCantidad(Integer.parseInt(String.valueOf(x[0])));
			cr.setSi(Integer.parseInt(String.valueOf(x[1])));
			cr.setNo(Integer.parseInt(String.valueOf(x[2])));
			consultas.add(cr);
		});
		return consultas;
	}

	@Override
	public List<ConsultaFichaMedicaDTO> EstadisticaPorInternaciones() {
		List<ConsultaFichaMedicaDTO> consultas = new ArrayList<>();
		repo.EstadisticaPorInternaciones().forEach(x -> {
			ConsultaFichaMedicaDTO cr = new ConsultaFichaMedicaDTO();
			cr.setCantidad(Integer.parseInt(String.valueOf(x[0])));
			cr.setSi(Integer.parseInt(String.valueOf(x[1])));
			cr.setNo(Integer.parseInt(String.valueOf(x[2])));
			consultas.add(cr);
		});
		return consultas;
	}

	@Override
	public List<ConsultaFichaMedicaDTO> EstadisticaPorEnfermedades_infecciosas() {
		List<ConsultaFichaMedicaDTO> consultas = new ArrayList<>();
		repo.EstadisticaPorEnfermedades_infecciosas().forEach(x -> {
			ConsultaFichaMedicaDTO cr = new ConsultaFichaMedicaDTO();
			cr.setCantidad(Integer.parseInt(String.valueOf(x[0])));
			cr.setSi(Integer.parseInt(String.valueOf(x[1])));
			cr.setNo(Integer.parseInt(String.valueOf(x[2])));
			consultas.add(cr);
		});
		return consultas;
	}

	@Override
	public List<ConsultaFichaMedicaDTO> EstadisticaPorFalta_de_organo() {
		List<ConsultaFichaMedicaDTO> consultas = new ArrayList<>();
		repo.EstadisticaPorFalta_de_organo().forEach(x -> {
			ConsultaFichaMedicaDTO cr = new ConsultaFichaMedicaDTO();
			cr.setCantidad(Integer.parseInt(String.valueOf(x[0])));
			cr.setSi(Integer.parseInt(String.valueOf(x[1])));
			cr.setNo(Integer.parseInt(String.valueOf(x[2])));
			consultas.add(cr);
		});
		return consultas;
	}

	@Override
	public List<ConsultaFichaMedicaDTO> EstadisticaPorAlergias() {
		List<ConsultaFichaMedicaDTO> consultas = new ArrayList<>();
		repo.EstadisticaPorAlergias().forEach(x -> {
			ConsultaFichaMedicaDTO cr = new ConsultaFichaMedicaDTO();
			cr.setCantidad(Integer.parseInt(String.valueOf(x[0])));
			cr.setSi(Integer.parseInt(String.valueOf(x[1])));
			cr.setNo(Integer.parseInt(String.valueOf(x[2])));
			consultas.add(cr);
		});
		return consultas;
	}

	@Override
	public List<ConsultaFichaMedicaDTO> EstadisticaPorTos_cronica() {
		List<ConsultaFichaMedicaDTO> consultas = new ArrayList<>();
		repo.EstadisticaPorTos_cronica().forEach(x -> {
			ConsultaFichaMedicaDTO cr = new ConsultaFichaMedicaDTO();
			cr.setCantidad(Integer.parseInt(String.valueOf(x[0])));
			cr.setSi(Integer.parseInt(String.valueOf(x[1])));
			cr.setNo(Integer.parseInt(String.valueOf(x[2])));
			consultas.add(cr);
		});
		return consultas;
	}

	@Override
	public List<ConsultaFichaMedicaDTO> EstadisticaPorMedicacion_habitual() {
		List<ConsultaFichaMedicaDTO> consultas = new ArrayList<>();
		repo.EstadisticaPorMedicacion_habitual().forEach(x -> {
			ConsultaFichaMedicaDTO cr = new ConsultaFichaMedicaDTO();
			cr.setCantidad(Integer.parseInt(String.valueOf(x[0])));
			cr.setSi(Integer.parseInt(String.valueOf(x[1])));
			cr.setNo(Integer.parseInt(String.valueOf(x[2])));
			consultas.add(cr);
		});
		return consultas;
	}

	@Override
	public List<ConsultaFichaMedicaDTO> EstadisticaPorAlergia_a_medicamento() {
		List<ConsultaFichaMedicaDTO> consultas = new ArrayList<>();
		repo.EstadisticaPorAlergia_a_medicamento().forEach(x -> {
			ConsultaFichaMedicaDTO cr = new ConsultaFichaMedicaDTO();
			cr.setCantidad(Integer.parseInt(String.valueOf(x[0])));
			cr.setSi(Integer.parseInt(String.valueOf(x[1])));
			cr.setNo(Integer.parseInt(String.valueOf(x[2])));
			consultas.add(cr);
		});
		return consultas;
	}

	@Override
	public List<ConsultaFichaMedicaDTO> EstadisticaPorConsume_minerales_energizante_suplementos() {
		List<ConsultaFichaMedicaDTO> consultas = new ArrayList<>();
		repo.EstadisticaPorConsume_minerales_energizante_suplementos().forEach(x -> {
			ConsultaFichaMedicaDTO cr = new ConsultaFichaMedicaDTO();
			cr.setCantidad(Integer.parseInt(String.valueOf(x[0])));
			cr.setSi(Integer.parseInt(String.valueOf(x[1])));
			cr.setNo(Integer.parseInt(String.valueOf(x[2])));
			consultas.add(cr);
		});
		return consultas;
	}

	@Override
	public List<ConsultaFichaMedicaDTO> EstadisticaPorProblemas_de_piel() {
		List<ConsultaFichaMedicaDTO> consultas = new ArrayList<>();
		repo.EstadisticaPorProblemas_de_piel().forEach(x -> {
			ConsultaFichaMedicaDTO cr = new ConsultaFichaMedicaDTO();
			cr.setCantidad(Integer.parseInt(String.valueOf(x[0])));
			cr.setSi(Integer.parseInt(String.valueOf(x[1])));
			cr.setNo(Integer.parseInt(String.valueOf(x[2])));
			consultas.add(cr);
		});
		return consultas;
	}

	@Override
	public List<ConsultaFichaMedicaDTO> EstadisticaPorUsa_anteojos() {
		List<ConsultaFichaMedicaDTO> consultas = new ArrayList<>();
		repo.EstadisticaPorUsa_anteojos().forEach(x -> {
			ConsultaFichaMedicaDTO cr = new ConsultaFichaMedicaDTO();
			cr.setCantidad(Integer.parseInt(String.valueOf(x[0])));
			cr.setSi(Integer.parseInt(String.valueOf(x[1])));
			cr.setNo(Integer.parseInt(String.valueOf(x[2])));
			consultas.add(cr);
		});
		return consultas;
	}

	@Override
	public List<ConsultaFichaMedicaDTO> EstadisticaPorConsume_alcohol_cigarros_sustancias() {
		List<ConsultaFichaMedicaDTO> consultas = new ArrayList<>();
		repo.EstadisticaPorConsume_alcohol_cigarros_sustancias().forEach(x -> {
			ConsultaFichaMedicaDTO cr = new ConsultaFichaMedicaDTO();
			cr.setCantidad(Integer.parseInt(String.valueOf(x[0])));
			cr.setSi(Integer.parseInt(String.valueOf(x[1])));
			cr.setNo(Integer.parseInt(String.valueOf(x[2])));
			consultas.add(cr);
		});
		return consultas;
	}

	@Override
	public List<ConsultaFichaMedicaDTO> EstadisticaPorDesmayos() {
		List<ConsultaFichaMedicaDTO> consultas = new ArrayList<>();
		repo.EstadisticaPorDesmayos().forEach(x -> {
			ConsultaFichaMedicaDTO cr = new ConsultaFichaMedicaDTO();
			cr.setCantidad(Integer.parseInt(String.valueOf(x[0])));
			cr.setSi(Integer.parseInt(String.valueOf(x[1])));
			cr.setNo(Integer.parseInt(String.valueOf(x[2])));
			consultas.add(cr);
		});
		return consultas;
	}

	@Override
	public List<ConsultaFichaMedicaDTO> EstadisticaPorMareos() {
		List<ConsultaFichaMedicaDTO> consultas = new ArrayList<>();
		repo.EstadisticaPorMareos().forEach(x -> {
			ConsultaFichaMedicaDTO cr = new ConsultaFichaMedicaDTO();
			cr.setCantidad(Integer.parseInt(String.valueOf(x[0])));
			cr.setSi(Integer.parseInt(String.valueOf(x[1])));
			cr.setNo(Integer.parseInt(String.valueOf(x[2])));
			consultas.add(cr);
		});
		return consultas;
	}

	@Override
	public List<ConsultaFichaMedicaDTO> EstadisticaPorDolor_fuerte_de_pecho() {
		List<ConsultaFichaMedicaDTO> consultas = new ArrayList<>();
		repo.EstadisticaPorDolor_fuerte_de_pecho().forEach(x -> {
			ConsultaFichaMedicaDTO cr = new ConsultaFichaMedicaDTO();
			cr.setCantidad(Integer.parseInt(String.valueOf(x[0])));
			cr.setSi(Integer.parseInt(String.valueOf(x[1])));
			cr.setNo(Integer.parseInt(String.valueOf(x[2])));
			consultas.add(cr);
		});
		return consultas;
	}

	@Override
	public List<ConsultaFichaMedicaDTO> EstadisticaPorMayor_cansancio_que_sus_companeros() {
		List<ConsultaFichaMedicaDTO> consultas = new ArrayList<>();
		repo.EstadisticaPorMayor_cansancio_que_sus_companeros().forEach(x -> {
			ConsultaFichaMedicaDTO cr = new ConsultaFichaMedicaDTO();
			cr.setCantidad(Integer.parseInt(String.valueOf(x[0])));
			cr.setSi(Integer.parseInt(String.valueOf(x[1])));
			cr.setNo(Integer.parseInt(String.valueOf(x[2])));
			consultas.add(cr);
		});
		return consultas;
	}

	@Override
	public List<ConsultaFichaMedicaDTO> EstadisticaPorPalpitaciones() {
		List<ConsultaFichaMedicaDTO> consultas = new ArrayList<>();
		repo.EstadisticaPorPalpitaciones().forEach(x -> {
			ConsultaFichaMedicaDTO cr = new ConsultaFichaMedicaDTO();
			cr.setCantidad(Integer.parseInt(String.valueOf(x[0])));
			cr.setSi(Integer.parseInt(String.valueOf(x[1])));
			cr.setNo(Integer.parseInt(String.valueOf(x[2])));
			consultas.add(cr);
		});
		return consultas;
	}

	@Override
	public List<ConsultaFichaMedicaDTO> EstadisticaPorDificultad_para_respirar() {
		List<ConsultaFichaMedicaDTO> consultas = new ArrayList<>();
		repo.EstadisticaPorDificultad_para_respirar().forEach(x -> {
			ConsultaFichaMedicaDTO cr = new ConsultaFichaMedicaDTO();
			cr.setCantidad(Integer.parseInt(String.valueOf(x[0])));
			cr.setSi(Integer.parseInt(String.valueOf(x[1])));
			cr.setNo(Integer.parseInt(String.valueOf(x[2])));
			consultas.add(cr);
		});
		return consultas;
	}

	@Override
	public List<ConsultaFichaMedicaDTO> EstadisticaPorFamiliar_por_muerte_subita() {
		List<ConsultaFichaMedicaDTO> consultas = new ArrayList<>();
		repo.EstadisticaPorFamiliar_por_muerte_subita().forEach(x -> {
			ConsultaFichaMedicaDTO cr = new ConsultaFichaMedicaDTO();
			cr.setCantidad(Integer.parseInt(String.valueOf(x[0])));
			cr.setSi(Integer.parseInt(String.valueOf(x[1])));
			cr.setNo(Integer.parseInt(String.valueOf(x[2])));
			consultas.add(cr);
		});
		return consultas;
	}

	@Override
	public List<ConsultaFichaMedicaDTO> EstadisticaPorFamiliar_con_problemas_cardiacos() {
		List<ConsultaFichaMedicaDTO> consultas = new ArrayList<>();
		repo.EstadisticaPorFamiliar_con_problemas_cardiacos().forEach(x -> {
			ConsultaFichaMedicaDTO cr = new ConsultaFichaMedicaDTO();
			cr.setCantidad(Integer.parseInt(String.valueOf(x[0])));
			cr.setSi(Integer.parseInt(String.valueOf(x[1])));
			cr.setNo(Integer.parseInt(String.valueOf(x[2])));
			consultas.add(cr);
		});
		return consultas;
	}

	@Override
	public List<ConsultaFichaMedicaDTO> EstadisticaPorFamiliar_con_presion_arterial() {
		List<ConsultaFichaMedicaDTO> consultas = new ArrayList<>();
		repo.EstadisticaPorFamiliar_con_presion_arterial().forEach(x -> {
			ConsultaFichaMedicaDTO cr = new ConsultaFichaMedicaDTO();
			cr.setCantidad(Integer.parseInt(String.valueOf(x[0])));
			cr.setSi(Integer.parseInt(String.valueOf(x[1])));
			cr.setNo(Integer.parseInt(String.valueOf(x[2])));
			consultas.add(cr);
		});
		return consultas;
	}

	@Override
	public List<ConsultaFichaMedicaDTO> EstadisticaPorFamiliar_con_obesidad() {
		List<ConsultaFichaMedicaDTO> consultas = new ArrayList<>();
		repo.EstadisticaPorFamiliar_con_obesidad().forEach(x -> {
			ConsultaFichaMedicaDTO cr = new ConsultaFichaMedicaDTO();
			cr.setCantidad(Integer.parseInt(String.valueOf(x[0])));
			cr.setSi(Integer.parseInt(String.valueOf(x[1])));
			cr.setNo(Integer.parseInt(String.valueOf(x[2])));
			consultas.add(cr);
		});
		return consultas;
	}

	@Override
	public List<ConsultaFichaMedicaDTO> EstadisticaPorFamiliar_con_diabetes() {
		List<ConsultaFichaMedicaDTO> consultas = new ArrayList<>();
		repo.EstadisticaPorFamiliar_con_diabetes().forEach(x -> {
			ConsultaFichaMedicaDTO cr = new ConsultaFichaMedicaDTO();
			cr.setCantidad(Integer.parseInt(String.valueOf(x[0])));
			cr.setSi(Integer.parseInt(String.valueOf(x[1])));
			cr.setNo(Integer.parseInt(String.valueOf(x[2])));
			consultas.add(cr);
		});
		return consultas;
	}

	@Override
	public List<ConsultaFichaMedicaDTO> EstadisticaPorFamiliar_con_colesterol_elevado() {
		List<ConsultaFichaMedicaDTO> consultas = new ArrayList<>();
		repo.EstadisticaPorFamiliar_con_colesterol_elevado().forEach(x -> {
			ConsultaFichaMedicaDTO cr = new ConsultaFichaMedicaDTO();
			cr.setCantidad(Integer.parseInt(String.valueOf(x[0])));
			cr.setSi(Integer.parseInt(String.valueOf(x[1])));
			cr.setNo(Integer.parseInt(String.valueOf(x[2])));
			consultas.add(cr);
		});
		return consultas;
	}

	@Override
	public List<ConsultaFichaMedicaDTO> EstadisticaPorFamiliar_con_tos_cronica() {
		List<ConsultaFichaMedicaDTO> consultas = new ArrayList<>();
		repo.EstadisticaPorFamiliar_con_tos_cronica().forEach(x -> {
			ConsultaFichaMedicaDTO cr = new ConsultaFichaMedicaDTO();
			cr.setCantidad(Integer.parseInt(String.valueOf(x[0])));
			cr.setSi(Integer.parseInt(String.valueOf(x[1])));
			cr.setNo(Integer.parseInt(String.valueOf(x[2])));
			consultas.add(cr);
		});
		return consultas;
	}

	@Override
	public List<ConsultaFichaMedicaDTO> EstadisticaPorProblemas_cardiacos() {
		List<ConsultaFichaMedicaDTO> consultas = new ArrayList<>();
		repo.EstadisticaPorProblemas_cardiacos().forEach(x -> {
			ConsultaFichaMedicaDTO cr = new ConsultaFichaMedicaDTO();
			cr.setCantidad(Integer.parseInt(String.valueOf(x[0])));
			cr.setSi(Integer.parseInt(String.valueOf(x[1])));
			cr.setNo(Integer.parseInt(String.valueOf(x[2])));
			consultas.add(cr);
		});
		return consultas;
	}

	@Override
	public List<ConsultaFichaMedicaDTO> EstadisticaPorAfecciones_auditivas() {
		List<ConsultaFichaMedicaDTO> consultas = new ArrayList<>();
		repo.EstadisticaPorAfecciones_auditivas().forEach(x -> {
			ConsultaFichaMedicaDTO cr = new ConsultaFichaMedicaDTO();
			cr.setCantidad(Integer.parseInt(String.valueOf(x[0])));
			cr.setSi(Integer.parseInt(String.valueOf(x[1])));
			cr.setNo(Integer.parseInt(String.valueOf(x[2])));
			consultas.add(cr);
		});
		return consultas;
	}

	
	
	
}
