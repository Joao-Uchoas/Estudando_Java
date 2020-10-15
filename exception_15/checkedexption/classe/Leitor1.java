package exception_15.checkedexption.classe;

public class Leitor1 implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Fechando leitor 1.");
    }
    
}
