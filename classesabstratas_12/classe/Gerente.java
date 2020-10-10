package classesabstratas_12.classe;

public class Gerente extends Funcionario {

    public Gerente() {
    }

    public Gerente(String nome, String clt, double salario) {
        super(nome, clt, salario);
    }

    

    @Override
    public void calculaSalario(){
        this.salario = salario + (salario * 0.2);
    }
    @Override
    public void imprime(){
        System.out.println("Dentro do metodo imprime Gerente");
    }
    
        
    
}
