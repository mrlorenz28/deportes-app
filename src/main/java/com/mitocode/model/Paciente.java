package com.mitocode.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Paciente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nombre;
	
	private String apellido;
	
	@Column(unique=true)
	private Integer dni;
	
	private String telefono;
	
	private String celular;
	
	private String correo;
	
	private String direccion;
	
	private Integer altura;
	
	private String sexo;
	
	
	@JsonIgnore
	@OneToMany(mappedBy = "paciente", fetch = FetchType.LAZY)
	private List<Consulta> consulta;
	
	@ManyToOne()
	@JoinColumn(name = "localidad_id")
	private Localidad localidad;
	
	@ManyToOne()
	@JoinColumn(name = "provincia_id")
	private Provincia provincia;
	
	private LocalDate fecha_de_nacimiento;
	
	@ManyToOne()
	@JoinColumn(name = "grupo_sanguineo_id")
	private Grupo_sanguineo grupo_sanguineo;
	
	private String estado_civil;
	
	@JsonIgnore
	@OneToMany(mappedBy = "paciente")
	private List<Historial_Vacuna> historial_vacuna;
	
	@OneToOne()
    @JoinColumn(name="club_id")
	private Club club;
	
	@ManyToOne()
	@JoinColumn(name = "obra_social_id")
	private Obra_Social obra_Social;
	
	private Integer numero_de_afiliado;
	
	public Integer getNumero_de_afiliado() {
		return numero_de_afiliado;
	}

	public void setNumero_de_afiliado(Integer numero_de_afiliado) {
		this.numero_de_afiliado = numero_de_afiliado;
	}

	public Ficha_Medica getFicha_medica() {
		return ficha_medica;
	}

	public void setFicha_medica(Ficha_Medica ficha_medica) {
		this.ficha_medica = ficha_medica;
	}
	
	@OneToOne(cascade=CascadeType.ALL)//one-to-one
    @JoinColumn(name="ficha_medica_id")
    private Ficha_Medica ficha_medica;
	
	@JsonIgnore
	@OneToMany(mappedBy = "paciente")
	private List<Examen_Fisico> examen;
  
	public List<Examen_Fisico> getExamen() {
		return examen;
	}

	public void setExamen(List<Examen_Fisico> examen) {
		this.examen = examen;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Obra_Social getObra_Social() {
		return obra_Social;
	}

	public void setObra_Social(Obra_Social obra_Social) {
		this.obra_Social = obra_Social;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getAltura() {
		return altura;
	}

	public void setAltura(Integer altura) {
		this.altura = altura;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}


	public Grupo_sanguineo getGrupo_sanguineo() {
		return grupo_sanguineo;
	}

	public void setGrupo_sanguineo(Grupo_sanguineo grupo_sanguineo) {
		this.grupo_sanguineo = grupo_sanguineo;
	}

	
	public LocalDate getFecha_de_nacimiento() {
		return fecha_de_nacimiento;
	}

	public void setFecha_de_nacimiento(LocalDate fecha_de_nacimiento) {
		this.fecha_de_nacimiento = fecha_de_nacimiento;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}


	public List<Consulta> getConsulta() {
		return consulta;
	}

	public void setConsulta(List<Consulta> consulta) {
		this.consulta = consulta;
	}

	public String getEstado_civil() {
		return estado_civil;
	}

	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public List<Historial_Vacuna> getHistorial_vacuna() {
		return historial_vacuna;
	}

	public void setHistorial_vacuna(List<Historial_Vacuna> historial_vacuna) {
		this.historial_vacuna = historial_vacuna;
	}



	

	
	
	

	
	
	
	
	
	
}
