package model;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Cupom {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "codigo")
    private String codigo;

    @JoinColumn(name = "evento_id", referencedColumnName = "id_eveneto")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Evento evento;

    @Column(name = "desconto")
    private float desconto;

    @Column(name = "dataValidade")
    private Date dataValidade;

    public Cupom(String descricao, Evento evento, float desconto) {
        this.descricao = descricao;
        this.evento = evento;
        this.desconto = desconto;
        this.dataValidade = evento.getDataTermino();
    }
}