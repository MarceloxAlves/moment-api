package model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "inscricao")
@EntityListeners(AuditingEntityListener.class)
public class Inscricao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inscricao")
    private long id_inscricao;

    @JoinColumn(name = "usuario_id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Usuario usuario;

    @Column(name = "valor_total")
    private double valorTotal;

    @Column(name = "status_inscricao")
    private StatusInscricao statusInscricao;

    @Column(name = "data_pagamento")
    private Date dataPagamento;

    @OneToMany(mappedBy = "inscricao")
    private Collection<Atividade> atividades;

    @Column(name = "desconto")
    private double desconto;

    public Inscricao(Usuario usuario, double valorTotal, StatusInscricao statusInscricao, Date dataPagamento, List<Atividade> atividades) {
        this.usuario = usuario;
        this.valorTotal = valorTotal;
        this.statusInscricao = statusInscricao;
        this.dataPagamento = dataPagamento;
        this.atividades = atividades;
    }
}
