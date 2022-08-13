package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Gustavo Wendel");
        aluno.setNomeEscola("JDEV - Treinamento");

        Diretor diretor = new Diretor();
        diretor.setRegistroGeral("6454464646");
        diretor.setNome("Alex Egídio");

        Secretario secretario = new Secretario();
        secretario.setExperiencia("Administração");
        secretario.setNumeroCpf("adasdasdasdas");

        System.out.println(aluno);
        System.out.println(diretor);
        System.out.println(secretario);

    }
}
