package com.mitocode.model;




import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Consulta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne(mappedBy = "consulta", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private Turno turno;
	
	@JoinColumn(name = "doctor_id")
    @OneToOne(fetch = FetchType.LAZY)
	private Usuario usuario;
	
	@JoinColumn(name = "paciente_id")
    @ManyToOne(fetch = FetchType.LAZY)
	private Paciente paciente;
	
	@ManyToMany()
	@JoinTable(name = "consulta_diagnostico", joinColumns = @JoinColumn(name = "id_consulta", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "id_diagnostico", referencedColumnName = "id"))
	private List<Diagnostico> diagnostico;
	
	@ManyToMany()
	@JoinTable(name = "consulta_procedimiento", joinColumns = @JoinColumn(name = "id_consulta", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "id_procedimiento", referencedColumnName = "id"))
	private List<Procedimiento> procedimiento;
	

	public List<Diagnostico> getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(List<Diagnostico> diagnostico) {
		this.diagnostico = diagnostico;
	}

	public List<Procedimiento> getProcedimiento() {
		return procedimiento;
	}

	public void setProcedimiento(List<Procedimiento> procedimiento) {
		this.procedimiento = procedimiento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}



	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	


	
	
	
	
	

	
	
}
