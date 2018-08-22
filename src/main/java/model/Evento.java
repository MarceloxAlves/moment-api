package model;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import service.interfaces.EstadoEvento;
import service.states.FabricaEstadoEvento;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "evento")
@EntityListeners(AuditingEntityListener.class)
@JsonIdentityInfo(
		scope = Evento.class,
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public class Evento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_evento")
    private Long id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "data_inicio")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="GMT")
    private Date dataInicio;

    @Column(name = "data_termino")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="GMT")
    private Date dataTermino;

    @Column(name = "estado_evento")
    private String estadoEvento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    @JsonBackReference
    private Usuario usuario;

    @OneToMany(mappedBy = "evento", targetEntity = Atividade.class)
    @JsonManagedReference
    private List<Atividade> atividades;

    @ManyToMany
    @JoinTable(name = "tag_evento",
            joinColumns = {@JoinColumn(
                    name ="id_evento", referencedColumnName = "id_evento")},
            inverseJoinColumns = {@JoinColumn(name = "id_tag", referencedColumnName = "id_tag")})
    private List<Tag> tags;

    @ManyToMany
    @JoinTable(name = "evento_colaborador",
            joinColumns = {@JoinColumn(
                    name ="id_evento", referencedColumnName = "id_evento")},
            inverseJoinColumns = {@JoinColumn(name = "id_colaborador", referencedColumnName = "id_colaborador")})
    private List<Colaborador> colaboradores;

    @OneToMany(mappedBy = "evento", targetEntity = Cupom.class)
    @JsonManagedReference
    private List<Cupom> cupons;

    public Evento() {
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

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(List<Atividade> atividades) {
        this.atividades = atividades;
    }

    public List<Colaborador> getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(List<Colaborador> colaboradores) {
        this.colaboradores = colaboradores;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<Cupom> getCupons() {
        return cupons;
    }

    public void setCupons(List<Cupom> cupons) {
        this.cupons = cupons;
    }


    public EstadoEvento getEstadoEvento() {
        return new FabricaEstadoEvento().getEstado(this.estadoEvento);
    }

    public void setEstadoEvento(EstadoEvento estadoEvento) {
        this.estadoEvento = estadoEvento.getEstado();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}