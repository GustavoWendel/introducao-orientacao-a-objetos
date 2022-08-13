package cursojava.classes;

// Classe filha que extende de Pessoa
public class Diretor extends Pessoa {

    private String registroGeral;
    private int tempoDirecao;
    private String titulacao;

    public String getRegistroGeral() {
        return registroGeral;
    }

    public void setRegistroEducacaoGeral(String RegistroGeral) {
        this.registroGeral = RegistroGeral;
    }

    public int getTempoDirecao() {
        return tempoDirecao;
    }

    public void setTempoDirecao(int tempoDirecao) {
        this.tempoDirecao = tempoDirecao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public String toString() {
        return "Diretor {" +
                "registroGeral='" + registroGeral + '\'' +
                ", tempoDirecao=" + tempoDirecao +
                ", titulacao='" + titulacao + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", numeroCpf='" + numeroCpf + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", nomePai='" + nomePai + '\'' +
                '}';
    }
}
