package model;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Atividade {
    private String nome;
    private Date inicio;
    private Date termino;
    private double valor;
    private TipoAtividade tipoAtividade;

    public Atividade(String nome, Date inicio, Date termino, double valor, TipoAtividade tipoAtividade) {
        this.nome = nome;
        this.inicio = inicio;
        this.termino = termino;
        this.valor = valor;
        this.tipoAtividade = tipoAtividade;
    }


}
