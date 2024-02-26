public class Aluno {
    private String nome;
    private int idade;
    private String cpf;
    private String semestre;

    public Aluno(String nome, int idade, String cpf, String semestre){

    this.nome = nome;
    this.idade = idade;
    this.cpf = cpf;
    this.semestre = semestre;

    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getCpf() {
        return cpf;
    }
    
    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
}
