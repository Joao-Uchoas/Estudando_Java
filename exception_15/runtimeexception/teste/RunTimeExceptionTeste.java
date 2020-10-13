package exception_15.runtimeexception.teste;

public class RunTimeExceptionTeste {
    public static void main(String[] args) {
/*
        Object o = null;
        System.out.println(o.toString());

        int a = 10;
        int b = 0;
        
        //vai dar erro e precisara ser tratado. ex:
        if(b != 0){
            int c = a/b;
            System.out.println(c);
        }
        else
            System.out.println("Não exite divisão por 0 (zero)");
-----------------------------------------------------//-----------------------------------------------------
        // ISSO É UMA FORMA DE TRATAR O CODIGO, SE DER ERRO NO TRY, PULA PARA O CATCH E 
        // COM ISSO CONTINUA A EXECUÇÃO MOSTRANDO O ERRO PARA O USUARIO.
        try{
            int[] y = new int[2];
            System.out.println(y[2]);
            System.out.println("Imprimindo depois da  possivel excecao.");

        }catch (RuntimeException e){
            e.printStackTrace();
        }    
        System.out.println("Fora do bloco catch.");
*/  
        divisao(10,0);


    }   
    private static void divisao(int num1, int num2){
        if(num2 == 0){
            throw new IllegalArgumentException("Passe um argumento diferente de 0 para num2.");
        }
        double result = num1 / num2;
        System.out.println(result);

    }

    
}
