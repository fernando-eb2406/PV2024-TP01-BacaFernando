package ar.edu.unju.fi.ejercicio18.model;

public class DestinoTuristico {
	
	private Integer codigo;
	private String nombre;
	private Double precio;
	private Pais pais;
	private Integer cantidadDias;
	
	public DestinoTuristico() {
		// TODO Auto-generated constructor stub
	}

	public DestinoTuristico(Integer codigo, String nombre, Double precio, Pais pais, Integer cant_dias) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.pais = pais;
		this.cantidadDias = cant_dias;
	}

	@Override
	public String toString() {
		return "DestinoTuristico [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", cant_dias="
				+ cantidadDias + "]";
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Integer getCant_dias() {
		return cantidadDias;
	}

	public void setCant_dias(Integer cant_dias) {
		this.cantidadDias = cant_dias;
	}

}
