package polimorfismo_14.classe;

public class RelatorioPagamento  {
/*    
    public void relatorioPagamenteGerente(Gerente gerente){
        System.out.println("Gerando relatorio de pagamento para a gerencia");
        gerente.calcularPagamento();
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Salario: " + gerente.getSalario());
    }

    public void relatorioPagamenteVendedor(Vendendor vendedor){
        System.out.println("Gerando relatorio de pagamento para o vendedor");
        vendedor.calcularPagamento();
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Salario: " + vendedor.getSalario());
    }
*/
    public void relatorioPagamenteGenerico(Funcionario funcionario){
        System.out.println("Gerando relatorio de pagamento");
        funcionario.calcularPagamento();
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salario: " + funcionario.getSalario());

        if(funcionario instanceof Gerente)
            System.out.println("Participação dos lucros: " + ((Gerente) funcionario).getPnl());
        else if(funcionario instanceof Vendedor)
            System.out.println("Total de vendas: " + ((Vendedor) funcionario).getTotalVendas());

    } 
}
