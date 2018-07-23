package model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "inscricao")
@EntityListeners(AuditingEntityListener.class)
public class Inscricao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inscricao")
    private Long id;

    @OneToOne
    @JoinColumn(name = "usuario", referencedColumnName = "id_usuario")
    private Usuario usuario;

    @Column(name = "valor_total")
    private double valorTotal;

    @Column(name = "status_inscricao")
    private StatusInscricao statusInscricao;

    @Column(name = "data_pagamento")
    private Date dataPagamento;

    @ManyToMany
    @JoinTable(name = "item_inscricao",
    joinColumns = {@JoinColumn(
            name ="inscricao", referencedColumnName = "id_inscricao")},
    inverseJoinColumns = {@JoinColumn(name = "atividade", referencedColumnName = "id_atividade")})
    private List<Atividade> atividades;
    
    @Column(name = "desconto")
    private double desconto;

    public Inscricao(Usuario usuario, double valorTotal, StatusInscricao statusInscricao, Date dataPagamento, List<Atividade> atividades) {
        this.usuario = usuario;
        this.valorTotal = valorTotal;
        this.statusInscricao = statusInscricao;
        this.dataPagamento = dataPagamento;
        this.atividades = atividades;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public StatusInscricao getStatusInscricao() {
		return statusInscricao;
	}

	public void setStatusInscricao(StatusInscricao statusInscricao) {
		this.statusInscricao = statusInscricao;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public List<Atividade> getAtividades() {
		return atividades;
	}

	public void setAtividades(List<Atividade> atividades) {
		this.atividades = atividades;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
    
    
    
    
}