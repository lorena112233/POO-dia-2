package pooEmpleadosNominas;

import java.util.Scanner;

public class TablaRetenciones {

	final int FILAS = 4, COLUMNAS = 5;

	Scanner entrada = new Scanner(System.in);

	private int i, j, mayor, menor;
	private int sumaTotal = 0;
	private int sumaFila = 0;
	private int sumaColumn = 0;
	private int sumacolumna2 = 0;
	private int filaMayor, filaMenor, colMayor, colMenor;

	private int[][] A = new int[FILAS][COLUMNAS];

	public TablaRetenciones() {
		System.out.println("Lectura de elementos de la matriz: ");
		
		// bucle para introducir los valores por consola
		for(int i = 0;i<FILAS;i++)
		{
			for (j = 0; j < COLUMNAS; j++) {
				System.out.print("\nA[" + i + "][" + j + "]= ");
				A[i][j] = entrada.nextInt();
				sumaTotal += A[i][j];
				sumaFila += A[i][j];
			}

		}
		// --------------------------------------------

		System.out.println("valores introducidos:");

		// bucle para recorrer la matriz creada y mostrar los valores introducidos
		for(i=0;i<A.length;i++)
		{
			for (j = 0; j < A[i].length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	// *******************
}
