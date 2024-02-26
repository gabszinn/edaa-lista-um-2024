public class Programa {
    public static void main(String[] args) {
        Universidade universidade = new Universidade("Universidade UNA", "MG", "Av. Universitária, 157");
        universidade.setCNPJ("12345678901234");
        universidade.mudarEndereço("Av. Congonhas, 456");

        Professor professor = new Professor("Daniel", "123.456.789-00", "Superior", 35);
        Aluno aluno = new Aluno("Gabriel", 20, "987.654.321-00", "3º semestre");
        Disciplina disciplina = new Disciplina("Estrutura de dados", aluno, "10 questões", "8 acertos");
        disciplina.setPresençaDiaria(20);
        
        int nota = disciplina.acertos(10, 2);

        System.out.println("Informações da Universidade:");
        System.out.println("Nome: " + universidade.getNome());
        System.out.println("UF: " + universidade.getUF());
        System.out.println("CNPJ: " + universidade.getCNPJ());
        System.out.println("Endereço: " + universidade.getEndereço());

        System.out.println("\nInformações do Professor:");
        System.out.println("Nome: " + professor.getNome());
        System.out.println("CPF: " + professor.getCpf());
        System.out.println("Matéria: " + professor.getGrau());
        System.out.println("Idade: " + professor.getIdade());

        System.out.println("\nInformações do Aluno:");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("CPF: " + aluno.getCpf());
        System.out.println("Semestre: " + aluno.getSemestre());

        System.out.println("\nInformações da Disciplina:");
        System.out.println("Nome: " + disciplina.getNome());
        System.out.println("Presença Diária: " + disciplina.getPresençaDiaria());
        System.out.println("Nota: " + nota);
        System.out.println("Questões: " + disciplina.getQuestoes());
        System.out.println("Acertos: " + disciplina.getAcertos());
    }
}
