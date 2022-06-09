package com.mitocode.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mitocode.dto.ConsultaFichaMedicaDTO;
import com.mitocode.model.Ficha_Medica;
import com.mitocode.model.Localidad;
import com.mitocode.model.Paciente;


public interface IEstadisticaRepo extends JpaRepository<Ficha_Medica, Integer> {


	
	@Query(value="select count(*) as cantidad,\r\n"
			+ "(select count(*) from ficha_medica f where problemas_cardiacos = 'Si') as Si,\r\n"
			+ "(select count(*) from ficha_medica f where problemas_cardiacos = 'No') as No\r\n"
			+ "from ficha_medica f", nativeQuery = true)
	List<Object[]> EstadisticaPorProblemas_cardiacos();
	
	@Query(value="select count(*) as cantidad,\r\n"
			+ "(select count(*) from ficha_medica f where presion_arterial_elevada = 'Si') as Si,\r\n"
			+ "(select count(*) from ficha_medica f where presion_arterial_elevada = 'No') as No\r\n"
			+ "from ficha_medica f", nativeQuery = true)
	List<Object[]> EstadisticaPorPresion_arterial_elevada();
	
	@Query(value="select count(*) as cantidad,\r\n"
			+ "(select count(*) from ficha_medica f where obesidad = 'Si') as Si,\r\n"
			+ "(select count(*) from ficha_medica f where obesidad = 'No') as No\r\n"
			+ "from ficha_medica f", nativeQuery = true)
	List<Object[]> EstadisticaPorObesidad();
	
	@Query(value="select count(*) as cantidad,\r\n"
			+ "(select count(*) from ficha_medica f where asma_bronquial = 'Si') as Si,\r\n"
			+ "(select count(*) from ficha_medica f where asma_bronquial = 'No') as No\r\n"
			+ "from ficha_medica f", nativeQuery = true)
	List<Object[]> EstadisticaPorAsma_bronquial();
	
	@Query(value="select count(*) as cantidad,\r\n"
			+ "(select count(*) from ficha_medica f where perdida_de_conciencia = 'Si') as Si,\r\n"
			+ "(select count(*) from ficha_medica f where perdida_de_conciencia = 'No') as No\r\n"
			+ "from ficha_medica f", nativeQuery = true)
	List<Object[]> EstadisticaPorPerdida_de_conciencia();
	
	@Query(value="select count(*) as cantidad,\r\n"
			+ "(select count(*) from ficha_medica f where diabetes = 'Si') as Si,\r\n"
			+ "(select count(*) from ficha_medica f where diabetes = 'No') as No\r\n"
			+ "from ficha_medica f", nativeQuery = true)
	List<Object[]> EstadisticaPorDiabetes();
	
	@Query(value="select count(*) as cantidad,\r\n"
			+ "(select count(*) from ficha_medica f where alteraciones_sanguineas = 'Si') as Si,\r\n"
			+ "(select count(*) from ficha_medica f where alteraciones_sanguineas = 'No') as No\r\n"
			+ "from ficha_medica f", nativeQuery = true)
	List<Object[]> EstadisticaPorAlteraciones_sanguineas();
	
	@Query(value="select count(*) as cantidad,\r\n"
			+ "(select count(*) from ficha_medica f where afecciones_auditivas = 'Si') as Si,\r\n"
			+ "(select count(*) from ficha_medica f where afecciones_auditivas = 'No') as No\r\n"
			+ "from ficha_medica f", nativeQuery = true)
	List<Object[]> EstadisticaPorAfecciones_auditivas();
	
	@Query(value="select count(*) as cantidad,\r\n"
			+ "(select count(*) from ficha_medica f where fracturas_luxaciones_roturas_ligamentarias = 'Si') as Si,\r\n"
			+ "(select count(*) from ficha_medica f where fracturas_luxaciones_roturas_ligamentarias = 'No') as No\r\n"
			+ "from ficha_medica f", nativeQuery = true)
	List<Object[]> EstadisticaPorFracturas_luxaciones_roturas_ligamentarias();
	
