package exception_15.runtimeexception.teste;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultiplasRunTimeException {
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch(IllegalArgumentException e){
            System.out.println("Dentro do IllegalArgumentException");
        }catch(ArithmeticException e){
            System.out.println("Dentro do ArithmeticException");
        }
        System.out.println("Fechar programa!");

        try{
            talvezLanceException();
        }catch (SQLException e){

        }catch (FileNotFoundException e){
            
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException{

    }
}
