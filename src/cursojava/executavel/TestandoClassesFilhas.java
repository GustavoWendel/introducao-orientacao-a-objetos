package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Gustavo Wendel");
        aluno.setNomeEscola("JDEV - Treinamento");
        aluno.setIdade(16);

        Diretor diretor = new Diretor();
        diretor.setRegistroGeral("6454464646");
        diretor.setNome("Alex Egídio");
        diretor.setIdade(50);

        Secretario secretario = new Secretario();
        secretario.setNome("Jovelino");
        secretario.setExperiencia("Administração");
        secretario.setNumeroCpf("0123456789");
        secretario.setIdade(18);

        System.out.println(aluno);
        System.out.println(diretor);
        System.out.println(secretario);

        System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
        System.out.println(diretor.pessoaMaiorIdade());
        System.out.println(secretario.pessoaMaiorIdade());

        System.out.println("Salário do Aluno: R$ " + aluno.salario());
        System.out.println("Salário do Diretor: R$ " + diretor.salario());
        System.out.println("Salário do Secretário: R$ " + secretario.salario());

        teste(aluno);
        teste(diretor);
        teste(secretario);

    }

    public static void teste(Pessoa pessoa) {
        System.out.println("Essa pessoa é = " + pessoa.getNome() +
                " e o salário é = R$ " + pessoa.salario());
    }
}
