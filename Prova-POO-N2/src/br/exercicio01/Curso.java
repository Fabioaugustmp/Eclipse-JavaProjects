package br.exercicio01;

import java.util.ArrayList;

public class Curso {
		private int codigo; 
		private int cargaHoraria; 
		private int sala; 
		private String nome; 
		private String nomeProfessor; 
		private double valorCurso; 
		private ArrayList<Aluno> aluno; 
		
		public Curso() {
			
		}

		public Curso(int codigo, int cargaHoraria, int sala, String nome, String nomeProfessor, double valorCurso,
				ArrayList<Aluno> aluno) {
			this.codigo = codigo;
			this.cargaHoraria = cargaHoraria;
			this.sala = sala;
			this.nome = nome;
			this.nomeProfessor = nomeProfessor;
			this.valorCurso = valorCurso;
			this.aluno = aluno;
		}

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public int getCargaHoraria() {
			return cargaHoraria;
		}

		public void setCargaHoraria(int cargaHoraria) {
			this.cargaHoraria = cargaHoraria;
		}

		public int getSala() {
			return sala;
		}

		public void setSala(int sala) {
			this.sala = sala;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getNomeProfessor() {
			return nomeProfessor;
		}

		public void setNomeProfessor(String nomeProfessor) {
			this.nomeProfessor = nomeProfessor;
		}

		public double getValorCurso() {
			return valorCurso;
		}

		public void setValorCurso(double valorCurso) {
			this.valorCurso = valorCurso;
		}

		public ArrayList<Aluno> getAluno() {
			return aluno;
		}

		public void setAluno(ArrayList<Aluno> aluno) {
			this.aluno = aluno;
		}

		public String toString() {
			return "Curso = Código: " + codigo + ",\n Carga Horaria:" + cargaHoraria + "\t, Sala: " + sala + ", Nome: " + nome
					+ "\n Nome do Professor:" + nomeProfessor + ", Valor do Curso:" + valorCurso + ", Aluno" + aluno;
		}
		
		
		
	

}
