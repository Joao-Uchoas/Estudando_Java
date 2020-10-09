package heranca_8.teste;

import heranca_8.classe.Endereco;
import heranca_8.classe.Funcionario;
import heranca_8.classe.Pessoa;

public class HerancaTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Uchoas");
        Endereco endereco = new Endereco();
        Funcionario funcionario = new Funcionario("Alison");

        pessoa.setCpf("1359872");

        endereco.setBairro("Bairro 1");
        endereco.setRua("Rua da vida");
        pessoa.setEndereco(endereco);

        
        funcionario.setCpf("4681233");
        funcionario.setSalario(30000);
        funcionario.setEndereco(endereco);
        
    
        pessoa.imprime();
        System.out.println("-------------------------------");
        funcionario.imprime();

        
        
    }
}
