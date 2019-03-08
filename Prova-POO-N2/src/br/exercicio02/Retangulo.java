package br.exercicio02;

public class Retangulo extends Quadrilatero{
	private double base; 
	private double altura;
	
	public Retangulo(double base, double altura) {
		super(altura, altura, altura, altura);
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String toString() {
		return "Retangulo [base=" + base + ", altura=" + altura + ", getBase()=" + getBase() + ", getAltura()="
				+ getAltura() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	} 
	
	  public double perimetro() {
		    return 2.0 * this.getAltura() * this.getBase();
		  }
	
	
	
	

}
