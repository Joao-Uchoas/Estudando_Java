package sobrecargaconstrutores_4.classe;

public class Estudantes {
    private String matricula;
    private String nome;
    private double[] notas;
    private String dataMatricula;


    public Estudantes(String matricula, String nome, double[] notas){
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }
    public Estudantes(String matricula, String nome, double[] notas, String dataMatricula){
        this(matricula,nome,notas);
        this.dataMatricula = dataMatricula;
    }
    public Estudantes(){

    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.matricula);
        for(double nota:notas){
            System.out.println(nota + " ");
        }
        
    }


    public String getMatricula() {
        return matricula;
    }
    public String getNome() {
        return nome;
    }
    public double[] getNotas() {
        return notas;
    } 
    public String getDataMatricula() {
        return dataMatricula;
    }


    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }



}
