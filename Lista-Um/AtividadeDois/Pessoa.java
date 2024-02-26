public class Pessoa {

private String Nome;
private int Idade;
private String CPF;
private String Mae;
public String getNome() {
    return Nome;
}
public void setNome(String nome) {
    Nome = nome;
}
public int getAniversário() {
    return Idade;
}
public void setAniversário(int aniversário) {
    Idade = aniversário;
}
public String getCPF() {
    return CPF;
}
public void setCPF(String cPF) {
    CPF = cPF;
}
public String getMae() {
    return Mae;
}
public void setMae(String mae) {
    Mae = mae;
}
public Pessoa(String nome, int aniversário, String cPF, String mae) {
    Nome = nome;
    Idade = aniversário;
    CPF = cPF;
    Mae = mae;
} 

} 