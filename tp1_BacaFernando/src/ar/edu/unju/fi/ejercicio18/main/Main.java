package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Pais> paises = new ArrayList<>();
		
		Pais pais1 = new Pais(111,"Argentina");
		Pais pais2 = new Pais(222,"España");
		Pais pais3 = new Pais(333,"Italia");
		Pais pais4 = new Pais(444,"Alemania");
		
		paises.add(pais1);
		paises.add(pais2);
		paises.add(pais3);
		paises.add(pais4);
		
		Integer opcion;
		
		DestinoTuristico destino = new DestinoTuristico();
		
		ArrayList<DestinoTuristico> destinos = new ArrayList<>();
		
		
		System.out.println("1- Alta de destino turístico");
		System.out.println("2- Mostrar todos los destinos turisticos");
		System.out.println("3- Modificar el país de un destino turístico");
		System.out.println("4- Limpiar el ArrayList de destino turísticos");
		System.out.println("5- Eliminar un destino turístico");
		System.out.println("6- Mostrar los destinos turísticos ordenados por nombre");
		System.out.println("7- Mostrar todos los países");
		System.out.println("8- Mostrar los destinos turísticos que pertenecen a un país");
		System.out.println("9- Salir");
		System.out.println("Ingrese opcion");
		
		opcion = scanner.nextInt();
		
		do {
			switch(opcion) {
			case 1:
				altaDestino(destino, paises, destinos);
				break;
			case 2:
				mostrarDestinos(destinos);
				break;
			case 3:
				modificarDestino(paises, destinos);
				break;
			case 4:
				limpiarArrayList(destinos);
				break;
			case 5:
				eliminarDestino(destinos);
				break;
			case 6:
				mostrarDestinosOrdenados(destinos);
				break;
			case 7:
				mostrarPaises(paises);
				break;
			case 8:
				destinosPorPais(destinos);
				break;
			case 9:
				System.out.println("Fin del programa");
				break;
			default:
				System.out.println("Opcion incorrecta");	
			}
		}while(opcion!= 9);

	}
	
	public static void altaDestino(DestinoTuristico destino, ArrayList<Pais> paises, ArrayList<DestinoTuristico> destinos) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese codigo de destino");
		int codigo;
		codigo = scanner.nextInt();
		destino.setCodigo(codigo);
		System.out.println("Ingrese nombre de destino");
		String nombre;
		nombre = scanner.next();
		destino.setNombre(nombre);
		System.out.println("Ingrese precio ");
		double precio;
		precio = scanner.nextDouble();
		destino.setPrecio(precio);
		System.out.println("Ingrese codigo del pais");
		int codPais;
		codPais = scanner.nextInt();
		for(Pais pais: paises) {
			if(codPais == pais.getCodigo()) {
				destino.setPais(pais);
			}
		}
		System.out.println("Ingrese cantidad de dias: ");
		int cantidadDias = scanner.nextInt();
		destino.setCant_dias(cantidadDias);
	}
	
	public static void mostrarDestinos(ArrayList<DestinoTuristico> destinos) {
		for(DestinoTuristico destino: destinos) {
			System.out.println(destino.toString());
		}
	}
	
	public static void modificarDestino(ArrayList<Pais> paises, ArrayList<DestinoTuristico> destinos) {
		System.out.println("Ingrese el codigo de destino a modificar");
		Scanner sccanner = new Scanner(System.in);
		int codigo = sccanner.nextInt();
		for(DestinoTuristico destino: destinos) {
			if(codigo == destino.getCodigo()) {
				System.out.println("Ingrese el codigo de pais nuevo");
				int numeroCodigo = sccanner.nextInt();
				for(Pais pais: paises) {
					if(numeroCodigo == pais.getCodigo()) {
						destino.setPais(pais);
					}
				}
			}
		}
	}

	public static void limpiarArrayList(ArrayList<DestinoTuristico> destinos) {
		destinos.clear();
	}
	
	public static void eliminarDestino(ArrayList<DestinoTuristico> destinos) {
		Scanner sccanner = new Scanner(System.in);
		int codigo = sccanner.nextInt();
		Iterator iterator = destinos.iterator();
		while(iterator.hasNext()) {
			DestinoTuristico destino = (DestinoTuristico)iterator.next();
			if(codigo == destino.getCodigo()) {
				iterator.remove();
			}
		}
	}

	public static void mostrarDestinosOrdenados(ArrayList<DestinoTuristico> destinos) {
		destinos.sort(Comparator.comparing(DestinoTuristico::getNombre));
		destinos.forEach(destino -> System.out.println(destino));
	}
		
	public static void mostrarPaises(ArrayList<Pais> paises) {
		paises.forEach(pais -> System.out.println(pais));
	}
	
	public static void destinosPorPais(ArrayList<DestinoTuristico> destinos) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese codigo del pais que quiera ver los paises");
		int codigo = scanner.nextInt();
		for(DestinoTuristico d: destinos) {
			if(d.getPais().getCodigo() == codigo) {
				System.out.println(d);
			}
		}
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	

}
