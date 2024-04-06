package ar.edu.unju.fi.ejercicio04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un número entre 0 y 10 para calcular su factorial");
		Integer numero = scanner.nextInt();
		scanner.close();
		
		Integer factorialDeNumero = 1;
		Integer i = 1;
		
		while (i <= numero) {
			factorialDeNumero = factorialDeNumero * i;
			i++;
		}
		
		System.out.println("El factorial de " + numero + " es: " + factorialDeNumero);

	}

}
