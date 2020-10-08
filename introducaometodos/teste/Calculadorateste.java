package introducaometodos.teste;

import introducaometodos.classes.Calculadora;

public class Calculadorateste {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        float res;
        calculadora.somaDoisNumeros();
        res = calculadora.multiplica(5, 10);
        System.out.println(res);


        int[] numeros = new int[]{1,2,3,4,5};

        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3,4,5);



    }
}
