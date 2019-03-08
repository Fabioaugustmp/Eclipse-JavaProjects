package br.exercicio09;

public class AlunoMasculino extends Aluno {
	private String identidadeMilitar; 
	
	public AlunoMasculino() {
		
	}
	public AlunoMasculino(double n1, double n2, double n3, int codigo, int idade, String nome, String cpf,
			String endereco, boolean sexo, Notas notas, String identidadeMilitar) {
		super(n1, n2, n3, codigo, idade, nome, cpf, endereco, sexo, notas);
		this.identidadeMilitar = identidadeMilitar;
	}

	public String getIdentidadeMilitar() {
		return identidadeMilitar;
	}

	public void setIdentidadeMilitar(String identidadeMilitar) {
		this.identidadeMilitar = identidadeMilitar;
	}

	public String toString() {
		return super.toString() +" AlunoMasculino - IdentidadeMilitar: " + identidadeMilitar;
	}

	

	
	
	
	
	
}
