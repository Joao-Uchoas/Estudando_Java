package data_18.teste;

import java.util.Calendar;
import java.util.Date;



public class ManupulacaoDeDataTeste {
    public static void main(String[] args) {
        Date date = new Date();
        date.setTime(date.getTime());// Seu eu quiser aumentar uma hora é só colocar na frente do "getTime()" + 3_600_000 que ai acrecentaria uma hora...
        
        System.out.println(date);

        Calendar c = Calendar.getInstance();
        c.setTime(date);
        if(Calendar.SUNDAY == c.getFirstDayOfWeek()){
             System.out.println("Domingo é o primeiro dia da semana!!!");
        }
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        c.add(Calendar.HOUR, 24);// Se eu quiser aumetar um(a) dia, hora, mes ... é só colocar .add(Calendar.(oque voce quer acrecentar ou diminuir ex(hora, dia, mes, ano...), no caso quero aumentar o dia então colocar HOUR),e aqui e quantidade);
        c.roll(Calendar.HOUR, 24);// É a mesma coisa que o add, mas tem uma diferença que é : não muda o dia, mes, ano... ex(se quiser alterar a hora mas n queres correr o risco de mudar o dia, use o roll porque ele muda a hora sem afetar o dia !!)
        Date data2 = c.getTime();// criei essa variavel para mostrar as informações mais claras... mas n precisava, era só colocar no sysout(c.getTime());
        System.out.println(data2);


    }
}
