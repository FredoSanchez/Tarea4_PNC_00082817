package com.uca.capas.Tarea4.domain;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {
	
	@Size(min=12, max=12, message="El codigo del producto debe tener exactamente 12 caracteres")
	private String codigo;
	
	@Size(min = 1, max = 100, message ="El nombre de producto debe contener minimo 1 y maximo 100 caracteres")
	private String nombre;
	
	@Size(min = 1, max = 100, message ="La marca del producto debe contener almenos 1 y maximo 100 caracters")
	private String marca;
	
	@Size(min = 1, max = 500, message ="La marca del producto debe contener almenos 1 y maximo 500 caracters")
	private String descripcion;
	
	@Digits(integer=10, fraction=0, message="Existencias debe ser un numero entero")
	private String existencias;
	
	@NotEmpty(message="La fecha no puede estar vacia")
	@Pattern(regexp = "^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$",message = "La fecha no cumple con el formato dd/mm/yyyy")
	private String fechaIngreso;
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getExistencias() {
		return existencias;
	}
	public void setExistencias(String existencias) {
		this.existencias = existencias;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	
}
