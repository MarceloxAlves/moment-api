package model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.Date;



@Entity
@Table(name = "cupom")
@JsonIdentityInfo(
		generator = ObjectIdGenerators.PropertyGenerator.class,
		property = "id")
public class Cupom implements Serializable {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_cupom")
    private Long id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "codigo")
    private String codigo;

    @ManyToOne()
    @JoinColumn(name = "id_evento")
	@JsonBackReference
    private Evento evento;

    @Column(name = "desconto")
    private float desconto;

    @Column(name = "data_validade")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dataValidade;

    public Cupom() {
    	
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public float getDesconto() {
		return desconto;
	}

	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}


}