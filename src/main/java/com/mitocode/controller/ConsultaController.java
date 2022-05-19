package com.mitocode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.model.Diagnostico;
import com.mitocode.model.Grupo_sanguineo;
import com.mitocode.model.Historial_Vacuna;
import com.mitocode.model.Localidad;
import com.mitocode.model.Medicamento;
import com.mitocode.model.Paciente;
import com.mitocode.model.Procedimiento;
import com.mitocode.model.Provincia;
import com.mitocode.model.Vacuna;
import com.mitocode.repo.IDiagnosticoRepo;
import com.mitocode.repo.IHistorial_VacunasRepo;
import com.mitocode.repo.IMedicamentoRepo;
import com.mitocode.repo.IProcedimientoRepo;
import com.mitocode.repo.IVacunaRepo;
import com.mitocode.service.IConsultaService;
import com.mitocode.service.IHistorial_VacunasService;
import com.mitocode.service.IPacienteService;



@RestController
@RequestMapping("/consulta")
public class ConsultaController {

	@Autowired
	private IPacienteService paciente;
	
	@Autowired
	private IDiagnosticoRepo diagnostico;
	
	@Autowired
	private IProcedimientoRepo procedimiento;
	
	@Autowired
	private IMedicamentoRepo medicamento;
	
	@Autowired
	private IConsultaService consulta;
	
	
	
	@GetMapping("/provincia")
	public List<Provincia> listarProvincia() throws Exception{
		return consulta.listarProvincia();
	}
	
	@GetMapping("/localidad/{id}")
	public List<Localidad> listarLocalidad(@PathVariable("id") Integer id) throws Exception{
		return consulta.ListarLocalidadPorId(id);
	}

	@GetMapping
	public List<Paciente> listar() throws Exception{
		return paciente.listar();
	}
	
	@GetMapping("/{id}")
	public Paciente ListarPorId(@PathVariable("id") Integer id) throws Exception{
		return paciente.ListarPorId(id);
	}
	
	@GetMapping("/dni/{dni}")
	public Paciente ListarPorDni(@PathVariable("dni") Integer dni) throws Exception{
		return paciente.ListarPorDni(dni);
	}
	

	@GetMapping("/apellido/{apellido}")
	public List<Paciente> ListarPorApellido(@PathVariable("apellido") String apellido) throws Exception{
		return paciente.ListarPorApellido(apellido);
	}
	
	
	@GetMapping(value = "/generarReporte/dni/{dni}", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
	public ResponseEntity<byte[]> generarReporte(@PathVariable("dni") Integer dni) {
		byte[] data = null;
		data = consulta.generarReporte(dni);
		return new ResponseEntity<byte[]>(data, HttpStatus.OK);
	}
	
	@PostMapping
	public Paciente registrar(@RequestBody Paciente p) throws Exception {
		return paciente.registrar(p);
	}
	
	
	@GetMapping("/diagnostico")
	public List<Diagnostico> ListarDiagnostico() throws Exception{
		return diagnostico.findAll();
	}
	
	@GetMapping("/procedimiento")
	public List<Procedimiento> ListarProcedimiento() throws Exception{
		return procedimiento.findAll();
	}
	
	@GetMapping("/medicamento")
	public List<Medicamento> ListarMedicamentos() throws Exception{
		return medicamento.findAll();
	}
	
	
	
	
}
