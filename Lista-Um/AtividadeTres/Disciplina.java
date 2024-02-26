public class Disciplina {
    private String nome;
    private int presençaDiaria;
    private int nota;
    private Aluno aluno;
    private String Questoes;
    private String acertos;

    public Disciplina(String nome, Aluno aluno, String questoes, String acertos) {
        this.nome = nome;
        this.aluno = aluno;
        Questoes = questoes;
        this.acertos = acertos;
    }
    public void setPresençaDiaria(int presençaDiaria) {
        this.presençaDiaria = presençaDiaria;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getPresençaDiaria() {
        return presençaDiaria;
    }
    public int getNota() {
        return nota;
    }
    public Aluno getAluno() {
        return aluno;
    }
    public String getQuestoes() {
        return Questoes;
    }
    public String getAcertos() {
        return acertos;
    }
    public int acertos(int Questoes, int erro) {
        nota = Questoes - erro;
        return nota;

    }
}
