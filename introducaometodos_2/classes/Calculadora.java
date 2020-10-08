package introducaometodos_2.classes;


public class Calculadora {
    public void somaDoisNumeros(){

        System.out.println(5+5);
    }
    public float multiplica(float num1,float num2){
        float mult = num1 * num2;
        return mult;
    } 


    public void alteraDoisNumeros(int num1, int num2){
        num1 = 30;
        num2 = 40;

        System.out.println("Dentro do altera dois numeros");
        System.out.println("num1: "+ num1);
        System.out.println("num2: "+ num2);


    }

    public void somaArray(int[] numeros){
        int soma = 0;

        for(int num : numeros){
            soma+=num;
        }
        System.out.println(soma);

    }


    public void somaVarArgs(int... numeros){

        int soma = 0;

            for(int num : numeros){
                soma+=num;
            }
            System.out.println(soma);

    }
}
