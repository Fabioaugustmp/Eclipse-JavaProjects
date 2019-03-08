package br.exercicio09;

import java.util.ArrayList;

public class CursoMestrado extends Curso {
	private boolean strictoSensu; 
	private double adicionalDiploma; 
	
	public CursoMestrado() {
		
	}

	public CursoMestrado(int codigo, int cargaHoraria, int sala, String nome, String nomeProfessor, double valorCurso,
			ArrayList<Aluno> aluno, boolean strictoSensu, double adicionalDiploma) {
		super(codigo, cargaHoraria, sala, nome, nomeProfessor, valorCurso, aluno);
		this.strictoSensu = strictoSensu;
		this.adicionalDiploma = adicionalDiploma;
	}
	
	public boolean isStrictoSensu() {
		return strictoSensu;
	}

	public void setStrictoSensu(boolean strictoSensu) {
		this.strictoSensu = strictoSensu;
	}

	public double getAdicionalDiploma() {
		return adicionalDiploma;
	}

	public void setAdicionalDiploma(double adicionalDiploma) {
		this.adicionalDiploma = adicionalDiploma;
	}
	
	public double setAdicionalDiploma(){
		if (super.getAluno().size() <= 5) {
			 return this.adicionalDiploma = (super.getAluno().size() * 45.00);
		}
		else if (super.getAluno().size() > 5 && super.getAluno().size() <= 15) {
			return this.adicionalDiploma = (super.getAluno().size() * 43.00);
		}
		else if (super.getAluno().size() > 15 && super.getAluno().size() <= 30) {
			return this.adicionalDiploma = (super.getAluno().size() * 40.00); 
		}
		else {
		  return this.adicionalDiploma = (super.getAluno().size() * 36.00);
		}
	}

	public String toString() {
		return "Curso Mestrado \nStricto Sensu: " + strictoSensu + "\n Adicional Diploma: " + adicionalDiploma + "R$";
	}
	
}
