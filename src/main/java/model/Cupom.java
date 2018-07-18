package model;

import javax.persistence.Entity;
import java.util.Date;
import java.util.Random;

@Entity
public class Cupom {

    private String descricao;
    private String codigo;
    private Evento evento;
    private float desconto;
    private Date dataValidade;

    public Cupom(String descricao, Evento evento, float desconto) {
        this.descricao = descricao;
        this.evento = evento;
        this.desconto = desconto;
        this.dataValidade = evento.getDataTermino();
    }

    public void gerarCodigoCupom(){
        Random random = new Random();
        String palavra = new String();
        char letras[] = {'a','e','i','o','u','b','c','d','f','g','h'};
        for (int i = 0; i <6; i++){
            palavra += letras[random.nextInt(letras.length - 1)];
        }

        codigo = palavra;
    }

}