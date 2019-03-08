package br.exercicio02;

public class Quadrilatero implements Formas{
	  private double a;
	  private double b;
	  private double c;
	  private double d;
	  
	public Quadrilatero(double a, double b, double c, double d) {
		super();
		this.a = validate(a);
	    this.b = validate(b);
	    this.c = validate(c);
	    this.d = validate(d);
	}

	private double validate(double valor) {
		if (valor >= 0) {
			return valor; 
		}
		throw new IllegalArgumentException();
	}

	public double getA() {
		return a;
	}


	public void setA(double a) {
		this.a = a;
	}


	public double getB() {
		return b;
	}


	public void setB(double b) {
		this.b = b;
	}


	public double getC() {
		return c;
	}


	public void setC(double c) {
		this.c = c;
	}


	public double getD() {
		return d;
	}


	public void setD(double d) {
		this.d = d;
	}


	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
