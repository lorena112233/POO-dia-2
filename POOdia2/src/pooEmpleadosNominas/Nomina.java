package pooEmpleadosNominas;

import java.util.Scanner;


public class Nomina {

	public static void main(String[] args) {
		String nombre;
		double sueldoMensual;
		int numPagas;
		double sueldoAnual;
		
		
		Empleado e1 = new Empleado();
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca el nombre del empleado:");
		nombre = entrada.nextLine();
		e1.SetNombre(nombre);
			
		System.out.println("Introduzca el salario mensual: ");
		sueldoMensual = entrada.nextDouble();
		e1.SetSueldoMensual(sueldoMensual);
		
		System.out.println("Introduzca el numero de pagas anuales: ");
		numPagas = entrada.nextInt();
		e1.SetNumPagas(numPagas);
		
		e1.SetSueldoAnual(sueldoMensual, numPagas);
		sueldoAnual=e1.GetSueldoAnual();
		boolean impuestos = (sueldoAnual>=3000);

		
		
		entrada.close();

		
		System.out.println(" El empleado: " + e1.GetNombre());
		System.out.println(" Gana: " + e1.GetSueldoMensual() + " EUR mensuales.");
		System.out.println(" En: " + e1.GetNumPagas() + " pagas al año.");
		System.out.println(" Total salario: " + e1.GetSueldoAnual() + "EUR al año.");
		if(impuestos) {
			System.out.println("Con tu salario, se recomienda retencion 16% de tu salario mensual");
		}
		
	}

}
