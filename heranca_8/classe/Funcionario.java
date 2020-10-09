package heranca_8.classe;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome){
        super(nome);
    }
    public void imprime(){
        super.imprime();
        System.out.println("Salario: " + this.salario);
        imprimeReciboPagamento();
    }

    public void imprimeReciboPagamento(){
        System.out.println("Eu " + super.nome + " recebi o pagamento de " + this.salario);
    }

// class get...
    public double getSalario() {
        return salario;
    }
// class set...
    public void setSalario(double salario) {
        this.salario = salario;
    }



}
