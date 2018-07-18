package model;

import javax.persistence.Entity;
import java.util.Date;

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
    }

}