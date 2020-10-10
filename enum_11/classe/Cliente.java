package enum_11.classe;

public class Cliente {
    private String nome;
    private TipoCliente tipoCliente;


    @Override
    public String toString() {
        return "Nome=" + nome + ", tipo= " + tipoCliente + ", Numero: " + tipoCliente.getTipoCliente() + " " +tipoCliente.getNomeCliente();
    }

    public Cliente(){

    }
    public Cliente(String nome, TipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

//  class get...
    public String getNome() {
        return nome;
    }
    public TipoCliente getTipo() {
        return tipoCliente;
    }
//  class set...
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTipo(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    

    

    

}
