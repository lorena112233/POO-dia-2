package pooTablaMultiplicar;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Peticion de repaso de tablas de multiplicar
		Scanner entrada = new Scanner(System.in);
		int opcion;
		Tabla repaso = new Tabla(0);
		do {
			System.out.println("1.- Tabla de multiplicar que desea");
			System.out.println("2.- Resultado de la tabla");
			System.out.println("3.- Finalizar");
			System.out.println("Que opcion desea??");
			opcion = entrada.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Que tabla deseas repasar");
				int tabla = entrada.nextInt();
				repaso.setNumero(tabla);
				break;
			case 2:
				repaso.multiplicartabla();
				break;
			case 3:
				opcion = 3;
				break;
			}
		} while (opcion < 3);
		entrada.close();
	}

}
