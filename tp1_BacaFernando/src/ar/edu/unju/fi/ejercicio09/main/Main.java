package ar.edu.unju.fi.ejercicio09.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio09.model.Producto;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Integer cantidadDeProductos = 0;
		
		while (cantidadDeProductos < 3) {
			Producto producto = new Producto();
			System.out.println("Ingrese nombre del Producto");
			String nombre = scanner.next();
			producto.setNombre(nombre);
			System.out.println("Ingrese codigo del Producto");
			Integer codigo = scanner.nextInt();
			producto.setCodigo(codigo);
			System.out.println("Ingrese precio del Producto");
			Double precio = scanner.nextDouble();
			producto.setPrecio(precio);
			System.out.println("Ingrese descuento del Producto (entre 0 y 50)");
			Integer descuento = scanner.nextInt();
			producto.setDescuento(descuento);
			
			System.out.println(producto.toString());
			System.out.println("Precio con descuento: " + producto.calcularDescuento() + "$\n");
			cantidadDeProductos++;			
		}
		
		scanner.close();

	}

}
