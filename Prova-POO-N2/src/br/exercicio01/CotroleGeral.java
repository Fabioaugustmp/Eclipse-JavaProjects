package br.exercicio01;

import java.util.ArrayList;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class CotroleGeral {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		ArrayList <Aluno> Alunos = new ArrayList <Aluno>();
		ArrayList <Curso> Cursos = new ArrayList <Curso>(); 
		ArrayList <CursoEspecializacao> CursosEsp = new ArrayList <CursoEspecializacao>();
		ArrayList <CursoMestrado> CursoMes = new ArrayList <CursoMestrado>(); 
		
		int p = 0, op = 0, oppp = 0;
		String opp = ""; 
		
		JOptionPane.showMessageDialog(null, "BEM VINDO AO SISTEMA !!!");
		
		 do{
			JOptionPane.showMessageDialog(null, "===== CADASTRO ALUNOS =====");
			System.out.println("Deseja Cadastrar Aluno Masculino ou Feminino ?");
			System.out.println("\t[M] para Masculino\n"
					+ "\t[F] para Feminino");
			
			opp = sc.nextLine(); 	
			
				while (!opp.equalsIgnoreCase("F")  && !opp.equalsIgnoreCase("M") ) {
					JOptionPane.showMessageDialog(null, "INVALIDO!!!\n\tEscolha entre [M] ou [F]");
					opp = sc.nextLine(); 
				}
				
				if (opp.equalsIgnoreCase("F")) {
					Aluno alunos = new Aluno();
					
					System.out.println("Informe o seu Nome: ");
					alunos.setNome(sc.nextLine());
					System.out.println(alunos.getNome() + ", Informe seu CPF:");
					alunos.setCpf(sc.nextLine());
						while(alunos.getCpf().length() != 11) {
							System.out.println("O CPF deve Conter 11 Caractéres!");
							System.out.println("Digite O CPF Novamente: ");
							alunos.setCpf(sc.nextLine());
						}
					System.out.println(alunos.getNome() + ", Informe a sua Idade: ");
					alunos.setIdade(sc.nextInt());
					System.out.println(alunos.getNome() + ", Informe o seu Endereço: ");
					alunos.setEndereco(sc.nextLine());
					alunos.setEndereco(sc.nextLine());
					System.out.println(alunos.getNome() + ", Informe o Código: ");
					alunos.setCodigo(sc.nextInt());
					System.out.println();
					
					System.out.println("========== CADASTRO DE NOTAS ==========");
					System.out.println(alunos.getNome() + ", Informe a 1º Nota: ");
					alunos.setN1(sc.nextDouble());
					System.out.println(alunos.getNome() + ", Informe a 2ª Nota: ");
					alunos.setN2(sc.nextDouble());
					System.out.println(alunos.getNome() + ", Informe a 3ª Nota: ");
					alunos.setN3(sc.nextDouble());
					System.out.println("========================================");

					Alunos.add(alunos);
					
				}
				else {
					AlunoMasculino alunoM= new AlunoMasculino (); 
					
					System.out.println("Informe o seu Nome: ");
					alunoM.setNome(sc.nextLine());
					System.out.println(alunoM.getNome() + ", Informe seu CPF:");
					alunoM.setCpf(sc.nextLine());
					while(alunoM.getCpf().length() != 11) {
						System.out.println("O CPF deve Conter 11 Caractéres!");
						System.out.println("Digite O CPF Novamente: ");
						alunoM.setCpf(sc.nextLine());
					}
					System.out.println("Informe o Número da Sua Identidade Militar: ");
					alunoM.setIdentidadeMilitar(sc.nextLine());
							while(alunoM.getCpf().length() < 5) {
								System.out.println("A Identidade Militar deve Conter no Mínimo 5 Caractéres!");
								System.out.println("Digite O Número da Identidade Militar Novamente: ");
								alunoM.setIdentidadeMilitar(sc.nextLine());
							}
					System.out.println(alunoM.getNome() + ", Informe a sua Idade: ");
					alunoM.setIdade(sc.nextInt());
					System.out.println(alunoM.getNome() + ", Informe o seu Endereço: ");
					alunoM.setEndereco(sc.nextLine());
					alunoM.setEndereco(sc.nextLine());
					System.out.println(alunoM.getNome() + ", Informe o Código: ");
					alunoM.setCodigo(sc.nextInt());
					System.out.println();
					
					System.out.println("========== CADASTRO DE NOTAS ==========");
					System.out.println(alunoM.getNome() + ", Informe a 1º Nota: ");
					alunoM.setN1(sc.nextDouble());
					System.out.println(alunoM.getNome() + ", Informe a 2ª Nota: ");
					alunoM.setN2(sc.nextDouble());
					System.out.println(alunoM.getNome() + ", Informe a 3ª Nota: ");
					alunoM.setN3(sc.nextDouble());
					System.out.println("========================================");
					System.out.println();

					Alunos.add(alunoM); 
				}
				
				p = JOptionPane.showConfirmDialog(null, "Deseja Cadastrar Mais Alunos?"); 
				
		} while(p == 0); 
		
			System.out.println("\n");
			System.out.println("/-/-/-/-/-/-/-/-/-/-/ CADASTROS /-/-/-/-/-/-/-/-/-/-/");
			System.out.println("\n");
			
			do {
			String [] optioncourse = {"Curso", "Especialização", "Mestrado"}; 
			 int var = JOptionPane.showOptionDialog(null, "Escolha qual Array-List deseja Acessar",
	                "OPÇÕES",
	                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, optioncourse, optioncourse[0]);
			System.out.println("Informe A opção desejada");
		if (var == 0) {
		do {
			Curso curso = new Curso();
			JOptionPane.showMessageDialog(null, "========== CADASTRO DE CURSO ===========");
			
			System.out.println("========== CADASTRO DE CURSO ==========");
			System.out.println("Informe o Nome do Curso: ");
			curso.setNome(sc.nextLine());
			sc.nextLine(); 
			System.out.println("Informe o Código do Curso: ");
			curso.setCodigo(sc.nextInt());
			System.out.println("Informe o Número da Sala: ");
			curso.setSala(sc.nextInt());
			System.out.println("Informe a Carga-Horária do Curso: ");
			curso.setCargaHoraria(sc.nextInt());
				while(curso.getCargaHoraria() <= 0) {
					JOptionPane.showMessageDialog(null, " CARGA-HORÁRIA INVÁLIDA!!!");
					JOptionPane.showInputDialog("Informe Uma Carga-Horária maior que [0]");
				}
			System.out.println("Nome do Professor: ");
			curso.setNomeProfessor(sc.nextLine());
			sc.nextLine();
			System.out.println("Valor do Curso $");
			curso.setValorCurso(sc.nextDouble());
				while(curso.getValorCurso() <= 0) {
				JOptionPane.showMessageDialog(null, " VALOR DO CURSO INVÁLIDO !!!");
				JOptionPane.showInputDialog("Informe um valor maior que R$ 0.00");
			}
			curso.setAluno(Alunos);
			
			Cursos.add(curso);
			
			 op = JOptionPane.showConfirmDialog(null, "Deseja Cadastrar mais Cursos de Graduação? "); 
		} while(op == 0); 
	}
		else if (var == 1) {
		do {
			CursoEspecializacao cursosEsp = new CursoEspecializacao(); 
			JOptionPane.showMessageDialog(null, "========== CADASTRO DE CURSO DE ESPECIALIZAÇÃO ==========");
			
			System.out.println();
			System.out.println("========== CADASTRO DE CURSO DE ESPECIALIZAÇÃO ==========");
			System.out.println("Informe o Nome do Curso: ");
			cursosEsp.setNome(sc.nextLine());
			sc.nextLine();
			System.out.println("Informe o Código do Curso: ");
			cursosEsp.setCodigo(sc.nextInt());
			System.out.println("Informe o Número da Sala: ");
			cursosEsp.setSala(sc.nextInt());
			System.out.println("Informe a Carga-Horária do Curso: ");
			cursosEsp.setCargaHoraria(sc.nextInt());
				while(cursosEsp.getCargaHoraria() <= 0) {
					JOptionPane.showMessageDialog(null, " CARGA-HORÁRIA INVÁLIDA!!!");
					JOptionPane.showInputDialog("Informe Uma Carga-Horária maior que [0]");
				}
			System.out.println("Nome do Professor: ");
			cursosEsp.setNomeProfessor(sc.nextLine());
			sc.nextLine();
			System.out.println("Valor do Curso $");
			cursosEsp.setValorCurso(sc.nextDouble());
				while(cursosEsp.getValorCurso() <= 0) {
				JOptionPane.showMessageDialog(null, " VALOR DO CURSO INVÁLIDO !!!");
				JOptionPane.showInputDialog("Informe um valor maior que R$ 0.00");
			}
			
			cursosEsp.setAluno(Alunos);
			
			System.out.println("Possui Lato Senso? \n\tTRUE ?, FALSE ?");
			cursosEsp.setLatoSenso(sc.hasNext());
			
			cursosEsp.setAdicionalDiploma(); 
			System.out.println(cursosEsp.setAdicionalDiploma());
			
			CursosEsp.add(cursosEsp); 
			
			op = JOptionPane.showConfirmDialog(null, "Deseja Cadastrar mais Cursos de Especialização? "); 
		} while (op == 0);
	}
		else {
		do {
			CursoMestrado cursoMest = new CursoMestrado();
			JOptionPane.showMessageDialog(null, "========== CADASTRO DE CURSO MESTRADO ==========");
			
			System.out.println();
			System.out.println("========== CADASTRO DE CURSO MESTRADO ==========");
			System.out.println("Informe o Nome do Curso: ");
			cursoMest.setNome(sc.nextLine());
			sc.nextLine();
			System.out.println("Informe o Código do Curso: ");
			cursoMest.setCodigo(sc.nextInt());
			System.out.println("Informe o Número da Sala: ");
			cursoMest.setSala(sc.nextInt());
			System.out.println("Informe a Carga-Horária do Curso: ");
			cursoMest.setCargaHoraria(sc.nextInt());
				while(cursoMest.getCargaHoraria() <= 0) {
					JOptionPane.showMessageDialog(null, " CARGA-HORÁRIA INVÁLIDA!!!");
					JOptionPane.showInputDialog("Informe Uma Carga-Horária maior que [0]");
				}
			System.out.println("Nome do Professor: ");
			cursoMest.setNomeProfessor(sc.nextLine());
			sc.nextLine();
			System.out.println("Valor do Curso $");
				while(cursoMest.getCargaHoraria() <= 0) {
				JOptionPane.showMessageDialog(null, " VALOR DO CURSO INVÁLIDO !!!");
				JOptionPane.showInputDialog("Informe um valor maior que R$ 0.00");
			}
			cursoMest.setValorCurso(sc.nextDouble());
			cursoMest.setAluno(Alunos);
			System.out.println(cursoMest.getAluno() + "Possui Stricto Senso?");
			System.out.println("Possui Lato Senso? \n\tTRUE ?, FALSE ?");
			cursoMest.setStrictoSensu(sc.hasNext());
			
			cursoMest.setAdicionalDiploma(); 
			
			
			CursoMes.add(cursoMest); 
			op = JOptionPane.showConfirmDialog(null, "Deseja Cadastrar mais Cursos de Mestrado? "); 
		} while (op == 0); 
		}
		oppp = JOptionPane.showConfirmDialog(null, "Deseja Cadastrar mais Cursos? ");
			}while (oppp == 0);
		do {
			JOptionPane.showMessageDialog(null, "========== ArrayList ACESSO ==========");
			System.out.println();
			System.out.println("========== ArrayList ACESSO ==========");
			System.out.println();
			
			String [] options = {"Alunos", "Cursos", "Especialização", "Mestrado"}; 
			 int var = JOptionPane.showOptionDialog(null, "Escolha qual Array-List deseja Acessar",
	                "OPÇÕES",
	                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
			System.out.println("Informe A opção desejada");
			
	
			if (var == 0) {
				for(Aluno all : Alunos) {
					JOptionPane.showMessageDialog(null, all , "Lista de Alunos", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			else if (var == 1) {
				for (Curso course : Cursos) {
					JOptionPane.showMessageDialog(null, course , "Lista de Cursos", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			else if (var == 2) {
				for (CursoEspecializacao cE : CursosEsp){
					JOptionPane.showMessageDialog(null, cE , "Lista de Cursos de Especialização", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			else {
				for (CursoMestrado cM : CursoMes){
					JOptionPane.showMessageDialog(null, cM , "Lista de Cursos Mestrado", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			
			op = JOptionPane.showConfirmDialog(null, "Deseja Continuar a ver as Listas? ");
		}while (op == 0); 
		
		do {
			op = JOptionPane.showConfirmDialog(null, "Desja Consultar Nome na Lista ?");
			
			String name = JOptionPane.showInputDialog(null, "Informe o Nome desejado:");
			if (Alunos.contains(name)) {
					JOptionPane.showMessageDialog(null, "Este Nome está na Lista!");
				}
				else {
					JOptionPane.showMessageDialog(null, "Este Nome não está na Lista!");
				}
			JOptionPane.showConfirmDialog(null, "Deseja Consutar mais algum Nome na Lista?");
		} while(op == 0); 
		
		JOptionPane.showMessageDialog(null, "OBRIGADO POR UTILIZAR NOSSO SISTEMA!");
		
		sc.close();
		}
}
