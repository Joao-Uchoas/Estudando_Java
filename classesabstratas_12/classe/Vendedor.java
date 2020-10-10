package classesabstratas_12.classe;

public class Vendedor extends Funcionario {
    private double totalVendas;
    
   
    
    public Vendedor(String nome, String clt, double salario, double totalVendas) {
        super(nome, clt, salario);
        this.totalVendas = totalVendas;
    }
    public Vendedor(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    @Override
    public void calculaSalario(){
        this.salario = salario + (totalVendas * 0.05);
    }

    @Override
    public void imprime() {
        System.out.println("Dentro do metodo imprime Vendedor");
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    

    
}
