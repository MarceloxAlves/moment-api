package model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "atividade")
@EntityListeners(AuditingEntityListener.class)
public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_atividade")
    private long id_atividade;

    @Column(name = "nome")
    private String nome;

    @Column(name = "inicio")
    private Date inicio;

    @Column(name = "termino")
    private Date termino;

    @Column(name = "valor")
    private double valor;

    @Column(name = "tipo_atividade")
    private TipoAtividade tipoAtividade;

    public Atividade(String nome, Date inicio, Date termino, double valor, TipoAtividade tipoAtividade) {
        this.nome = nome;
        this.inicio = inicio;
        this.termino = termino;
        this.valor = valor;
        this.tipoAtividade = tipoAtividade;
    }


}
