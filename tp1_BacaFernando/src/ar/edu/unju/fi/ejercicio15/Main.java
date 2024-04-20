package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Integer tamanio = tamanioArray(scanner);
		String[] personas = new String[tamanio];
		
		guardarNombres(scanner, personas);
		mostrarOrdenAscendente(personas);
		mostrarOrdenDescendente(personas);
		
		scanner.close();

	}
	
	public static Integer tamanioArray(Scanner scanner) {
		Integer tamanio;
		Boolean ingresoCorrecto = false;
		do {
			System.out.println("Ingrese un número entero entre 5 y 10");
			tamanio = scanner.nextInt();
			if (tamanio >= 5 && tamanio <= 10) {
				ingresoCorrecto = true;
			} else {
				System.out.println("Valor fuera del rango\n");
			}
		} while (!ingresoCorrecto);
		return tamanio;
	}
	
	public static void guardarNombres(Scanner scanner, String[] personas) {
		System.err.println("--------GUARDAR NOMBRES------------");
		for (int i = 0; i < personas.length; i++) {
			System.out.println("Ingrese el nombre a guardar");
			personas[i] = scanner.next();
		}
	}
	
	public static void mostrarOrdenAscendente(String[] personas) {
		System.err.println("----------ORDEN ASCENDENTE----------");
		for (int i = 0; i < personas.length; i++) {
			System.out.println("Posición: " + i + " - Valor: " + personas[i]);
		}
	}
	
	public static void mostrarOrdenDescendente(String[] personas) {
		System.err.println("----------ORDEN DESCENDENTE----------");
		for (int i = personas.length - 1; i >= 0 ; i--) {
			System.out.println("Posición: " + i + " - Valor: " + personas[i]);
		}
	}

}
