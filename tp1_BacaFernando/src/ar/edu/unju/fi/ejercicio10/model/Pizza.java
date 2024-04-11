package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	
	private static final Integer INGREDIENTES_ESPECIALES_20 = 500;
	private static final Integer INGREDIENTES_ESPECIALES_30 = 750;
	private static final Integer INGREDIENTES_ESPECIALES_40= 1000;
	
	private Integer diametro;
	private Double precio;
	private Double area;
	private Boolean ingredientesEspeciales;
	
	public Pizza() {
		// TODO Auto-generated constructor stub
	}
		
	public Integer getDiametro() {
		return diametro;
	}

	public void setDiametro(Integer diametro) {
		this.diametro = diametro;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public Boolean getIngredientesEspeciales() {
		return ingredientesEspeciales;
	}

	public void setIngredientesEspeciales(Boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
	}

	@Override
	public String toString() {
		return "Diametro = " + diametro + "\nIngredientes Especiales = " + ingredientesEspeciales +
				"\nPrecio Pizza = " + precio + "\nÁrea de la pizza = " + area;
	}

	public Double calcularPrecio() {
		Double precio = 0.;
		switch (diametro) {
		case 20:
			precio = (ingredientesEspeciales) ? 4500. + INGREDIENTES_ESPECIALES_20 : 4500.;
			break;
		case 30:
			precio = (ingredientesEspeciales) ? 4800. + INGREDIENTES_ESPECIALES_30 : 4800.;
			break;
		case 40:
			precio = (ingredientesEspeciales) ? 5500. + INGREDIENTES_ESPECIALES_40 : 5500.;
			break;
		default:
			System.out.println("El diametro es invalido");
			break;
		}
		return precio;
	}
	
	public Double calcularArea() {
		Double area = 0.;
		area = Math.PI * Math.pow((diametro/2), 2);
		return area;
	}
	
}
