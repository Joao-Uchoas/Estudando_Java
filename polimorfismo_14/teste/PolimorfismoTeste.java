package polimorfismo_14.teste;


import polimorfismo_14.classe.Gerente;
import polimorfismo_14.classe.RelatorioPagamento;
import polimorfismo_14.classe.Vendedor;

public class PolimorfismoTeste {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Henrrique", 6000, 1800);
        Vendedor vendedor = new Vendedor("Yuri", 2800, 20000);
        RelatorioPagamento relatorioPagamento = new RelatorioPagamento();
        relatorioPagamento.relatorioPagamenteGenerico(gerente);
        System.out.println("---------------------------------------------------------------------------");
        relatorioPagamento.relatorioPagamenteGenerico(vendedor);

    }
}
