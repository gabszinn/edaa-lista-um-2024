public class Cachorro extends Animal {
    private String nome;
    private int idade;
    private String raça;
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
    public String getRaça() {
        return raça;
    }
    public void setRaça(String raça) {
        this.raça = raça;
    }
    public Cachorro(int id, String tipo, String habitat, String nome, int idade, String raça) {
        super(id, tipo, habitat);
        this.nome = nome;
        this.idade = idade;
        this.raça = raça;
    }
    public void chorar() {
        System.out.println("Rumm Rumm :(");
    }
}
