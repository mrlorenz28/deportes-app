package com.mitocode.dto;

public class ConsultaFichaMedicaDTO {

	private Integer cantidad;
	private Integer si;
	private Integer no;


	public ConsultaFichaMedicaDTO() {

	}

	public ConsultaFichaMedicaDTO(Integer cantidad, Integer si, Integer no) {
		super();
		this.cantidad = cantidad;
		this.si = si;
		this.no = no;

	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Integer getSi() {
		return si;
	}

	public void setSi(Integer si) {
		this.si = si;
	}

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}



}
