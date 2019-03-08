package br.exercicio07;

public class ContaCorrente extends Conta {
	
	public void atualiza (double taxa) {
		this.saldo += (this.saldo * taxa * 2.0);
	}

	public void setDeposito (double valor) {
		this.saldo += (valor - 0.10); 
	}
}
