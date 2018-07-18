package model;

import javax.persistence.Entity;

@Entity
public class Evento {

    private String nome;
    private String descricao;

    public Evento(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }
}
