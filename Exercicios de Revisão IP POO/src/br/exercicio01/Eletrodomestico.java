package br.exercicio01;

public class Eletrodomestico {
	private String nome;
	private String descricao; 
	private boolean estado;
	
	public Eletrodomestico() {
		
	}
	
	public Eletrodomestico(String nome, String descricao, boolean estado) {
		this.nome = nome;
		this.descricao = descricao;
		this.estado = estado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean getEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public void setLigar() {
		this.setEstado(true);
	}
	
	public void setDesligar() {
		this.setEstado(false);
	}

	public String toString() {
		return nome + ", descricao: " + descricao + ", estado: " + estado;
	} 
	
	
}