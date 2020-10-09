package exerciciodeassociacao_7.classe;

public class Aluno {
    
    private Seminario seminario;
    private String nome;
    private int idade;


    
    public Aluno(){

    }
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprime(){
        System.out.println("--------------------Relatório do Alunos--------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if(this.seminario != null)
            System.out.println("Seminario: " + this.seminario.getTitulo());
        else
            System.out.println("Aluno não esta escrito em nenhum seminario.");
    }


    public Seminario getSeminario() {
        return seminario;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

   



}
