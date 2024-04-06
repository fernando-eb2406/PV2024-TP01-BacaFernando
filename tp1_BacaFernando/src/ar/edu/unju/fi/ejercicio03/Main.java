package ar.edu.unju.fi.ejercicio03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un número entero");
		Integer numero = scanner.nextInt();
		scanner.close();
		
		if (numero % 2 != 0) {
			Integer dobleDeNumero = numero * 2;
			System.out.println("El doble del número ingresado es: " + dobleDeNumero);
		} else {
			Integer tripleDeNumero = numero * 3;
			System.out.println("El triple del número ingresado es: " + tripleDeNumero);
		}
		
	}

}
