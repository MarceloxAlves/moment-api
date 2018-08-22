package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "tag")
@EntityListeners(AuditingEntityListener.class)
public class Tag {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_tag")
	private Long id; 
	
	private String descricao;
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "tags")
	private List<Evento> eventos;
	
	public Tag() {
		
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
	
	
}