	@Query(value="select count(*) as cantidad,\r\n"
			+ "(select count(*) from ficha_medica f where otros_problemas_en_huesos_y_articulaciones = 'Si') as Si,\r\n"
			+ "(select count(*) from ficha_medica f where otros_problemas_en_huesos_y_articulaciones = 'No') as No\r\n"
			+ "from ficha_medica f", nativeQuery = true)
	List<Object[]> EstadisticaPorOtros_problemas_en_huesos_y_articulaciones();
	
	@Query(value="select count(*) as cantidad,\r\n"
			+ "(select count(*) from ficha_medica f where cirugias = 'Si') as Si,\r\n"
			+ "(select count(*) from ficha_medica f where cirugias = 'No') as No\r\n"
			+ "from ficha_medica f", nativeQuery = true)
	List<Object[]> EstadisticaPorCirugias();
	
	@Query(value="select count(*) as cantidad,\r\n"
			+ "(select count(*) from ficha_medica f where internaciones = 'Si') as Si,\r\n"
			+ "(select count(*) from ficha_medica f where internaciones = 'No') as No\r\n"
			+ "from ficha_medica f", nativeQuery = true)
	List<Object[]> EstadisticaPorInternaciones();
	
	@Query(value="select count(*) as cantidad,\r\n"
			+ "(select count(*) from ficha_medica f where falta_de_organo = 'Si') as Si,\r\n"
			+ "(select count(*) from ficha_medica f where falta_de_organo = 'No') as No\r\n"
			+ "from ficha_medica f", nativeQuery = true)
	List<Object[]> EstadisticaPorFalta_de_organo();
	
	@Query(value="select count(*) as cantidad,\r\n"
			+ "(select count(*) from ficha_medica f where alergias = 'Si') as Si,\r\n"
			+ "(select count(*) from ficha_medica f where alergias = 'No') as No\r\n"
			+ "from ficha_medica f", nativeQuery = true)
	List<Object[]> EstadisticaPorAlergias();
	
	@Query(value="select count(*) as cantidad,\r\n"
			+ "(select count(*) from ficha_medica f where tos_cronica = 'Si') as Si,\r\n"
			+ "(select count(*) from ficha_medica f where tos_cronica = 'No') as No\r\n"
			+ "from ficha_medica f", nativeQuery = true)
	List<Object[]> EstadisticaPorTos_cronica();
	
	@Query(value="select count(*) as cantidad,\r\n"
			+ "(select count(*) from ficha_medica f where medicacion_habitual = 'Si') as Si,\r\n"
			+ "(select count(*) from ficha_medica f where medicacion_habitual = 'No') as No\r\n"
			+ "from ficha_medica f", nativeQuery = true)
	List<Object[]> EstadisticaPorMedicacion_habitual();
	
	@Query(value="select count(*) as cantidad,\r\n"
			+ "(select count(*) from ficha_medica f where alergia_a_medicamento = 'Si') as Si,\r\n"
			+ "(select count(*) from ficha_medica f where alergia_a_medicamento = 'No') as No\r\n"
			+ "from ficha_medica f", nativeQuery = true)
	List<Object[]> EstadisticaPorAlergia_a_medicamento();
	
	@Query(value="select count(*) as cantidad,\r\n"
			+ "(select count(*) from ficha_medica f where consume_minerales_energizante_suplementos = 'Si') as Si,\r\n"
			+ "(select count(*) from ficha_medica f where consume_minerales_energizante_suplementos = 'No') as No\r\n"
			+ "from ficha_medica f", nativeQuery = true)
	List<Object[]> EstadisticaPorConsume_minerales_energizante_suplementos();
	
