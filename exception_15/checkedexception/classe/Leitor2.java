package exception_15.checkedexception.classe;



public class Leitor2 implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Fechando leitor 2.");

    }
    
}