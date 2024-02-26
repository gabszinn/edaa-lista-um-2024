public class Programa {
public static void main(String[] args) {
    System.out.println("Esse é seu novo bichinho, aqui estão as informações dele(a):");
    
    Cachorro cachorro = new Cachorro(1, "Domesticavel", "Casa", "Sofia", 10, "Yorkshire");
    System.out.println("\nO tipo do(a) bichinho(a) é: " + cachorro.getTipo());
    System.out.println("O nome do(a) bichinho(a) é: " + cachorro.getNome());
    System.out.println("O habitat dele(a) é: " + cachorro.getHabitat());
    System.out.println("A idade dele(a) é: " + cachorro.getIdade());
    System.out.println("A raça dele(a) é: " + cachorro.getRaça());
    cachorro.chorar();
}

}