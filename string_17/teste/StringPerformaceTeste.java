package string_17.teste;

public class StringPerformaceTeste {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(30000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto String " + (fim - inicio) + " ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(100000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuilder " + (fim - inicio) + " ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(100000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuffer " + (fim - inicio) + " ms");
         
    }

    private static void concatString(int tam){
        String string = "";
        for(int x = 0; x < tam; x++){
            string += x;
        }
    }
    private static void concatStringBuilder(int tam){
        StringBuilder st = new StringBuilder(tam);
        for(int x = 0; x < tam; x++){
            st.append(x);
        }
    }
    private static void concatStringBuffer(int tam){
        StringBuffer st = new StringBuffer(tam);
        for(int x = 0; x < tam; x++){
            st.append(x);
        }
    }
}
