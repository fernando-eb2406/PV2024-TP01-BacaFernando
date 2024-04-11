package ar.edu.unju.fi.ejercicio09.model;

public class Producto {
	
	private String nombre;
	private Integer codigo;
	private Double precio;
	private Integer descuento;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + "$, descuento=" + descuento
				+ "%]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getDescuento() {
		return descuento;
	}

	public void setDescuento(Integer descuento) {
		this.descuento = descuento;
	}
	
	public Double calcularDescuento() {
		Double precioConDescuento = precio;
		if (descuento > 0 && descuento <= 50) {
			precioConDescuento = precioConDescuento * (100 - descuento)/100;
		}
		if (descuento > 50) {
			System.out.println("El descuento no corresponde");
		}
		return precioConDescuento;
	}

}
