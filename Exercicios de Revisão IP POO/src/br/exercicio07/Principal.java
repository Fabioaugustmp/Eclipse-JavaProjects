package br.exercicio07;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
			DecimalFormat format = new DecimalFormat ("#0.00"); 
			
			int op = 0;
			
			do {
				ContaCorrente ContaC = new ContaCorrente();
				ContaPoupanca ContaP = new ContaPoupanca(); 

				JOptionPane.showMessageDialog(null, "Bem Vindo ao Seu Banco Digital !");
				
				String [] TipoDeConta = {"Conta Corrente", "Conta Poupança"}; 
					int varTipoDeConta = JOptionPane.showOptionDialog(null, "<<<<<<<< CONTA >>>>>>>>",
						"Selecione"	, JOptionPane.DEFAULT_OPTION , JOptionPane.INFORMATION_MESSAGE, null, 
						TipoDeConta, TipoDeConta[0]);
					
							if (varTipoDeConta == 0) {
								
								JOptionPane.showMessageDialog(null, "Conta Corrente");
								ContaC.consultaSaldo();
								
								ContaC.setDepositar(Integer.parseInt(JOptionPane.showInputDialog("Informe o Valor a ser Depositado R$: ")));
								
								ContaC.consultaSaldo();
								
								ContaC.setSacar(Integer.parseInt(JOptionPane.showInputDialog("Informe o Valor a ser Sacado R$: ")));
								
								ContaC.atualiza(0.1);
								
								ContaC.consultaSaldo();
							}
					
							else if (varTipoDeConta == 1 ) {
								
									JOptionPane.showMessageDialog(null, "Conta Poupança");
									ContaP.consultaSaldo();
									
									ContaP.setDepositar(Integer.parseInt(JOptionPane.showInputDialog("Informe o Valor a ser Depositado R$: ")));
									
									ContaP.consultaSaldo();
									
									ContaP.setSacar(Integer.parseInt(JOptionPane.showInputDialog("Informe o Valor a ser Sacado R$: ")));
									
									ContaP.atualiza(0.2);
									
									ContaP.consultaSaldo();
							}
				
					op = JOptionPane.showConfirmDialog(null, "Finalizar ? ");
						if (op == 0) {
							JOptionPane.showMessageDialog(null, "Obrigado Por Utilizar nossos Sistemas !!!");
						}
						else if (op == 1) {
							JOptionPane.showMessageDialog(null, "Reiniciando Processo ! Salvando Dados.");
						}
			} while (op == 0); 
	}

}
