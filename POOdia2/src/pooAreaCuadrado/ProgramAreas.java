package pooAreaCuadrado;

import java.util.Scanner;

public class ProgramAreas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double lado;

		System.out.println("Introduce la longitud del lado del cuadrado: ");
		lado = entrada.nextInt();
		
		Cuadrado c1 = new Cuadrado();
		c1.SetLado(lado);
		c1.SetPerimetro();
		c1.SetArea();

		System.out.println(" El lado mide: " + c1.GetLado() + " cm.");
		System.out.println(" El perimetro es: " + c1.GetPerimetro() + " cm.");
		System.out.println(" El area del cuadrado es: " + c1.GetArea() + " cm.");

		entrada.close();
	}

}
