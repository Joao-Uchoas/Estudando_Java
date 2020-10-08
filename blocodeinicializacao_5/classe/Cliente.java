package blocodeinicializacao_5.classe;

public class Cliente {
    private int[] parcelas;
    {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicializacao");
        for(int x = 1; x<=100;x++){
            parcelas[x-1] = x;
        }
    }

    public Cliente(){
        System.out.println("Dentro do Construtor");
        for(int parcela : this.parcelas){
            System.out.print(parcela + " ");


        }
    }


    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }

    
    


}
