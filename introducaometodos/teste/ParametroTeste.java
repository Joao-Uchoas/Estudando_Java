package introducaometodos.teste;

import introducaometodos.classes.Calculadora;

public class ParametroTeste {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int num1 = 5;
        int num2 = 10;

        calculadora.alteraDoisNumeros(num1, num2);

        System.out.println("Fora do altera dois numeros");
        System.out.println("num1: "+ num1);
        System.out.println("num2: "+ num2);
        
        
    }
    
}