	@Query(value="select count(*) as cantidad,\r\n"
			+ "(select count(*) from ficha_medica f where problemas_de_piel = 'Si') as Si,\r\n"
			+ "(select count(*) from ficha_medica f where problemas_de_piel = 'No') as No\r\n"
			+ "from ficha_medica f", nativeQuery = true)
	List<Object[]> EstadisticaPorProblemas_de_piel();
	
	@Query(value="select count(*) as cantidad,\r\n"
			+ "(select count(*) from ficha_medica f where usa_anteojos = 'Si') as Si,\r\n"
			+ "(select count(*) from ficha_medica f where usa_anteojos = 'No') as No\r\n"
			+ "from ficha_medica f", nativeQuery = true)
	List<Object[]> EstadisticaPorUsa_anteojos();
	
	@Query(value="select count(*) as cantidad,\r\n"
			+ "(select count(*) from ficha_medica f where consume_alcohol_cigarros_sustancias = 'Si') as Si,\r\n"
			+ "(select count(*) from ficha_medica f where consume_alcohol_cigarros_sustancias = 'No') as No\r\n"
			+ "from ficha_medica f", nativeQuery = true)
	List<Object[]> EstadisticaPorConsume_alcohol_cigarros_sustancias();
	
	@Query(value="select count(*) as cantidad,\r\n"
			+ "(select count(*) from ficha_medica f where desmayos = 'Si') as Si,\r\n"
			+ "(select count(*) from ficha_medica f where desmayos = 'No') as No\r\n"
			+ "from ficha_medica f", nativeQuery = true)
	List<Object[]> EstadisticaPorDesmayos();
	
	@Query(value="select count(*) as cantidad,\r\n"
			+ "(select count(*) from ficha_medica f where mareos = 'Si') as Si,\r\n"
			+ "(select count(*) from ficha_medica f where mareos = 'No') as No\r\n"
			+ "from ficha_medica f", nativeQuery = true)
	List<Object[]> EstadisticaPorMareos();
	
	@Query(value="select count(*) as cantidad,\r\n"
			+ "(select count(*) from ficha_medica f where dolor_fuerte_de_pecho = 'Si') as Si,\r\n"
			+ "(select count(*) from ficha_medica f where dolor_fuerte_de_pecho = 'No') as No\r\n"
			+ "from ficha_medica f", nativeQuery = true)
	List<Object[]> EstadisticaPorDolor_fuerte_de_pecho();
	
	@Query(value="select count(*) as cantidad,\r\n"
			+ "(select count(*) from ficha_medica f where mayor_cansancio_que_sus_companeros = 'Si') as Si,\r\n"
			+ "(select count(*) from ficha_medica f where mayor_cansancio_que_sus_companeros = 'No') as No\r\n"
			+ "from ficha_medica f", nativeQuery = true)
	List<Object[]> EstadisticaPorMayor_cansancio_que_sus_companeros();
	
	@Query(value="select count(*) as cantidad,\r\n"
			+ "(select count(*) from ficha_medica f where palpitaciones = 'Si') as Si,\r\n"
			+ "(select count(*) from ficha_medica f where palpitaciones = 'No') as No\r\n"
			+ "from ficha_medica f", nativeQuery = true)
	List<Object[]> EstadisticaPorPalpitaciones();
	
	@Query(value="select count(*) as cantidad,\r\n"
			+ "(select count(*) from ficha_medica f where dificultad_para_respirar = 'Si') as Si,\r\n"
			+ "(select count(*) from ficha_medica f where dificultad_para_respirar = 'No') as No\r\n"
			+ "from ficha_medica f", nativeQuery = true)
	List<Object[]> EstadisticaPorDificultad_para_respirar();
	
	@Query(value="select count(*) as cantidad,\r\n"
			+ "(select count(*) from ficha_medica f where familiar_por_muerte_subita = 'Si') as Si,\r\n"
			+ "(select count(*) from ficha_medica f where familiar_por_muerte_subita = 'No') as No\r\n"
			+ "from ficha_medica f", nativeQuery = true)
	List<Object[]> EstadisticaPorFamiliar_por_muerte_subita();
	
