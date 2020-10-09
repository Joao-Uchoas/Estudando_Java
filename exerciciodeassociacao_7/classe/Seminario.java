package exerciciodeassociacao_7.classe;

public class Seminario {
    private Aluno[] aluno;
    private Professor professor;
    private Local local;
    private String titulo;
    
    public Seminario() {
    }
    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public void imprime(){
        System.out.println("--------------------Relatório do Seminário--------------------");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Professor palestrante: " + this.professor.getNome());
        System.out.println("Local: " + this.local.getRua() + ", Bairro " + this.local.getBairro());
        for(Aluno aluninho : aluno)
            System.out.println("Aluno palestrante: " + aluninho.getNome());
    }

    
    public Aluno[] getAluno() {
        return aluno;
    }
    public Professor getProfessor() {
        return professor;
    }
    public Local getLocal() {
        return local;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    } 
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public void setLocal(Local local) {
        this.local = local;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    

    
    
}
