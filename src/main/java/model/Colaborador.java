package model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "colaborador")
@EntityListeners(AuditingEntityListener.class)
public class Colaborador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_colaborador")
    private Long id;
   
    @Column(name = "nome")
    private String nome;
    
    @Column(name = "tipo")
    private int tipo;
    
    @ManyToMany(mappedBy = "colaboradores")
    private List<Evento> eventos;

    public Colaborador(String nome, int tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

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

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}
    
    
    
    
}