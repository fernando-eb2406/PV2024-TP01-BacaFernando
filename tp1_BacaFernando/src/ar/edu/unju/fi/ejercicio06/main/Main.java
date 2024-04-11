package ar.edu.unju.fi.ejercicio06.main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio06.model.Persona;

public class Main {

	public static void main(String[] args) {
		
		//Persona 1 - Constructor por defecto
		Persona persona1 = generarPersonaPorDefecto();
		persona1.mostrarDatos();
		
		//Persona 2 - Constructor parametrizado1
		Persona persona2 = generarPersonaParametrizado1();
		persona2.mostrarDatos();
		
		//Persona 3 - Constructor parametrizado2
		Persona persona3 = generarPersonaParametrizado2();		
		persona3.mostrarDatos();
		
	}
	
	public static Persona generarPersonaPorDefecto() {
		Persona persona = new Persona();
		String dni = obtenerDni();
		persona.setDni(dni);
		String nombre = obtenerNombre();
		persona.setNombre(nombre);
		LocalDate fechaDeNacimiento = LocalDate.parse(obtenerFechaDeNacimiento());
		persona.setFechaDeNacimiento(fechaDeNacimiento);
		String provincia = obtenerProvincia();
		persona.setProvincia(provincia);
		return persona;
	}
	
	public static Persona generarPersonaParametrizado1() {
		String dni = obtenerDni();
		String nombre = obtenerNombre();
		LocalDate fechaDeNacimiento = LocalDate.parse(obtenerFechaDeNacimiento());
		String provincia = obtenerProvincia();
		Persona persona = new Persona(dni, nombre, fechaDeNacimiento, provincia);
		return persona;
	}
	
	public static Persona generarPersonaParametrizado2() {
		String dni = obtenerDni();
		String nombre = obtenerNombre();
		LocalDate fechaDeNacimiento = LocalDate.parse(obtenerFechaDeNacimiento());
		Persona persona = new Persona(dni, nombre, fechaDeNacimiento);
		return persona;
	}
	
	static Scanner scanner = new Scanner(System.in);
	
	public static String obtenerDni() {
		System.out.println("Ingrese DNI");
		String dni = scanner.nextLine();
		return dni;
	}
	
	public static String obtenerFechaDeNacimiento() {
		System.out.println("Ingrese fecha de nacimiento");
		//LocalDate fechaDeNacimiento = LocalDate.parse(scanner.nextLine());
		System.out.println("Día (Formato DD)");
		String diaNacimiento = scanner.nextLine();
		System.out.println("Mes (Formato MM)");
		String mesNacimiento = scanner.nextLine();
		System.out.println("Año (Formato AAAA)");
		String anioNacimiento = scanner.nextLine();
		String fechaDeNacimiento = anioNacimiento + "-" + mesNacimiento + "-" + diaNacimiento;
		return fechaDeNacimiento;
	}
	
	public static String obtenerNombre() {
		System.out.println("Ingrese nombre");
		String nombre = scanner.nextLine();
		return nombre;
	}
	
	public static String obtenerProvincia() {
		System.out.println("Ingrese provincia");
		String provincia = scanner.nextLine();
		return provincia;
	}
	
}
