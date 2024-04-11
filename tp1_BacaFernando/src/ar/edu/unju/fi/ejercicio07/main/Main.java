package ar.edu.unju.fi.ejercicio07.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio07.model.Empleado;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre");
		String nombre = scanner.nextLine();
		System.out.println("Ingrese su legajo");
		Integer legajo = scanner.nextInt();
		System.out.println("Ingrese su salario");
		Double salario = scanner.nextDouble();
		
		Empleado empleado = new Empleado(nombre, legajo, salario);
		
		System.out.println("\n" + empleado.toString());
		System.out.println("\nAumentar salario...");
		empleado.aumentarSalario();
		System.out.println(empleado.toString());
		
		scanner.close();

	}

}
