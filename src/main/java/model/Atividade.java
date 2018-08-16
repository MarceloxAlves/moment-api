package model;

import com.fasterxml.jackson.annotation.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "atividade")
@EntityListeners(AuditingEntityListener.class)
@JsonIdentityInfo(
		generator = ObjectIdGenerators.PropertyGenerator.class,
		property = "id")
public class Atividade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_atividade")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "inicio")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime inicio;

	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @Column(name = "termino")
    private LocalDateTime termino;

    @Column(name = "valor")
    private double valor;

    @OneToOne
	@JoinColumn(name = "tipo_atividade_id")
    private TipoAtividade tipoAtividade;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_evento")
	@JsonBackReference
	private Evento evento;

    public Atividade(){}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDateTime getInicio() {
		return inicio;
	}

	public void setInicio(LocalDateTime inicio) {
		this.inicio = inicio;
	}

	public LocalDateTime getTermino() {
		return termino;
	}

	public void setTermino(LocalDateTime termino) {
		this.termino = termino;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public TipoAtividade getTipoAtividade() {
		return tipoAtividade;
	}

	public void setTipoAtividade(TipoAtividade tipoAtividade) {
		this.tipoAtividade = tipoAtividade;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}
}
