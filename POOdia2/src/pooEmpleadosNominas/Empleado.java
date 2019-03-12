package pooEmpleadosNominas;

public class Empleado {
	private String nombre;
	private int numPagas;
	private double sueldoAnual;
	private double sueldoMensual;

	public Empleado() {

	}
	
	public String GetNombre() {
		return nombre;
	}
	public void SetNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int GetNumPagas() {
		return numPagas;
	}
	public void SetNumPagas(int numPagas) {
		this.numPagas = numPagas;
	}
	
	public void SetSueldoMensual(double sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
	}
	public double GetSueldoMensual() {
		return sueldoMensual;
	}
	public void SetSueldoAnual(double sueldoMensual, int numPagas) {
		this.sueldoAnual=(GetSueldoMensual()*GetNumPagas());
	}
	public double GetSueldoAnual() {
		return this.sueldoAnual;
	}


}
