package ar.edu.unju.fi.ejercicio08.model;

public class CalculadoraEspecial {
	
	private Integer n;
	
	public CalculadoraEspecial() {
		// TODO Auto-generated constructor stub
	}

	public Integer getN() {
		return n;
	}

	public void setN(Integer n) {
		this.n = n;
	}
	
	public Double calcularSumatoria() {
		Double sumatoria = 0.;
		for (int k = 1; k <= n; k++) {
			sumatoria += Math.pow(k*(k+1)/2, 2);
		}
		return sumatoria;
	}
	
	public Double calcularProductoria() {
		Double productoria = 1.;
		for (int k = 1; k <= n; k++) {
			productoria *= k*(k+4);
		}
		return productoria;
	}

}
