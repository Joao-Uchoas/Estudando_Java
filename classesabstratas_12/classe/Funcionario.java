package classesabstratas_12.classe;


public abstract class Funcionario extends Pessoa {
    protected String clt;
    protected double salario;


    public Funcionario(String nome, String clt, double salario) {
        this.nome = nome;
        this.clt = clt;
        this.salario = salario;
    }
    public Funcionario(){

    }
    
    @Override
    public String toString() {
        return "Funcionario [clt=" + clt + ", nome=" + nome + ", salario=" + salario + "]";
    }
    @Override
    public void imprime(){
        System.out.println("Dentro do metodo imprime Funcionario");
    }

//  class get...
    public String getNome() {
        return nome;
    }
    public String getClt() {
        return clt;
    }
    public double getSalario() {
        return salario;
    }
    //  class set...
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setClt(String clt) {
        this.clt = clt;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public  abstract void calculaSalario();
    
    
    
}
