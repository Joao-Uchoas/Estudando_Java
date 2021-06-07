package data_18.teste;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFortmatTeste {
    public static void main(String[] args) {
        float valor = 1234567f;
        Locale locBR = new Locale("pt");
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(locBR);
        nfa[2] = NumberFormat.getCurrencyInstance();
        nfa[3] = NumberFormat.getCurrencyInstance(locBR);
        for(NumberFormat nf : nfa){
            System.out.println(nf.format(valor));
        }
    }
}
