package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Integer cantidadDePizzas = 0;
		
		while (cantidadDePizzas < 3) {
			Pizza pizza = pedirPizza(scanner);
			System.out.println("\n*** Pizza " + (cantidadDePizzas + 1) + " ***\n" + pizza.toString() + "\n");			
			cantidadDePizzas++;
		}
		
		scanner.close();
		
	}
	
	public static Pizza pedirPizza(Scanner scanner) {
		Pizza pizza = new Pizza();
		System.out.println("Ingrese el tamaño de la pizza (20:pequeña - 30:mediana - 40:grande)");
		Integer diametro = scanner.nextInt();
		pizza.setDiametro(diametro);
		System.out.println("¿Tiene ingredientes especiales? (true/false)");
		Boolean ingredientesEspeciales = scanner.nextBoolean();
		pizza.setIngredientesEspeciales(ingredientesEspeciales);
		pizza.setPrecio(pizza.calcularPrecio());
		pizza.setArea(pizza.calcularArea());
		return pizza;
	}

}