	@Query(value="select count(*) as cantidad,\r\n"
			+ "(select count(*) from ficha_medica f where familiar_con_problemas_cardiacos = 'Si') as Si,\r\n"
			+ "(select count(*) from ficha_medica f where familiar_con_problemas_cardiacos = 'No') as No\r\n"
			+ "from ficha_medica f", nativeQuery = true)
	List<Object[]> EstadisticaPorFamiliar_con_problemas_cardiacos();
	
	@Query(value="select count(*) as cantidad,\r\n"
			+ "(select count(*) from ficha_medica f where familiar_con_presion_arterial = 'Si') as Si,\r\n"
			+ "(select count(*) from ficha_medica f where familiar_con_presion_arterial = 'No') as No\r\n"
			+ "from ficha_medica f", nativeQuery = true)
	List<Object[]> EstadisticaPorFamiliar_con_presion_arterial();
	
	@Query(value="select count(*) as cantidad,\r\n"
			+ "(select count(*) from ficha_medica f where familiar_con_obesidad = 'Si') as Si,\r\n"
			+ "(select count(*) from ficha_medica f where familiar_con_obesidad = 'No') as No\r\n"
			+ "from ficha_medica f", nativeQuery = true)
	List<Object[]> EstadisticaPorFamiliar_con_obesidad();
	
	@Query(value="select count(*) as cantidad,\r\n"
			+ "(select count(*) from ficha_medica f where familiar_con_diabetes = 'Si') as Si,\r\n"
			+ "(select count(*) from ficha_medica f where familiar_con_diabetes = 'No') as No\r\n"
			+ "from ficha_medica f", nativeQuery = true)
	List<Object[]> EstadisticaPorFamiliar_con_diabetes();
	
	@Query(value="select count(*) as cantidad,\r\n"
			+ "(select count(*) from ficha_medica f where familiar_con_colesterol_elevado = 'Si') as Si,\r\n"
			+ "(select count(*) from ficha_medica f where familiar_con_colesterol_elevado = 'No') as No\r\n"
			+ "from ficha_medica f", nativeQuery = true)
	List<Object[]> EstadisticaPorFamiliar_con_colesterol_elevado();
	
	@Query(value="select count(*) as cantidad,\r\n"
			+ "(select count(*) from ficha_medica f where familiar_con_tos_cronica = 'Si') as Si,\r\n"
			+ "(select count(*) from ficha_medica f where familiar_con_tos_cronica = 'No') as No\r\n"
			+ "from ficha_medica f", nativeQuery = true)
	List<Object[]> EstadisticaPorFamiliar_con_tos_cronica();

	@Query(value="select count(*) as cantidad,\r\n"
			+ "(select count(*) from ficha_medica f where traumatisco_de_craneo = 'Si') as Si,\r\n"
			+ "(select count(*) from ficha_medica f where traumatisco_de_craneo = 'No') as No\r\n"
			+ "from ficha_medica f", nativeQuery = true)
	List<Object[]> EstadisticaPorTraumatisco_de_craneo();

	@Query(value="select count(*) as cantidad,\r\n"
			+ "(select count(*) from ficha_medica f where enfermedades_infecciosas = 'Si') as Si,\r\n"
			+ "(select count(*) from ficha_medica f where enfermedades_infecciosas = 'No') as No\r\n"
			+ "from ficha_medica f", nativeQuery = true)
	List<Object[]> EstadisticaPorEnfermedades_infecciosas();
	
	@Query(value="select count(*) as cantidad,\r\n"
			+ "(select count(*) from ficha_medica f where convulsiones = 'Si') as Si,\r\n"
			+ "(select count(*) from ficha_medica f where convulsiones = 'No') as No\r\n"
			+ "from ficha_medica f", nativeQuery = true)
	List<Object[]> EstadisticaPorConvulsiones();

	
	
	
}
	