package model;

import javax.persistence.*;

import java.util.Date;



@Entity
@Table(name = "cupom")
public class Cupom {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cupom")
    private Long id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "codigo")
    private String codigo;

    @ManyToOne()
    @JoinColumn(name = "id_evento", referencedColumnName = "id_evento")
    private Evento evento;

    @Column(name = "desconto")
    private float desconto;

    @Column(name = "data_validade")
    private Date dataValidade;

    public Cupom(String descricao, Evento evento, float desconto) {
        this.descricao = descricao;
        this.evento = evento;
        this.desconto = desconto;
        this.dataValidade = evento.getDataTermino();
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
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