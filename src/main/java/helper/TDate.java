package helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TDate {

    public static boolean dataRetroativa(Date date){
        Calendar calendar = Calendar.getInstance();
        Date hoje = calendar.getTime();

        calendar.setTime( hoje );
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        hoje = calendar.getTime();
        System.out.println("Teste Retroativa VUE" + date);
        System.out.println("Teste Retroativa GERADA" + hoje);
        return hoje.after(date);
    }


    public static boolean dataTimeRetroativa(Date date){
        Calendar calendar = Calendar.getInstance();
        Date hoje = calendar.getTime();
        return hoje.after(date);
    }


    public  static  Date converteData(String data) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada = format.parse(data);
        return dataFormatada;
    }

    public  static  Date converteDataUS(String data) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date dataFormatada = format.parse(data);
        return dataFormatada;
    }

}