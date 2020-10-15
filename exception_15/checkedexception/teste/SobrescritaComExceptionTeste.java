package exception_15.checkedexception.teste;

import java.io.FileNotFoundException;

import exception_15.checkedexception.classe.Funcionario;
import exception_15.checkedexception.classe.Pessoa;
import exception_15.customexception.LoginInvalidoException;

public class SobrescritaComExceptionTeste {
    public static void main(String[] args) throws FileNotFoundException, LoginInvalidoException {
        Funcionario f = new Funcionario();
        Pessoa p = new Pessoa();
        p.salvar();
    }
}
