package exception_15.checkedexception.teste;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import exception_15.checkedexception.classe.Leitor1;
import exception_15.checkedexception.classe.Leitor2;

public class TryWithiResourcesTeste {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo() {
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()) {
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }


    public static void lerArquivoOld() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("text.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if(reader != null)
                    reader.close();
            } catch (IOException e) {
                 e.printStackTrace();
            }
        }
    }
}
