package exerciciodeassociacao_7.classe;

public class Local {
    private String rua;
    private String bairro;

    public Local(){

    }
    public Local(String rua, String bairro) {
        this.rua = rua;
        this.bairro = bairro;
    }

    public void imprime(){
        System.out.println("--------------------Relatório do Local--------------------");
        System.out.println("Rua" + this.rua);
        System.out.println("Bairro" + this.bairro);
    }

    
    public String getRua() {
        return rua;
    }
    public String getBairro() {
        return bairro;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    
}
