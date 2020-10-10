package enum_11.teste;

import enum_11.classe.Cliente;
import enum_11.classe.TipoCliente;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ana",TipoCliente.PESSOA_FISICA);
        System.out.println(TipoCliente.PESSOA_JURIDICA.getId());
        System.out.println(cliente);
    }
    

}
