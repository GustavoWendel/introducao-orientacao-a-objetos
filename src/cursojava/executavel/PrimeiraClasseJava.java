package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

/**
 * @author gborges
 *
 */
public class PrimeiraClasseJava {
	// Main é um método autoexecutável em Java
	public static void main(String[] Args) {
		
		String login = JOptionPane.showInputDialog("Informe o login: ");
		String senha = JOptionPane.showInputDialog("Informe a senha: ");
		
		if(login.equalsIgnoreCase("Admin") && senha.equalsIgnoreCase("Admin")) {
		
			List<Aluno> alunos = new ArrayList<Aluno>();
			
			/* é uma lista que dentro dela temos uma chave que identifica uma sequência de valores também*/
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
			
			List<Aluno> alunosAprovados = new ArrayList<Aluno>();
			List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
			List<Aluno> alunosReprovados = new ArrayList<Aluno>();
			
			for (int qtd = 1; qtd <= 5; qtd++) {
				/* new Aluno é uma instância (Criação de Objeto) */
	
				String nome = JOptionPane.showInputDialog("Qual é o nome do aluno "+ qtd + "?");
				/*int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
				String dataNascimento = JOptionPane.showInputDialog("Data de nascimento: ");
				String registroGeral = JOptionPane.showInputDialog("Registro Geral: ");
				String numeroCpf = JOptionPane.showInputDialog("Número de CPF: ");
				String nomeMae = JOptionPane.showInputDialog("Nome da mãe: ");
				String nomePai = JOptionPane.showInputDialog("Nome do pai: ");
				String dataMatricula = JOptionPane.showInputDialog("Data de matrícula: ");
				String nomeEscola = JOptionPane.showInputDialog("Nome da escola: ");
				String serieMatriculado = JOptionPane.showInputDialog("Série do matriculado: ");*/
	
				Aluno aluno1 = new Aluno(); // Aqui será o João */
	
				aluno1.setNome(nome);
				/*aluno1.setIdade(Integer.valueOf(idade));
				aluno1.setDataNascimento(dataNascimento);
				aluno1.setRegistroGeral(registroGeral);
				aluno1.setNumeroCpf(numeroCpf);
				aluno1.setNomeMae(nomeMae);
				aluno1.setNomePai(nomePai);
				aluno1.setDataMatricula(dataMatricula);
				aluno1.setNomeEscola(nomeEscola);
				aluno1.setSerieMatriculado(serieMatriculado);*/
	
				 for (int pos = 1; pos <= 1; pos++) {
	
					String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + "?");
					String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + "?");
	
					Disciplina disciplina = new Disciplina();
					disciplina.setDisciplina(nomeDisciplina);
					disciplina.setNota(Double.valueOf(notaDisciplina));
	
					aluno1.getDisciplinas().add(disciplina);
				} 
				
				
				int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
				
				if(escolha == 0) {
	
					int continuarRemover = 0;
					int posicao = 1;
					while (continuarRemover == 0) {
						String removerDisciplina = JOptionPane.showInputDialog("Qual é a disciplina 1, 2, 3 ou 4 ?");
						aluno1.getDisciplinas().remove(Integer.valueOf(removerDisciplina).intValue() - posicao);
						posicao++; // ++ soma +1
						continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover");
					}
					
				}
				
				alunos.add(aluno1);
			}
			
			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
			
			// processamento da lista de alunos
			for (Aluno aluno : alunos) {
				// separei em listas 
				if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);
				} else if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
				} else {
					maps.get(StatusAluno.REPROVADO).add(aluno);
				}
				
			}
			
			System.out.println("---------------Lista dos alunos aprovados---------------");
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println("Nome do aluno = " + aluno.getNome() );
				System.out.println("Resultado = "+ aluno.getAlunoAprovado2());
				System.out.println("Média = "+ aluno.getMediaNota());
			}
			
			System.out.println("---------------Lista dos alunos em recuperação---------------");
			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println("Nome do aluno = " + aluno.getNome() );
				System.out.println("Resultado = "+ aluno.getAlunoAprovado2());
				System.out.println("Média = "+ aluno.getMediaNota());
			}
			
			System.out.println("---------------Lista dos alunos reprovados---------------");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println("Nome do aluno = " + aluno.getNome() );
				System.out.println("Resultado = "+ aluno.getAlunoAprovado2());
				System.out.println("Média = "+ aluno.getMediaNota());
			}
			
		} else {
			System.out.println("Erro! Finalizando o programa. ");
			System.exit(0);
		}
	}	
}
