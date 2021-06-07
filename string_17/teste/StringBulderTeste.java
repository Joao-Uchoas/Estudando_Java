package string_17.teste;

public class StringBulderTeste {
    public static void main(String[] args) {
        String s = "Uma frase comum";
        StringBuilder saber = new StringBuilder(10000);
        StringBuilder saber2 = new StringBuilder(10000); 
        saber.append("Carlos>").append("Maria>").append("José>").append("Renata");
        saber2.append("Caralina>").append("Jualina>").append("Maria>").append("Joana");
        //pode usar varios append para concatenar como um append para concatenar.
        System.out.println(saber.reverse());
        // Serve para inverter a strind inteira.CUIDADO ELE MODIFICA A STRING FAZENDO ELA FICAR AO CONTRARIO
        // E PARA VOLTAR A STRING AO NORMAL USAR .REVERSE DNV
        System.out.println(saber2.reverse());
        System.out.println(saber.reverse());
        System.out.println(saber2.reverse());


        System.out.println(saber.delete(0, 6));
        // .delete serve para deletar uma quantidade caracter que vai de n até n -> (só que na verdade vai de n-1)
        // CUIDADE ELE ALTERA O VALOR DA SUA STRING
        System.out.println(saber);


        System.out.println(saber.insert(0, "AS PESSOAS SÃO: "));
        // .insert serve para adicionar uma string ou um char e começa de n-1 até sua string acabar e dps contia com a string original.
        // CUIDADE ELE ALTERA O VALOR DA SUA STRING
    }
}
