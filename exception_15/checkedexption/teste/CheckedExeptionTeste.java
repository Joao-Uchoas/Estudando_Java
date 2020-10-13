package exception_15.checkedexption.teste;

import java.io.File;
import java.io.IOException;

public class CheckedExeptionTeste {
    public static void main(String[] args) {
        criarArquivo();
    }
    public static void criarArquivo(){
        File file = new File("Teste.txt");

        try{
            System.out.println("Arquivo criado? " + file.createNewFile());
            System.out.println("Arquivo Criado");
        }catch(IOException e){
            e.printStackTrace();
        }

        
    } 
}
