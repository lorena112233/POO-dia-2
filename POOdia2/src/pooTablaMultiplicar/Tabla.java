package pooTablaMultiplicar;

public class Tabla {
	private int numero;

	public Tabla(int numero) {
		this.numero = numero;
	}
	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Tabla [numero=" + numero + "]";
	}

	public void multiplicartabla() {
		for (int i = 1; i < 10; i++) {
			System.out.println(this.numero + " * " + i + " = " + (this.numero * i));
		}

	}
}
