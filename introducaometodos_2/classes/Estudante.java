package introducaometodos_2.classes;

public class Estudante {
    
    private String nome;
    private int idade;
    private double[] notas;


    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setNotas(double[] notas){
        this.notas = notas;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public double[] getNotas(){
        return this.notas;
    }


    public void imprimirDados(){
        
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if(notas != null)
            for(double nota : notas){
                System.out.print(nota + "\t");
            }
    }

    public void tirarMedias(){
        if(notas == null){
            System.out.println("Esse aluno não tem notas");
            return;
        }
            
        double media = 0;
        for(double nota : notas){
            media += nota;
        }
        media /= notas.length;

        if(media > 6)
            System.out.println("\nAluno aprovado!");
        else   
            System.out.println("\nAluno reprovado!");


    }

}
