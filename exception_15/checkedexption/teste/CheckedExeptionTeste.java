package exception_15.checkedexption.teste;

import java.io.File;
import java.io.IOException;

public class CheckedExeptionTeste {
    public static void main(String[] args) {
        try{
            criarArquivo();
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
    public static void criarArquivo() throws IOException{
        File file = new File("Teste.txt");

        try{
            System.out.println("Arquivo criado? " + file.createNewFile());
            System.out.println("Arquivo Criado");
        }catch(IOException e){
            e.printStackTrace();throw e;
        }


    }
      public static void abrirArquivo(){
        
        try{
            System.out.println("Abrindo um arquivo.");
            System.out.println("Executando a leitura do arquivo.");
            System.out.println("Escrevendo no arquivo.");
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Fechando o arquivo.");
        }
      }  
     
}