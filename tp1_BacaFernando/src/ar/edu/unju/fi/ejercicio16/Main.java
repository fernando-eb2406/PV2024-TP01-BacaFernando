package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] nombres = new String[5];
		
		guardarNombres(scanner, nombres);
		mostrarNombres(nombres);
		System.out.println("\nEl tamaño del vector es: " + nombres.length + "\n");
		eliminarNombre(scanner, nombres);
		mostrarNombres(nombres);
		
		scanner.close();

	}
		
	public static void guardarNombres(Scanner scanner, String[] nombres) {
		System.err.println("--------GUARDAR NOMBRES------------");
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Ingrese el nombre a guardar");
			nombres[i] = scanner.next();
		}
	}
	
	public static void mostrarNombres(String[] nombres) {
		Integer contador = 0;
		System.err.println("----------NOMBRES INGRESADOS----------");
		while (contador < nombres.length) {
			System.out.println("Posición: " + contador + " - Valor: " + nombres[contador]);
			contador++;
		}
	}
	
	public static void eliminarNombre(Scanner scanner, String[] nombres) {
		Byte indice;
		do {
			System.out.println("Ingrese la posición del nombre a eliminar (entre 0 y 4)");
			indice = scanner.nextByte();
		} while (!(indice >= 0 && indice < nombres.length));
		for (int i = indice; i < nombres.length - 1; i++) {
			nombres[i] = nombres[i + 1];
		}
		nombres[nombres.length - 1] = "";
	}

}
