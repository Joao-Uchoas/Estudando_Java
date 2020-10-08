package introducaometodos_2.teste;

import introducaometodos_2.classes.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor professor1 = new Professor();
        Professor professor2 = new Professor();

        professor1.nome = "Joao";
        professor1.matricula = "12344";
        professor1.rg = "123456789123";
        professor1.cpf = "45678912345";

        professor2.nome = "Maria";
        professor2.matricula = "365481";
        professor2.rg = "78945632145";
        professor2.cpf = "78245516325";


        professor1.imprime();
        professor2.imprime();



    }
    

}
