package ar.edu.unju.fi.ejercicio06.model;

import java.time.LocalDate;

public class Persona {
	
	private String dni;
	private String nombre;
	private LocalDate fechaDeNacimiento;
	private String provincia;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	public Persona(String dni, String nombre, LocalDate fechaDeNacimiento, String provincia) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.provincia = provincia;
	}

	public Persona(String dni, String nombre, LocalDate fechaDeNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.provincia = "Jujuy";
	}

	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public String getProvincia() {
		return provincia;
	}
	
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	public Integer edadPersona() {
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
	
	public Boolean mayorDeEdad() {
		return edadPersona() >= 18;
	}
	
	public void mostrarDatos() {
		System.out.println("DNI: " + dni);
		System.out.println("Nombre: " + nombre);
		System.out.println("Fecha de nacimiento: " + fechaDeNacimiento);
		System.out.println("Provincia: " + provincia);
		System.out.println("Edad: " + edadPersona());
		
		if (mayorDeEdad()) {
			System.out.println("La persona es mayor de edad");
		} else {
			System.out.println("La persona no es mayor de edad");
		}
		System.out.println();
	}
	
}
