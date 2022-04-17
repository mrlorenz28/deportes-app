package com.mitocode.controller;

import java.time.LocalDate;

import java.time.LocalTime;
import java.time.Month;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.model.Usuario;
import com.mitocode.model.HorariosDoctor;
import com.mitocode.model.Turno;
import com.mitocode.service.HorariosDoctorService;
import com.mitocode.service.ITurnoService;

@RestController
@RequestMapping("/turno")
public class TurnoController {

	@Autowired
	private ITurnoService service;
	
	@Autowired
	private HorariosDoctorService serviceHorarios;

	@GetMapping
	public List<Turno> listar() throws Exception {
		return service.listar();
	}

	@GetMapping("/{id}")
	public Turno ListarPorId(@PathVariable("id") Integer id) throws Exception {
		return service.ListarPorId(id);
	}
	
	@GetMapping("/listarPorDoctorFecha/{id}/{fecha}")
	public List<Turno> UsuarioFecha(@PathVariable("id") Integer id, @PathVariable("fecha") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate fecha) throws Exception {
		return service.UsuarioFecha(id, fecha);
	}	
	
	@GetMapping("/proximos")
	public List<Turno> ListarProximos() throws Exception {
		return service.listarProximos();
	}	
	
	@GetMapping("/listarPorMedico/{id_doctor}/{idCategoria}/{fecha}")
	public List<Turno> ListarPorMedicoCategoriaFecha(@PathVariable("id_doctor") Integer id_doctor, @PathVariable("idCategoria") Integer idCategoria, @PathVariable("fecha") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate fecha) throws Exception {
		return service.listarPorMedicoCategoriaFecha(id_doctor, idCategoria, fecha);
	}
	
	@GetMapping("/listarPorMedicoFechaDisponibilidad/{id_doctor}/{fecha}/{estado}")
	public List<Turno> List(@PathVariable("id_doctor") Integer id_doctor, @PathVariable("fecha") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate fecha, @PathVariable("estado") String estado) throws Exception {
		return service.listarPorMedicoFechaDisponibilidad(id_doctor, fecha, estado);
		}
	
	@GetMapping("/buscarDisponible/{id}/{fecha}")
	public List<Turno> listarDisponiblePorFecha(@PathVariable("id") Integer id, @PathVariable("fecha") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate fecha) throws Exception {
		return service.listarDisponiblePorFecha(id, fecha);
	}

	@PostMapping() 
	public Turno registrar(@RequestBody HorariosDoctor p) throws Exception {
	
		
		// fecha actual
		LocalDate fecha = LocalDate.now();
		LocalTime desde = p.getHora_inicio();
		LocalTime hasta = p.getHora_final();
		Integer intervalo = p.getIntervalo();
		while (fecha.getMonth() != Month.SEPTEMBER) {
			LocalTime variable = p.getHora_inicio();
			fecha = fecha.plusDays(1);

				System.out.println(fecha);
				System.out.println(p.getCategoria().getNombre());
			switch (fecha.getDayOfWeek()) {

			case MONDAY: {

				if (p.getDia() == 1) {

					// while final que agrega los horarios
					while (variable != hasta) {
						Turno turno = new Turno();

						variable = variable.plusMinutes(intervalo);
						turno.setFecha(fecha);
						turno.setHora(variable);
						turno.setUsuario(p.getUsuario());
						turno.setEstado("disponible");
						turno.setCategoria(p.getCategoria());
						
						service.registrar(turno);

					}
				}

				break;
			}

			case TUESDAY: {

				if (p.getDia() == 2) {

					// while final que agrega los horarios
					while (variable != hasta) {
						Turno turno = new Turno();

						variable = variable.plusMinutes(intervalo);
						turno.setFecha(fecha);
						turno.setHora(variable);
						turno.setUsuario(p.getUsuario());
						turno.setEstado("disponible");
						turno.setCategoria(p.getCategoria());

						service.registrar(turno);
					}
				}

				break;
			}

			case WEDNESDAY: {

				if (p.getDia() == 3) {

					// while final que agrega los horarios
					while (variable != hasta) {
						Turno turno = new Turno();

						variable = variable.plusMinutes(intervalo);
						turno.setFecha(fecha);
						turno.setHora(variable);
						turno.setUsuario(p.getUsuario());
						turno.setEstado("disponible");
						turno.setCategoria(p.getCategoria());

						service.registrar(turno);
					}
				}

				break;
			}

			case THURSDAY: {

				if (p.getDia() == 4) {

					// while final que agrega los horarios
					while (variable != hasta) {
						Turno turno = new Turno();

						variable = variable.plusMinutes(intervalo);
						turno.setFecha(fecha);
						turno.setHora(variable);
						turno.setUsuario(p.getUsuario());
						turno.setEstado("disponible");
						turno.setCategoria(p.getCategoria());

						service.registrar(turno);
					}
				}

				break;
			}

			case FRIDAY: {

				if (p.getDia() == 5) {

					while (variable != hasta) {
						Turno turno = new Turno();

						variable = variable.plusMinutes(intervalo);
						turno.setFecha(fecha);
						turno.setHora(variable);
						turno.setUsuario(p.getUsuario());
						turno.setEstado("disponible");
						turno.setCategoria(p.getCategoria());

						service.registrar(turno);
					}
				}

				break;
			}

			case SATURDAY: {

				if (p.getDia() == 6) {

					// while final que agrega los horarios
					while (variable != hasta) {
						Turno turno = new Turno();
						variable = variable.plusMinutes(intervalo);
						turno.setFecha(fecha);
						turno.setHora(variable);
						turno.setUsuario(p.getUsuario());
						turno.setEstado("disponible");
						turno.setCategoria(p.getCategoria());

						service.registrar(turno);
					}
				}

				break;
			}

			case SUNDAY: {

				if (p.getDia() == 7) {

					// while final que agrega los horarios
					while (variable != hasta) {
						Turno turno = new Turno();

						variable = variable.plusMinutes(intervalo);
						turno.setFecha(fecha);
						turno.setHora(variable);
						turno.setUsuario(p.getUsuario());
						turno.setEstado("disponible");
						turno.setCategoria(p.getCategoria());

						service.registrar(turno);
					}
				}

				break;
			}

			}

		}
		this.serviceHorarios.registrar(p);
		return null;
		
		
		
	}
	
