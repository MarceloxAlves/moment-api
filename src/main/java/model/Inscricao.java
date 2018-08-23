package model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "inscricao")
@EntityListeners(AuditingEntityListener.class)
@JsonIdentityInfo(
		scope = Inscricao.class,
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public class Inscricao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_inscricao")
    private Long id;

    @OneToOne
    @JoinColumn(name = "participante", referencedColumnName = "id_usuario")
    @JsonBackReference
    private Usuario usuario;
    
    @ManyToOne
    @JoinColumn(name = "id_evento",  referencedColumnName = "id_evento")
    private Evento evento;
    
    @Column(name = "valor_total")
    @JsonProperty(access = Access.READ_ONLY)
    private double valorTotal;

    @Column(name = "status_inscricao")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @Enumerated(EnumType.STRING)
    @JsonProperty(access = Access.READ_ONLY)
    private StatusInscricao statusInscricao;

    @Column(name = "data_pagamento")
    @JsonFormat(pattern="yyyy-MM-dd")
    @JsonProperty(access = Access.READ_ONLY)
    private Date dataPagamento;

    @ManyToMany
    @JoinTable(name = "item_inscricao",
    joinColumns = {@JoinColumn( name ="inscricao", referencedColumnName = "id_inscricao")},
    inverseJoinColumns = {@JoinColumn(name = "atividade", referencedColumnName = "id_atividade")})
    private List<Atividade> atividades;
    
    @Column(name = "desconto")
    private double desconto;

    public Inscricao() {
    	
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

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}
    
    
    
    
}
