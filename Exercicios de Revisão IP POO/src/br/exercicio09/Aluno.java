package br.exercicio09;

public class Aluno extends Notas{
	private int codigo; 
	private int idade; 
	private String nome; 
	private String cpf;
	private String endereco; 
	private boolean sexo; 
	private Notas notas; 
	
	public Aluno() {
		
	}
	public Aluno(double n1, double n2, double n3, int codigo, int idade, String nome, String cpf, String endereco,
			boolean sexo, Notas notas) {
		super(n1, n2, n3);
		this.codigo = codigo;
		this.idade = idade;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.sexo = sexo;
		this.notas = notas;
	}

	public Aluno(int codigo, int idade, String nome, String cpf, String endereco, boolean sexo) {
		this.codigo = codigo;
		this.idade = idade;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.sexo = sexo;
		this.notas = new Notas();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public boolean getSexo() {
		return sexo;
	}

	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}

	public Notas getNotas() {
		return notas;
	}

	public void setNotas(Notas notas) {
		this.notas = notas;
	}
	
	public String toString() {
		return "Aluno =  Código: " + codigo + ",\tIdade: " + idade + ", \tNome: " + nome + ", \nCPF: " + cpf 
				+ ",\nEndereço: " + endereco + ",\tSexo: " + sexo + ",\nNotas [N1 = " + this.getN1() + "]" 
				+ "\t[N2 = " + this.getN2() + "]" + "\t[N3 = " + this.getN3() + "]"  
			    + "\nMedia = "+ this.getMedia() + "\tSituação: ";
	}
	
	public String getSituacao() {
		if (this.notas.getMedia() >= 6) {
			return "Aluno Aprovado!";
		}
		else {
			return "Aluno Reprovado!"; 
		}
	}
	
	
	
}
