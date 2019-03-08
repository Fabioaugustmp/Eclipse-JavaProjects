package br.exercicio03;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Televisor> Televisores = new ArrayList <Televisor>(); 
		
		int opmedia = 0;
		int opfinal = 0;
		int op = 0;
		
		do {
			do {
				Televisor televisor = new Televisor (false,0,0);
				do {
					String [] Estado = {"Ligar (ON)", " Desligar (OFF)"};
					 int var = JOptionPane.showOptionDialog(null, "-----***** TELEVISOR *****-----",
				                "OPÇÕES",
				                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, Estado, Estado[0]);
						System.out.println("Informe A opção desejada");
						
						
						
						boolean estadotelevisor ;
							if (var == 0) {
								estadotelevisor = true;
								televisor.Ligado();
							}
							else if (var == 1){
								estadotelevisor = false; 
								televisor.Desligado();
							}
							else {
								break;
							}
							
					televisor.setEstado(estadotelevisor);
					
						if(estadotelevisor == true) {
							televisor.modeloTelevisor();
						}
						
					
						if(estadotelevisor == true) {
							int var1 = 0;
							do {
							String [] Canais = {"( + ) ", "( - ) ", "( X ) "};
							var1 = JOptionPane.showOptionDialog(null, "-----***** CANAIS *****-----",
					                "OPÇÕES",
					                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, Canais, Canais[0]);
							
							if(var1 == 0) {
								televisor.subirCanal();
							}
							else if (var1 == 1) {
								televisor.diminuirCanal();
							}
							else {
								break;
							}
							System.out.println(televisor.getCanal());
							} while(var1 < 2);
						}
						
						
						if (estadotelevisor == true) {
							int var2 = 0;
							
							do {
							String [] Volume = {"( + ) ", "( - ) ", "( X ) "};
							var2 = JOptionPane.showOptionDialog(null, "-----***** VOLUME *****-----",
					                "OPÇÕES",
					                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, Volume, Volume[0]);
							if (var2 == 0) {
								televisor.aumentarVolume();
							}
							else if (var2 == 1) {
								televisor.diminuirVolume();
							}
							else {
								break; 
							}
							
							 } while (var2 < 2); 
							
						}
						
					Televisores.add(televisor);
					televisor.Imprimir();
					
					op = JOptionPane.showConfirmDialog(null, "Deseja Continuar Ad++ Televisores ?");
				}while (op == 0); 
				
					opmedia = JOptionPane.showConfirmDialog(null, "Deseja Gerenciar televisores ?"); 
						if (opmedia == 1) {
							System.out.println(Televisores);
							System.out.println();
						}
						else if (opmedia == 0) {
							Object[] modelosdetelevisor = { "SAMSUNG", "PANASONIC", "LG", "SONY", "TOSHIBA" };
						      Object selectedValue = JOptionPane.showInputDialog(null,
						          "Escolha Qual Televisor deseja Desligar", "Opção",
						              JOptionPane.INFORMATION_MESSAGE, null,
						                  modelosdetelevisor, modelosdetelevisor [0]);
						      
						      if (selectedValue == "SAMSUNG") {
						    	  televisor.setEstado(false);
						    	  JOptionPane.showMessageDialog(null, "TV DESLIGADA !" );
						    	  System.out.println("TV DESLIGADA !");
						      }
						      else if (selectedValue == "PANASONIC") {
						    	  televisor.setEstado(false);
						    	  JOptionPane.showMessageDialog(null, "TV DESLIGADA !" );
						    	  System.out.println("TV DESLIGADA !");
						      }
						      else if (selectedValue == "LG") {
						    	  televisor.setEstado(false);
						    	  JOptionPane.showMessageDialog(null, "TV DESLIGADA !" );
						    	  System.out.println("TV DESLIGADA !");
						      }
						      else if (selectedValue == "SONY") {
						    	  televisor.setEstado(false);
						    	  JOptionPane.showMessageDialog(null, "TV DESLIGADA !" );
						    	  System.out.println("TV DESLIGADA !");
						      }
						      else if (selectedValue == "TOSHIBA") {
						    	  televisor.setEstado(false);
						    	  JOptionPane.showMessageDialog(null, "TV DESLIGADA !" );
						    	  System.out.println("TV DESLIGADA !");
						      }
						}
			} while (opmedia == 0);
			if (opfinal == 0) { 
				JOptionPane.showConfirmDialog(null, "Encerrar Programa ?");
				JOptionPane.showMessageDialog(null, "SHUTDOW LOG !!!");
			}
			else {
				break;
			}
		}while (opfinal == 0); 
	}

}
