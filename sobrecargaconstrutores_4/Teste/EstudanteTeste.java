package sobrecargaconstrutores_4.Teste;

import sobrecargaconstrutores_4.classe.Estudantes;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudantes est = new Estudantes("132123", "Uchoas", new double[] { 6, 8, 10 });
        est.imprime();

    }
}
