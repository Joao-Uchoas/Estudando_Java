package heranca_8.classe;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

// todos os contrutores
    public Pessoa(String nome){
        this.nome = nome;
    }

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Endereco: " + this.endereco.getRua() + " " + this.endereco.getBairro());
    }


// class get...
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public Endereco getEndereco() {
        return endereco;
    }
// class set...
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }   
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
