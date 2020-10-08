package introducaoclasse_1.testes;

import introducaoclasse_1.classes.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor professor = new Professor();
        Professor professor2 = new Professor();


        professor.nome = "Joao";
        professor.matricula = "1232";
        professor.rg = "5454";
        professor.cpf = "195191A";

        professor2.nome = "Vitor";
        professor2.matricula = "1233";
        professor2.rg = "5454";
        professor2.cpf = "195191A";

        System.out.println(professor.nome);
        System.out.println(professor.matricula);
        System.out.println(professor.rg);
        System.out.println(professor.cpf);
        System.out.println("-----------------------------------------");
        System.out.println(professor2.nome);
        System.out.println(professor2.matricula);
        System.out.println(professor2.rg);
        System.out.println(professor2.cpf);

    }

}