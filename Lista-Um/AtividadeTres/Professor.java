public class Professor {
    
    private String nome;
    private String cpf;
    private String materia;
    private int idade;
    
    public Professor(String nome, String cpf, String grau, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        materia = grau;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getGrau() {
        return materia;
    }
    public void setGrau(String grau) {
        materia = grau;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
  
}
