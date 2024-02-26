public class Programa {
public static void main(String[] args) {
 
  Livro livro = new Livro("250", "Brasil livros", "JK rowling", "Principe pequeno");
  
  System.out.println("Welcome to the Bookstore!");
  System.out.println("A seguir, estão as informações do livro de sua escolha:");
  System.out.println("\nO livro é:");
  System.out.println(livro.getTitulo());

  System.out.println("A editora é:");
  System.out.println(livro.getEditora());

  System.out.println("A autora é:");
  System.out.println(livro.getAutor());

  System.out.println("Numero de paginas:");
  System.out.println(livro.getPaginas());
  System.out.println("Deseja obter o livro?");
  }
}