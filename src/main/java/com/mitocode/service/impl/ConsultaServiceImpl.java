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

import com.mitocode.model.Localidad;
import com.mitocode.model.Paciente;
import com.mitocode.model.Provincia;
import com.mitocode.repo.IConsultaRepo;
import com.mitocode.repo.ILocalidadRepo;
import com.mitocode.repo.IPacienteRepo;
import com.mitocode.repo.IProvinciaRepo;
import com.mitocode.service.IConsultaService;
import com.mitocode.service.IPacienteService;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;


@Service
public class ConsultaServiceImpl implements IConsultaService {

	@Autowired
	private IConsultaRepo repo;
	
	@Autowired
	private IProvinciaRepo repoProvincia;
	
	@Autowired
	private ILocalidadRepo repoLocalidad;
	

	@Override
	public List<Paciente> listar() throws Exception {
		return repo.findAll();
	}

	@Override
	public Paciente ListarPorId(Integer id) throws Exception {
		
		Optional<Paciente> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Paciente();
	}
	
	@Override
	public List<Paciente> ListarPorApellido(String apellido) throws Exception {
		return repo.listarPorApellido(apellido);
	}
	
	@Override
	public Paciente ListarPorDni(Integer dni) throws Exception {
		return repo.listarPorDni(dni);
	}
	

	
	@Override
	public byte[] generarReporte(Integer dni) {
		byte[] data = null;
		Paciente p = null;
		try {
			p = this.ListarPorDni(dni);
			System.out.println(p.getApellido());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			
		}

		Map<String, Object> parametros = new HashMap<String, Object>();
		parametros.put("txt_dni", p.getDni());
		parametros.put("txt_nombre", p.getNombre() + " " + p.getApellido());
		parametros.put("txt_dia", p.getFecha_de_nacimiento().getDayOfMonth());
		parametros.put("txt_mes", p.getFecha_de_nacimiento().getMonthValue());
		parametros.put("txt_año", p.getFecha_de_nacimiento().getYear());
		DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		try {
			File file = new ClassPathResource("/reports/dni.jasper").getFile();
			JasperPrint print = JasperFillManager.fillReport(file.getPath(), parametros, new JREmptyDataSource());
			data = JasperExportManager.exportReportToPdf(print);
			// mitocode jasperreports | excel, pdf, ppt, word, csv
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	@Override
	public void eliminar(Integer id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Provincia> listarProvincia() {
		// TODO Auto-generated method stub
		return repoProvincia.findAll();
	}

	@Override
	public List<Localidad> ListarLocalidadPorId(Integer id) throws Exception {
		return repoLocalidad.ListarLocalidadPorId(id);
	}

	
}
