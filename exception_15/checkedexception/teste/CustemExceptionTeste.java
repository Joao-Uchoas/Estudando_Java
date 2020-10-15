package exception_15.checkedexception.teste;

import exception_15.customexception.LoginInvalidoException;

public class CustemExceptionTeste {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
    public static void logar() throws LoginInvalidoException{
        String usuarioBancoDeDados = "Goku";
        String senhaBancoDeDados = "1111";
        String usuarioDigitado = "Goku";
        String senhaDigitada = "1211";
        if(!usuarioBancoDeDados.equals(usuarioDigitado) || !senhaBancoDeDados.equals(senhaDigitada) ){
            throw new LoginInvalidoException();
        }else{
            System.out.println("Logado");
        }


    }
}
