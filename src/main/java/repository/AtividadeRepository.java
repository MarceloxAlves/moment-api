package repository;

import model.Atividade;
import model.Cupom;
import model.Evento;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AtividadeRepository extends JpaRepository<Atividade, Long> {
   
	 @Query("SELECT a FROM Atividade a WHERE a.id = :id")
	 Atividade findByIdAtividade(@Param("id") Long id);
	 
	 @Query("select a from Atividade a JOIN a.evento where a.evento.id = :id")
	 List<Atividade> atividadesEvento(@Param("id") Long id);
}
