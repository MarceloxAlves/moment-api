package helper;

public class Codificador {

    public static String codificar(String codigo){
        char[] caracters = org.apache.commons.lang.StringUtils.leftPad(codigo, 4, "0").toCharArray();
        String cupom = "";
        for (int i = 0; i < caracters.length; i++){
           cupom += String.valueOf((char) ((int) caracters[i] + 20));
           cupom += String.valueOf((char) ((int) caracters[i] + 30));
       }
        return cupom;
    }

    public static Long decodificar(String codigo){
        char[] caracters = codigo.toCharArray();
        String cupom = "";
        for (int i = 0; i < caracters.length; i += 2){
            cupom += String.valueOf((char) ((int) caracters[i] - 20));
        }
        return Long.valueOf(cupom);
    }



}

