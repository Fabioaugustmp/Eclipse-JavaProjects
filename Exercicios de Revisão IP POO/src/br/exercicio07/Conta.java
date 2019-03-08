package br.exercicio07;

import javax.swing.JOptionPane;

public class Conta {

	protected double saldo = 0.00 ;
	private double depositar;
	private double sacar;
	private double taxa_valor;
	
	public Conta(double saldo, double depositar, double sacar) {
	
		this.saldo = this.getSaldo();
		this.depositar = depositar;
		this.sacar = sacar;
	}
	
	public Conta() {

	}

	public String toString() {
		return "Conta saldo= ".replace("[", "") + saldo + 
				" depositar= " + depositar + " sacar= ".replaceAll("]", "") + sacar;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	
	public void setDepositar(double depvalor) {
		this.saldo += depvalor;
	}
	
	public boolean setSacar(double sacvalor) {
		if(this.saldo >= sacvalor) {
			this.saldo -= sacvalor;
		}else {
			System.out.println("Saldo insuficiente! ");
		}
		return true;
		
	}
	public double getSacar() {
		return sacar;
	}
	public void valorTaxa(double taxa_valor) {
		this.taxa_valor = taxa_valor;
	}
	public void consultaSaldo() {
		JOptionPane.showMessageDialog(null, "Saldo em Conta: " +this.getSaldo());
	}	
}
