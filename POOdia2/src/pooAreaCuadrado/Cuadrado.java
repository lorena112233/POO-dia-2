package pooAreaCuadrado;

public class Cuadrado {

	private double lado;
	private double perimetro;
	private double area;
	private final int numLadosCuadrado = 4;

	public Cuadrado() {

	}
	

	public double GetLado() {
		return lado;
	}
	public void SetLado(double lado) {
		this.lado = lado;
	}
	

	public void SetPerimetro() {
		this.perimetro = (GetLado() * numLadosCuadrado);
	}
	public double GetPerimetro() {
		return perimetro;
	}


	public void SetArea() {
		this.area = (GetLado() * GetLado());
	}
	public double GetArea() {
		return area;
	}

}
