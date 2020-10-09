package sobrescrita_9.classe;

public class Pessoa extends Object {
    private String nome;
    private int idade;

    @Override
    public String toString() {
        return "Pessoa [idade=" + idade + ", nome=" + nome + "]";
    }

//  class get...
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
//  class set...
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    


}
