package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);		
		
		Boolean ingresoCorrecto = false;
		Integer numero;
		
		do {
			System.out.println("Ingrese un número entero entre 3 y 10");
			numero = scanner.nextInt();
			if (numero >= 3 && numero <= 10) {
				ingresoCorrecto = true;
			} else {
				System.out.println("Valor fuera del rango\n");
			}
		} while (!ingresoCorrecto);
		
		Integer[] numerosEnteros = new Integer[numero];
		
		System.err.println("-------------------------");
		for (int i = 0; i < numerosEnteros.length; i++) {
			System.out.println("Ingrese un número");
			numerosEnteros[i] = scanner.nextInt();
		}
		
		Integer sumaNumeros = 0;
		
		System.err.println("-------------------------");
		for (int i = 0; i < numerosEnteros.length; i++) {
			System.out.println("Posición: " + i + " - Valor: " + numerosEnteros[i]);
			sumaNumeros += numerosEnteros[i];
		}
		
		System.out.println("\nLa suma de los numeros del arreglo es: " + sumaNumeros);
		
		scanner.close();
		
	}

}
