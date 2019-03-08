package br.exercicio01;

import java.util.ArrayList;

public class CursoEspecializacao extends Curso {
	private boolean latoSenso; 
	private double diplomaAdicional; 
	
	public CursoEspecializacao() {
		
	}
	
	public CursoEspecializacao(int codigo, int cargaHoraria, int sala, String nome, String nomeProfessor,
			double valorCurso, ArrayList<Aluno> aluno, boolean latoSenso, double diplomaAdicional) {
		super(codigo, cargaHoraria, sala, nome, nomeProfessor, valorCurso, aluno);
		this.latoSenso = latoSenso;
		this.diplomaAdicional = diplomaAdicional;
	}

	public boolean isLatoSenso() {
		return latoSenso;
	}

	public void setLatoSenso(boolean latoSenso) {
		this.latoSenso = latoSenso;
	}

	public double getDiplomaAdicional() {
		return diplomaAdicional;
	}

	public void setDiplomaAdicional(double diplomaAdicional) {
		this.diplomaAdicional = diplomaAdicional;
	}
	
	public double setAdicionalDiploma() {
		if (super.getAluno().size() <= 10) {
			return this.diplomaAdicional = (super.getAluno().size() * 25.00); 
		}
		else if (super.getAluno().size() > 10 && super.getAluno().size() <= 30 ) {
			return this.diplomaAdicional = (super.getAluno().size() * 20.00); 
		}
		else {
			return this.diplomaAdicional = (super.getAluno().size() * 18.00);
		}
	}

	public String toString() {
		return "Curso de Especialização  \nLatoSenso: " + latoSenso + ", \nDiploma Adicional: " + diplomaAdicional + "R$";
	}
	
	
}
