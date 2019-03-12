package pooCalculadora;

public class Calculadora {
	private int num1;
	private int num2;

	public Calculadora(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int suma() {
		int sumatotal=this.num1+this.num2;
		return sumatotal;
	}

	public int resta() {
		int restatotal=this.num1-this.num2;
		return restatotal;
	}
	public int producto() {
		int productototal=this.num1*this.num2;
		return productototal;
	}
	public double division() {
		double divisiontotal=(double)this.num1/(double)this.num2;
		return divisiontotal;
	}

}
