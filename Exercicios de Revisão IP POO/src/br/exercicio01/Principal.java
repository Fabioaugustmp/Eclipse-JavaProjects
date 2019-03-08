package br.exercicio01;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Eletrodomestico> Eletrodomesticos = new ArrayList <Eletrodomestico>();
		Scanner sc = new Scanner(System.in); 
		
		int op = 0;
		do {
			Eletrodomestico eletros = new Eletrodomestico(); 
			
			System.out.println("Informe Qual Eletrodomestico deseja Adicionar:");
			eletros.setNome(sc.nextLine());
			
			System.out.println("Informe a Descrição do " + eletros.getNome());
			eletros.setDescricao(sc.nextLine());
			
			int function = JOptionPane.showConfirmDialog(null, "Deseja Ligar o Eletrodoméstico ?");
				if (function == 0) {
					eletros.setLigar();
					System.out.println(eletros.getNome() + " LIGADO(A) com Sucesso !!!");
				}
				else {
					System.out.println("Seu Aparelho Está DESLIGADO !!!");
				}
				
				Eletrodomesticos.add(eletros); 
				
			op = JOptionPane.showConfirmDialog(null, "Deseja Continuar Adicionando Aparelhos? ");
		}while(op == 0);
		
		sc.close();
	}

}
