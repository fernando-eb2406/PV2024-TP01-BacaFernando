package ar.edu.unju.fi.ejercicio17.model;

import java.time.LocalDate;

public class Jugador {
	
	private String nombre;
	private String apellido;
	private LocalDate fechaDeNacimiento;
	private String nacionalidad;
	private Double estatura;
	private Double peso;
	private String posicion;
	
	public Jugador() {
		// TODO Auto-generated constructor stub
	}
	
	public Jugador(String nombre, String apellido, LocalDate fechaDeNacimiento, String nacionalidad, Double estatura,
			Double peso, String posicion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.nacionalidad = nacionalidad;
		this.estatura = estatura;
		this.peso = peso;
		this.posicion = posicion;
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

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Double getEstatura() {
		return estatura;
	}

	public void setEstatura(Double estatura) {
		this.estatura = estatura;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public Integer calcularEdad() {
		LocalDate fechaActual = LocalDate.now();
		Integer edad = fechaActual.getYear() - fechaDeNacimiento.getYear();
		Boolean diferenciaAnio = fechaActual.getYear() - fechaDeNacimiento.getYear() >= 18;
		Boolean diferenciaMes = fechaActual.getMonthValue() - fechaDeNacimiento.getMonthValue() >= 0;
		Boolean diferenciaDia = fechaActual.getDayOfMonth() - fechaDeNacimiento.getDayOfMonth() >= 0;
		
		if (!(diferenciaAnio && diferenciaMes && diferenciaDia)) {
			edad = fechaActual.getYear() - fechaDeNacimiento.getYear() - 1;
		}
		
		return edad;		
	}

}
