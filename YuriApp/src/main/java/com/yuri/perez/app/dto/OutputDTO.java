package com.yuri.perez.app.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OutputDTO implements Serializable{

	private static final long serialVersionUID = 4483189057262167840L;
	
	private int id;
	
	private String fechaCreacion;
	
	private String fechaFin;
	
	private List<String> fechas;
	
	private List<String> fechasFaltantes = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public List<String> getFechas() {
		return fechas;
	}

	public void setFechas(List<String> fechas) {
		this.fechas = fechas;
	}

	public List<String> getFechasFaltantes() {
		return fechasFaltantes;
	}

	public void setFechasFaltantes(List<String> fechasFaltantes) {
		this.fechasFaltantes = fechasFaltantes;
	}
	
	
}
