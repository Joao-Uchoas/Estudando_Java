package introducaoclasse.testes;

import introducaoclasse.classes.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {

        Estudante joao = new Estudante();
        joao.nome = "Joao";
        joao.matricula = "12120";
        joao.idade = 22;

        System.out.println(joao.nome);
        System.out.println(joao.matricula);
        System.out.println(joao.idade);
        
    }
    
}
