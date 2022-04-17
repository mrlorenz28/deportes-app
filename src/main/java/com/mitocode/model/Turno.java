package com.mitocode.model;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Turno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario", nullable=false, foreignKey = @ForeignKey(name = "FK_turno_profesional"))
	private Usuario usuario;
	
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "id_paciente", nullable=true, foreignKey = @ForeignKey(name = "FK_turno_paciente"))
	private Paciente paciente;
	
	@JoinColumn(name = "consutla_id")
    @OneToOne(fetch = FetchType.LAZY)
	private Consulta consulta;
	
	
	@ManyToOne()
	@JoinColumn(name = "id_categoria", nullable=true)
	private Categoria categoria;
	
	private LocalDateTime fechaAsignacion;
	
	private LocalDate fecha;
	
	private LocalTime hora;
		
	private String estado;
	
	private Boolean presente;

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFechaAsignacion() {
		return fechaAsignacion;
	}

	public void setFechaAsignacion(LocalDateTime fechaAsignacion) {
		this.fechaAsignacion = fechaAsignacion;
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

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	
	

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Boolean getPresente() {
		return presente;
	}

	public void setPresente(Boolean presente) {
		this.presente = presente;
	}
	
	
	

}
