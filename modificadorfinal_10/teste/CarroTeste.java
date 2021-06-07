package modificadorfinal_10.teste;

import modificadorfinal_10.classe.Carro;

//import modificadorfinal_10.classe.Carro;  // #usar isso

public class CarroTeste {
    public static void main(String[] args) {
        Carro c = new Carro();            // #usar isso
        //System.out.println((double) 250);   // #usar c.VELOCIDADE_FINAL no lugar de (double) 250
        System.out.println(c.getComprador());
        c.getComprador().setNome("Joao");
        System.out.println(c.getComprador());

    }
}
