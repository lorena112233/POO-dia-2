package pooCalculadora;

import java.util.Scanner;

public class PrincipalCalculadora {

	public static void main(String[] args) {
		// Realizar las operaciones basicas de una calculadora

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introducir el primer valor");
		int valor1 = entrada.nextInt();
		System.out.println("Introducir el segundo valor");
		int valor2 = entrada.nextInt();
		Calculadora calculo = new Calculadora(valor1, valor2);
		System.out.println("El valor de la suma es " + calculo.suma());
		System.out.println("El valor de la resta es " + calculo.resta());
		System.out.println("El valor de la producto es " + calculo.producto());
		System.out.println("El valor de la division es " + calculo.division());
		entrada.close();

	}

}
