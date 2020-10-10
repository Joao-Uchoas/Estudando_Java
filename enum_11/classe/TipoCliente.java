package enum_11.classe;

public enum TipoCliente {
//  constant specific class body
    PESSOA_FISICA(1, "Pessoa Fisica"), PESSOA_JURIDICA(2, "Pessoa Juridica"){
        public String getId(){
            return "B";
        }
    };
    private int tipo;
    private String nome;
    TipoCliente(int tipo, String nome){
        this.tipo = tipo;
        this.nome = nome;
    }
    
    public String getId(){
        return "A";
    }

//  class get...    
    public int getTipoCliente(){
        return tipo;
    }
    public String getNomeCliente(){
        return nome;
    }
}
