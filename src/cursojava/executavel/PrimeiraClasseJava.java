package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

/**
 * @author gborges
 *
 */
public class PrimeiraClasseJava {
	// Main é um método autoexecutável em Java
	public static void main(String[] Args) {

		List<Aluno> alunos = new ArrayList<Aluno>();
		
		for (int qtd = 1; qtd <=2; qtd++) {
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
		
		// Percorrendo a lista de objetos de aluno pelas posições 
		for (int pos = 0; pos < alunos.size(); pos++) {
			
			Aluno aluno = alunos.get(pos);
			
			if (aluno.getNome().equalsIgnoreCase("Alex")) {
				Aluno trocar = new Aluno();
				trocar.setNome("Aluno foi trocado");
				
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina("Matemática");
				disciplina.setNota(96.5);
				
				trocar.getDisciplinas().add(disciplina);
				
				alunos.set(pos, trocar);
				
				aluno = alunos.get(pos);
			}
			
			
			System.out.println("Aluno = " + aluno);
			System.out.println("Média do aluno = " + aluno.getCalculaMediaAluno());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2());
			System.out.println("------------------------------------------");
			
			for (int posicaoDisciplina = 0; posicaoDisciplina < aluno.getDisciplinas().size(); posicaoDisciplina++) {
				
				Disciplina disciplina = aluno.getDisciplinas().get(posicaoDisciplina);
				System.out.println("Matéria = "+ disciplina.getDisciplina() + ", " + "Nota = " + disciplina.getNota());
			
			}
		}
		
		
		/*for (Aluno aluno : alunos) {
			
			if(aluno.getNome().equals("Gustavo")) { 
				alunos.remove(aluno); 
				break; 
			} else {
				System.out.println(aluno);
				System.out.println("Média do aluno = " + aluno.getCalculaMediaAluno());
				System.out.println("Resultado = " + aluno.getAlunoAprovado2());
				System.out.println("------------------------------------------");
			}
		}
		
		for (Aluno aluno : alunos) {
			System.out.println("Alunos que sobraram na lista: ");
			System.out.println(aluno.getNome());
			
			System.out.println("Suas matérias são: ");
			
			
		}*/

	}

}
