package introducaometodos.teste;

import introducaometodos.classes.*;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.setNome("Silva"); 
        estudante.setIdade(19);
        estudante.setNotas(new double[] {6,7,8});
        estudante.imprimirDados();
        estudante.tirarMedias();
    }
    
}
