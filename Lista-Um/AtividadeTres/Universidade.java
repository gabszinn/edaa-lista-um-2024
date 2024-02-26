public class Universidade {
    
    private String nome;
    private String UF;
    private int numero;
    private String CNPJ;
    private String endereco;

    public Universidade(String nome, String uF, String endereço) {
        this.nome = nome;
        UF = uF;
        this.endereco = endereço;
    }
    public String mudarEndereço(String novoEndereço) {

        endereco = novoEndereço;
        return endereco;
    }
    public String getUF() {
        return UF;
    }
    public int getNumero() {
        return numero;
    }

    public String getCNPJ() {
        return CNPJ;
    }
    public void setCNPJ(String cNPJ) {
        CNPJ = cNPJ;
    }
    
    public String getNome() {
        return nome; 
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereço() {
        return endereco;
    }
    public void setEndereço(String endereço) {
        this.endereco = endereço;
    }

}
