package model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Table(name = "usuario")
@JsonIdentityInfo(
		scope = Usuario.class,
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public class Usuario implements Serializable {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_usuario")
	private Long id;
  
	@Column(name = "nome")
    private String nome;

   @Column(name = "email")
   @Email
   private String email;

   @Column(name = "password")
   @JsonProperty(access = Access.WRITE_ONLY)
   private String password;

   @OneToMany(mappedBy = "usuario", targetEntity = Evento.class)
   @JsonManagedReference
   private List<Evento> eventos;
    
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


    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Evento> getEventos() {
        return eventos;
    }
}


