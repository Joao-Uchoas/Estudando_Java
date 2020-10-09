package exerciciodeassociacao_7.classe;

public class Professor {
    private Seminario[] seminario;
    private String nome;
    private String especialidade;

    public Professor(){
        
    }
    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void imprime(){
        System.out.println("--------------------Relatório do Professor--------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if(seminario != null && seminario.length != 0){
            System.out.println("Seminarios participantes:");
            for(Seminario sem : seminario)
                System.out.print(sem.getTitulo() + " ");
            return;
        }
            System.out.println("Não tem nenhum seminário!");
        
        
    }


    public Seminario[] getSeminario() {
        return seminario;
    }
    public String getNome() {
        return nome;
    }
    public String getEspecialidade() {
        return especialidade;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    
    
    
}
