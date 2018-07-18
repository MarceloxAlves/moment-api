package model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "evento")
@EntityListeners(AuditingEntityListener.class)
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "dada_inicio")
    private Date dataInicio;

    @Column(name = "dada_termino")
    private Date dataTermino;

    @OneToMany(mappedBy = "evento")
    private List<Atividade> atividades;

    @OneToMany(mappedBy = "evento")
    private List<Tag> tags;

    @JoinTable(name = "colaborador",
            joinColumns = {@JoinColumn(
                    name ="evento_id", referencedColumnName = "id")},
                    inverseJoinColumns = {@JoinColumn(name = "colaborador_id", referencedColumnName = "id_colaborador")})
    private Collection<Colaborador> colaboradores;

    public Evento() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
