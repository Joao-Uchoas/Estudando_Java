package modificadorfinal_10.classe;

public class Carro {
    private String nome;
    private final Comprador comprador = new Comprador();
    private String marca;
    public static final double VELOCIDADE_FINAL = 250;

 
    public Carro(){

    }
    public Carro(String nome, String marca){
        this.nome = nome;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Carro [Nome =" + nome + ", Marca = " + marca + "]";
    }

//  class get...
    public String getNome() {
        return nome;
    }
    public String getMarca() {
        return marca;
    }
    public Comprador getComprador() {
        return comprador;
    }
// class set...
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    



  

   

}
