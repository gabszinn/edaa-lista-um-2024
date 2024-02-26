public class Livro {
    public Livro(String titulo) {
        Titulo = titulo;
    }
    private String Titulo;
    private String Paginas;
    private String editora;
    private String autor;

    public Livro(String paginas, String editora, String autor, String titulo) {
        Paginas = paginas;
        this.editora = editora;
        this.autor = autor;
        this.Titulo = titulo;
    }
    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String titulo) {
    }
    public String getPaginas() {
        return Paginas;
    }
    public void setPaginas(String paginas) {
        Paginas = paginas;
    }
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
}
