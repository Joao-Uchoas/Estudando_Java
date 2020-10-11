package interfaces_13.classe;

public class Produto implements Tributavel, Transportavel {
    private String nome;
    private double peso;
    private double preco;
    private double precoFinal;
    private double valorFrete;
    
    public Produto(){
        
    }
    public Produto(String nome, double peso, double preco) {
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;
    }

    @Override
    public void calcularImposto() {
        precoFinal = this.preco + (this.preco * IMPOSTO);
    }
    @Override
    public void calculafrete() {
        this.valorFrete = this.preco / peso * 0.1;
    }
    @Override
    public String toString() {
        return "Produto [nome = " + nome + ", peso = " + peso + ", preco = " + preco + ", precoFinal com Imposto = " + precoFinal
                + ", valorFrete = " + valorFrete + "]";
    }


    public String getNome() {
        return nome;
    }
    public double getPeso() {
        return peso;
    }
    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    

    
    

    
    


}
