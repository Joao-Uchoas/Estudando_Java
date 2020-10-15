package exception_15.customexception;

public class LoginInvalidoException extends Exception{
    public LoginInvalidoException(){
        super("Usuario ou senha invalidos!");
    }
}
