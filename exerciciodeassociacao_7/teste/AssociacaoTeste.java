package exerciciodeassociacao_7.teste;

import exerciciodeassociacao_7.classe.Aluno;
import exerciciodeassociacao_7.classe.Local;
import exerciciodeassociacao_7.classe.Professor;
import exerciciodeassociacao_7.classe.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Joao", 22);
        Aluno aluno2 = new Aluno("Lima", 20);
        Seminario seminario = new Seminario("Como ser um baita Programador");
        Professor professor = new Professor("Carlos", "Programador");
        Local local = new Local("Rua da vida", "Vidalva");



        aluno1.setSeminario(seminario);
        aluno2.setSeminario(seminario);
        
        seminario.setProfessor(professor);
        seminario.setLocal(local);
        seminario.setAluno(new Aluno[]{aluno1, aluno2});
      
        professor.setSeminario(new Seminario[] {seminario});

        seminario.imprime();
        professor.imprime();
        

    }
}
