package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Inscricao {
    private Usuario usuario;
    private double valorTotal;
    private StatusInscricao statusInscricao;
    private Date dataPagamento;
    private List<Atividade> atividades = new ArrayList<>();
    private double desconto;

    public Inscricao(Usuario usuario, double valorTotal, StatusInscricao statusInscricao, Date dataPagamento, List<Atividade> atividades) {
        this.usuario = usuario;
        this.valorTotal = valorTotal;
        this.statusInscricao = statusInscricao;
        this.dataPagamento = dataPagamento;
        this.atividades = atividades;
    }
}
