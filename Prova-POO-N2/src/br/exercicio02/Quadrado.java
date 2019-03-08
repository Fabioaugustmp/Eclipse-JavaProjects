package br.exercicio02;

public class Quadrado extends Quadrilatero{
	
	public Quadrado(double a) {
	    super(a, a, a, a);
	  }

	  public double getA() {
	    return this.getA();
	  }

	  public double area() {
	    return Math.pow(getA(), 2.0);
	  }

	  public double perimeter() {
	    return 4.0 * getA();
	  }
	 
}
