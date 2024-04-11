package ar.edu.unju.fi.ejercicio08.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio08.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		System.out.println("Ingrese un número");
		Integer n = scanner.nextInt();
		calculadora.setN(n);
		
		Double sumatoria = calculadora.calcularSumatoria();
		System.out.println("\nLa sumatoria de 1 hasta " + n + " es: " + sumatoria);
		Double productoria = calculadora.calcularProductoria();
		System.out.println("\nLa productoria de 1 hasta " + n + " es: " + productoria);
		
		scanner.close();

	}

}
