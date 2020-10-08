package modificadoresestatico_6.classe;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 240;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public Carro() {
    }

    public void imprime(){
        System.out.println("-----------------------------------");
        System.out.println("Nome do carro: " + this.nome);
        System.out.println("Velocidade maxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade limite: " + velocidadeLimite);

    }


    public String getNome() {
        return nome;
    }
    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    public static double getVelocadadeLimite(){
        return velocidadeLimite;
    }
     

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }  




}
