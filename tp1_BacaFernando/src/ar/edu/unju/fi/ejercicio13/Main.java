package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int[] numerosEnteros = new int[8];
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < numerosEnteros.length; i++) {
			System.out.println("Ingrese un número entero");
			numerosEnteros[i] = scanner.nextInt();
		}
		
		System.out.println();
		
		for (int i = 0; i < numerosEnteros.length; i++) {
			System.out.println("Posición: " + i + " - Valor: " + numerosEnteros[i]);
		}

	}

}