	/*
	 * @PostMapping() public Turno registrar(@RequestBody HorariosUsuario p) throws
	 * Exception {
	 * 
	 * 
	 * 
	 * // fecha actual LocalDate fecha = LocalDate.now(); LocalTime desde =
	 * p.getHora_inicio(); LocalTime hasta = p.getHora_final(); Integer intervalo =
	 * p.getIntervalo(); System.out.println(desde + "" + hasta + "" + intervalo);
	 * 
	 * while (fecha.getMonth() != Month.AUGUST) { LocalTime variable =
	 * p.getHora_inicio(); fecha = fecha.plusDays(1);
	 * 
	 * System.out.println(fecha);
	 * 
	 * switch (fecha.getDayOfWeek()) {
	 * 
	 * case MONDAY: {
	 * 
	 * if (p.isLunes() == true) {
	 * 
	 * // while final que agrega los horarios while (variable != hasta) { Turno
	 * turno = new Turno();
	 * 
	 * variable = variable.plusMinutes(intervalo); turno.setFecha(fecha);
	 * turno.setHora(variable); turno.setUsuario(p.getUsuario());
	 * turno.setEstado("disponible");
	 * 
	 * service.registrar(turno);
	 * 
	 * } }
	 * 
	 * break; }
	 * 
	 * case TUESDAY: {
	 * 
	 * if (p.isMartes() == true) {
	 * 
	 * // while final que agrega los horarios while (variable != hasta) { Turno
	 * turno = new Turno();
	 * 
	 * variable = variable.plusMinutes(intervalo); turno.setFecha(fecha);
	 * turno.setHora(variable); turno.setUsuario(p.getUsuario());
	 * turno.setEstado("disponible"); service.registrar(turno); } }
	 * 
	 * break; }
	 * 
	 * case WEDNESDAY: {
	 * 
	 * if (p.isMiercoles() == true) { System.out.println(p.isMartes());
	 * 
	 * // while final que agrega los horarios while (variable != hasta) { Turno
	 * turno = new Turno();
	 * 
	 * variable = variable.plusMinutes(intervalo); turno.setFecha(fecha);
	 * turno.setHora(variable); turno.setUsuario(p.getUsuario());
	 * turno.setEstado("disponible"); service.registrar(turno); } }
	 * 
	 * break; }
	 * 
	 * case THURSDAY: {
	 * 
	 * if (p.isJueves() == true) {
	 * 
	 * // while final que agrega los horarios while (variable != hasta) { Turno
	 * turno = new Turno();
	 * 
	 * variable = variable.plusMinutes(intervalo); turno.setFecha(fecha);
	 * turno.setHora(variable); turno.setUsuario(p.getUsuario());
	 * turno.setEstado("disponible"); service.registrar(turno); } }
	 * 
	 * break; }
	 * 
	 * case FRIDAY: {
	 * 
	 * if (p.isViernes() == true) { System.out.println(p.isMartes());
	 * 
	 * while (variable != hasta) { Turno turno = new Turno();
	 * 
	 * variable = variable.plusMinutes(intervalo); turno.setFecha(fecha);
	 * turno.setHora(variable); turno.setUsuario(p.getUsuario());
	 * turno.setEstado("disponible"); service.registrar(turno); } }
	 * 
	 * break; }
	 * 
	 * case SATURDAY: {
	 * 
	 * if (p.isSabado() == true) {
	 * 
	 * // while final que agrega los horarios while (variable != hasta) { Turno
	 * turno = new Turno(); variable = variable.plusMinutes(intervalo);
	 * turno.setFecha(fecha); turno.setHora(variable);
	 * turno.setUsuario(p.getUsuario()); turno.setEstado("disponible");
	 * service.registrar(turno); } }
	 * 
	 * break; }
	 * 
	 * case SUNDAY: {
	 * 
	 * if (p.isDomingo() == true) {
	 * 
	 * // while final que agrega los horarios while (variable != hasta) { Turno
	 * turno = new Turno();
	 * 
	 * variable = variable.plusMinutes(intervalo); turno.setFecha(fecha);
	 * turno.setHora(variable); turno.setUsuario(p.getUsuario());
	 * turno.setEstado("disponible"); service.registrar(turno); } }
	 * 
	 * break; }
	 * 
	 * }
	 * 
	 * } return null; }
	 */

	
	
	@PutMapping
	public Turno modificar(@RequestBody Turno p) throws Exception {
		return service.modificar(p);
	}

	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) throws Exception {
		service.eliminar(id);
	}
}
