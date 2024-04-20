package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
	
	private String nombre;
	private Calendar fechaDeNacimiento;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Calendar getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public void setFechaDeNacimiento(Calendar fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	@Override
	public String toString() {
		return "\nNombre: " + nombre + "\nFecha de Nacimiento: " + fechaDeNacimiento.getTime();
	}

	public Integer calcularEdad() {
		Calendar fechaActual = Calendar.getInstance();
		Integer edad = fechaActual.get(Calendar.YEAR) - fechaDeNacimiento.get(Calendar.YEAR);
		Boolean diferenciaAnio = fechaActual.get(Calendar.YEAR) - fechaDeNacimiento.get(Calendar.YEAR) >= 18;
		Boolean diferenciaMes = fechaActual.get(Calendar.MONTH) - fechaDeNacimiento.get(Calendar.MONTH) >= 0;
		Boolean diferenciaDia = fechaActual.get(Calendar.DAY_OF_MONTH) - fechaDeNacimiento.get(Calendar.DAY_OF_MONTH) >= 0;
		
		if (!(diferenciaAnio && diferenciaMes && diferenciaDia)) {
			edad = fechaActual.get(Calendar.YEAR) - fechaDeNacimiento.get(Calendar.YEAR) - 1;
		}
		
		return edad;
	}
	
	public String signoPersona() {
		String signo = "";
		Integer dia = fechaDeNacimiento.get(Calendar.DAY_OF_MONTH);
		Integer mes = fechaDeNacimiento.get(Calendar.MONTH);
		
		if ( mes == 2 && dia >= 21 || mes == 3 && dia <= 19) {
			signo = "Aries";
		}
		if ( mes == 3 && dia >= 20 || mes == 4 && dia <= 20) {
			signo = "Tauro";
		}
		if ( mes == 4 && dia >= 21 || mes == 5 && dia <= 20) {
			signo = "Geminis";
		}
		if ( mes == 5 && dia >= 21 || mes == 6 && dia <= 22) {
			signo = "Cancer";
		}
		if ( mes == 6 && dia >= 23 || mes == 7 && dia <= 22) {
			signo = "Leo";
		}
		if ( mes == 7 && dia >= 23 || mes == 8 && dia <= 22) {
			signo = "Virgo";
		}
		if ( mes == 8 && dia >= 23 || mes == 9 && dia <= 22) {
			signo = "Libra";
		}
		if ( mes == 9 && dia >= 23 || mes == 10 && dia <= 21) {
			signo = "Escorpio";
		}
		if ( mes == 10 && dia >= 22 || mes == 11 && dia <= 21) {
			signo = "Sagitario";
		}
		if ( mes == 11 && dia >= 22 || mes == 0 && dia <= 19) {
			signo = "Capricornio";
		}
		if ( mes == 0 && dia >= 20 || mes == 1 && dia <= 18) {
			signo = "Acuario";
		}
		if ( mes == 1 && dia >= 19 || mes == 2 && dia <= 20) {
			signo = "Piscis";
		}
		
		return signo;
	}
	
	public String estacionAño() {
		String estacion;
		Boolean primeraMitad = fechaDeNacimiento.get(Calendar.DAY_OF_MONTH) < 21;
		switch (fechaDeNacimiento.get(Calendar.MONTH)) {
		case 0:
		case 1:
			estacion = "verano";
			break;
		case 2:
			if (primeraMitad) {
				estacion = "Verano";
			} else {
				estacion = "Otoño";
			}
			break;
		case 3:
		case 4:
			estacion = "Otoño";
			break;
		case 5:
			if (primeraMitad) {
				estacion = "Otoño";
			} else {
				estacion = "Invierno";
			}			
			break;
		case 6:
		case 7:
			estacion = "Inverno";
			break;
		case 8:
			if (primeraMitad) {
				estacion = "Inverno";
			} else {
				estacion = "Primavera";
			}
			break;
		case 9:
		case 10:
			estacion = "Primavera";
			break;
		case 11:
			if (primeraMitad) {
				estacion = "Primavera";
			} else {
				estacion = "Verano";
			}
			break;
		default:
			estacion = "Ocurrio un error";
			break;
		}
		return estacion;
	}
	
}
