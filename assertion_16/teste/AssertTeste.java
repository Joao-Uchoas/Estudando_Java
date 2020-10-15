package assertion_16.teste;

public class AssertTeste {
    public static void main(String[] args) {
        diaDaSemana(9);
    }
    private static void calculaSalario(double salario){
        /*if(salario > 0){
            // fazer calculo com salario.
        }else{
            System.out.println("Se chegou aqui, ferro...");
        }*/

        assert(salario > 0) : "O salario não deve ser menor que zero.";
        //calculo do salario
    }
    public static void diaDaSemana(int dia){
        switch(dia){
            case 1: break;
            case 2: break;
            case 3: break;
            case 4: break;
            case 5: break;
            case 6: break;
            case 7: break;
            default: assert false;
        }
            
    }

}
