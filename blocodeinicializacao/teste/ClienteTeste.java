package blocodeinicializacao.teste;


import blocodeinicializacao.classe.Cliente;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        System.out.println("Exibir quantidade de parcelas possiveis");
        for(int parcela : c.getParcelas()){
            System.out.print(parcela + " ");


        }
    }
}
