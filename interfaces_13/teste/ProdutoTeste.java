package interfaces_13.teste;

import interfaces_13.classe.Produto;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 4, 3000);
        produto.calcularImposto();
        produto.calculafrete();
        System.out.println(produto);
    }
}
