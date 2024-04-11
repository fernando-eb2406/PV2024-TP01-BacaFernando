package ar.edu.unju.fi.ejercicio07.model;

public class Empleado {
	
	private static final Double SALARIO_MINIMO = 210000.;
	private static final Double AUMENTO_POR_MERITO = 20000.;
	
	private String nombre;
	private Integer legajo;
	private Double salario;
		
	public Empleado(String nombre, Integer legajo, Double salario) {
		this.nombre = nombre;
		this.legajo = legajo;
		if (salario >= SALARIO_MINIMO) {
			this.salario = salario;
		} else {
			this.salario = SALARIO_MINIMO;
		}
	}
	
	@Override
	public String toString() {
		return "Empleado [Nombre=" + nombre + ", Legajo=" + legajo + ", Salario=" + salario + "]";
	}
	
	public Double aumentarSalario() {
		return salario += AUMENTO_POR_MERITO;
	}
	
}
