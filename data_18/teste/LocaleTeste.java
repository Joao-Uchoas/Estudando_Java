package data_18.teste;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTeste {
    public static void main(String[] args){
        //ISO 639 pt = portugues BR - Brazil, en - ingles, US - Estados Unidos
        Locale locale = new Locale("en","US");
        Locale locale2 = new Locale("pt","BR");
        Calendar c = Calendar.getInstance();
        c.set(2015, Calendar.DECEMBER, 23);
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, locale2);
        System.out.println(df.format(c.getTime()));
        System.out.println(df1.format(c.getTime()));
    } 
}
