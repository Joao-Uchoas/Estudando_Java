package classesabstratas_12.teste;

import classesabstratas_12.classe.Gerente;
import classesabstratas_12.classe.Vendedor;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Anna", "212565-6", 7000);
        Vendedor vendedor = new Vendedor("Malu", "845312-8", 2500, 5000);
        gerente.calculaSalario();
        vendedor.calculaSalario();
        System.out.println(gerente);
        System.out.println(vendedor);
        vendedor.imprime();
        gerente.imprime();
    }   
}
