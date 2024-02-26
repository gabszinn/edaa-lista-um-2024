public class Programa {
public static void main(String[] args) {
    Pessoa pessoa = new Pessoa("Gabriel", 20, "123.456.789.10", "Fernanda");

    System.out.println("Olá, aqui estão seus dados de cadastro: ");
    
    System.out.println("Seu nome é: " + pessoa.getNome());
    System.out.println("Sua data de aniversário é: "+ pessoa.getAniversário());
    System.out.println("Seu CPF é: " + pessoa.getCPF());
    System.out.println("Sua mãe se chama: " + pessoa.getMae());
}


}