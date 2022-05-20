package com.mitocode.service.impl;

import java.io.File;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.mitocode.model.Ayuda;
import com.mitocode.model.Examen_Fisico;
import com.mitocode.model.Localidad;
import com.mitocode.model.Paciente;
import com.mitocode.model.Provincia;
import com.mitocode.repo.IAyudaRepo;
import com.mitocode.repo.IConsultaRepo;
import com.mitocode.repo.IExamen_FisicoRepo;
import com.mitocode.repo.ILocalidadRepo;
import com.mitocode.repo.IPacienteRepo;
import com.mitocode.repo.IProvinciaRepo;
import com.mitocode.service.IConsultaService;
import com.mitocode.service.IExamen_Fisico_Service;
import com.mitocode.service.IPacienteService;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;


@Service
public class Examen_Fisico_ServiceImpl implements IExamen_Fisico_Service {
	
	@Autowired
	private IExamen_FisicoRepo repo;
	
	@Autowired
	private IAyudaRepo ayuda_repo;

	@Override
	public List<Examen_Fisico> listarPendiente() {
		return repo.listarAprobado();
	}

	@Override
	public List<Examen_Fisico> listarRechazado() {
		return repo.listarRechazado();
	}

	@Override
	public List<Examen_Fisico> listarDesaprobado() {
		return repo.listarDesaprobado();
	}

	@Override
	public List<Examen_Fisico> listarAprobado() {
		return repo.listarAprobado();
	}

	@Override
	public List<Examen_Fisico> listar() {
		return repo.findAll();
	}

	@Override
	public Examen_Fisico registrar(Examen_Fisico p) {
		/*
		Examen_Fisico examen = new Examen_Fisico();
		Ayuda ayuda = new Ayuda();
		examen = repo.save(p);
		ayuda.setExamen_fisico(examen);
		ayuda.setEstado_medico("pendiente");
		ayuda.setEstado_pediatra("pendiente");
		ayuda_repo.save(ayuda);
		*/
		
		return repo.save(p);
	}

	@Override
	public Examen_Fisico ListarPorId(Integer id) {
		Optional<Examen_Fisico> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Examen_Fisico();
	}

	@Override
	public List<Examen_Fisico> listarCardiologoPendiente() {
		// TODO Auto-generated method stub
		return repo.listarCardiologoPendiente();
	}

	@Override
	public Examen_Fisico modificar(Examen_Fisico p) {
		// TODO Auto-generated method stub
		return repo.save(p);
	}

	@Override
	public List<Examen_Fisico> listarPediatraPendiente() {
		return repo.listarPediatraPendiente();
	}

	@Override
	public List<Examen_Fisico> listarEnfermeraPendiente() {
		return repo.listarEnfermeraPendiente();
	}





	
}
