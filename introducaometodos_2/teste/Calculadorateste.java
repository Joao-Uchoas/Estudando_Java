package introducaometodos_2.teste;

import java.io.IOException;
import java.util.Scanner;

import introducaometodos_2.classes.Calculadora;

public class Calculadorateste {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
//declare suas variaveis corretamente
        int[] numeros = new int[5];
        int a=0,b=0,c=0,d=0;

//continue a solução
        for (int x = 0; x<5; x++) {
        	numeros[x] = leitor.nextInt();
        	if(numeros[x] %2 == 0)
        	  a++;
        	else 
        	  b++;
        	  
        	 if(numeros[x] >= 0)
        	  c++;
        	 else 
        	  d++;
        }
//insira suas variaveis corretamente
        System.out.println(a + " valor(es) par(es)");
        System.out.println(b + " valor(es) impar(es)");
        System.out.println(c + " valor(es) positivo(s)");
        System.out.println(d + " valor(es) negativo(s)");
    }
}
