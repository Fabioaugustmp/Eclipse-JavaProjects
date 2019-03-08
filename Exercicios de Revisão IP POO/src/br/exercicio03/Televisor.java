package br.exercicio03;

import java.util.Random;

import javax.swing.JOptionPane;

public class Televisor {
	private boolean estado; 
	public int canal; 
	private int volume; 
	
	public Televisor() {
		
	}

	public Televisor(boolean estado, int canal, int volume) {
		this.estado = estado;
		this.canal = canal;
		this.volume = volume;
	}

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public void Ligado () {
		this.setEstado(true);
		
		if (this.getEstado() == true) {
			System.out.println("Televisor Ligado (ON)");
		}
	}
	
	public void Desligado () {
		this.setEstado(false);
		
		if (this.getEstado() == false) {
			System.out.println("Televisor Desligado (OFF)");
		}
	}
	
	public void Canal() {
		this.setCanal(canal);
		System.out.println("Está no Canal " + this.getCanal());
	}
	
	public void subirCanal() {
		do {
			if (canal >= 0) {
				canal++;
				System.out.println("CANAL: " + this.getCanal());
			}
		} while (this.canal == 0);
		
	}
	
	public void diminuirCanal() {
		
		do {
			if (canal >= 0) {
				canal --;
				System.out.println("CANAL: " + this.getCanal());
			}
			else if (canal < 0){
				System.out.println("Informe um CANAL VALIDO !");
			}
		} while (this.canal > 0);
	}
	
	public void Volume () {
		this.setVolume(volume);
		System.out.println("Volume: " + this.getVolume());
	}
	
	public void aumentarVolume() {
		volume ++;
		System.out.println("Volume: " + this.getVolume());
	}
	
	public void diminuirVolume() {
		volume --; 
		System.out.println("Volume: " + this.getVolume());
	}
	
	
		Random random = new Random();
	
		int modelos = random.nextInt(5); 
	
	public void modeloTelevisor() {
			switch (modelos) {
			case 1: 
				JOptionPane.showMessageDialog(null, "SAMSUNG TV");
				System.out.println();
				System.out.println("SAMSUNG TV");
				System.out.println();
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "PANASONIC TV");
				System.out.println();
				System.out.println("PANASONIC TV");
				System.out.println();
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "LG SMART TV");
				System.out.println();
				System.out.println("LG SMART TV");
				System.out.println();

				break;
			case 4:
				JOptionPane.showMessageDialog(null, "SONY TV");
				System.out.println();
				System.out.println("SONY TV");
				System.out.println();
				break;
			case 5: 
				JOptionPane.showMessageDialog(null, "TOSHIBA TV");
				System.out.println();
				System.out.println("TOSHIBA TV");
				System.out.println();
				break;
			}
	}
	
	public void Imprimir() {
		if (this.estado == true) {
			System.out.println();
			System.out.println("-----***** INFORMAÇÔES *****-----");
			this.Ligado();
			this.modeloTelevisor();
			this.Canal();
			System.out.println();
			this.Volume();
			System.out.println("-----***** TELEVISOR *****-----");
		}
		
		else if (this.estado == false ) {
			System.out.println();
			System.out.println("-----***** TELEVISOR *****-----");
			this.Desligado();
		}
	}
	
	
	public String toString() {
		return "\"-----***** INFORMAÇÔES *****-----\" \n\n"  + this.getEstado() + "\nModelo Do Televisor: \t" 
				+ this.modelos + "\nCanal: "+ canal + "\nVolume: " + volume + "\n-----***** TELEVISOR *****-----";
	}
	
}
