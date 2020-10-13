package exception_15.error.teste;

public class ErrorTeste {
    public static void main(String[] args) {
        stackOverflowError();
    }
    public static void stackOverflowError(){
        stackOverflowError();
    }
}
