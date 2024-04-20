package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Persona persona = pedirDatos(scanner);
				
		System.out.println(persona.toString());		
		System.out.println("Edad: " + persona.calcularEdad() + " años");
		System.out.println("Signo del Zodiaco: " + persona.signoPersona());
		System.out.println("Estación: " + persona.estacionAño());
		
		scanner.close();

	}
	
	public static Persona pedirDatos(Scanner scanner) {
		Persona persona = new Persona();
		System.out.println("Ingrese su nombre");
		String nombre = scanner.nextLine();
		persona.setNombre(nombre);
		System.out.println("Ingrese su fecha de nacimiento");
		System.out.println("Día: (Formato DD)");
		Integer dia = scanner.nextInt();
		System.out.println("Mes: (Formato MM)");
		Integer mes = scanner.nextInt() - 1;
		System.out.println("Año: (Formato AAAA)");
		Integer anio = scanner.nextInt();
		Calendar fechaDeNacimiento = Calendar.getInstance();
		fechaDeNacimiento.set(anio, mes, dia);
		persona.setFechaDeNacimiento(fechaDeNacimiento);
		return persona;
	}

}
