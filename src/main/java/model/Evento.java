package model;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;



import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "evento")
@EntityListeners(AuditingEntityListener.class)
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_evento")
    private Long id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "data_inicio")
    private Date dataInicio;

    @Column(name = "data_termino")
    private Date dataTermino;

    @Transient
    private List<Atividade> atividades;

    @Transient
    private List<Tag> tags;

    @ManyToMany
    @JoinTable(name = "evento_colaborador",
            joinColumns = {@JoinColumn(
                    name ="id_evento", referencedColumnName = "id_evento")},
            inverseJoinColumns = {@JoinColumn(name = "id_colaborador", referencedColumnName = "id_colaborador")})
    private List<Colaborador> colaboradores;
    
    @Transient
    private List<Cupom> cupons;

    public Evento() {
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
	
	
    
    
}