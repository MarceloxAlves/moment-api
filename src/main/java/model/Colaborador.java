package model;

import org.hibernate.mapping.Collection;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "colaborador")
@EntityListeners(AuditingEntityListener.class)
public class Colaborador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_colaborador")
    private long id_colaborador;

    @Column(name = "nome")
    private String nome;
    @Column(name = "tipo")
    private int tipo;
    @ManyToMany(mappedBy = "colaboradores")
    private java.util.Collection<Evento> eventos;

    public Colaborador(String nome, int tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }
}