package repository;

import model.Atividade;
import model.Evento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AtividadeRepository extends JpaRepository<Atividade, Long> {
   
	 @Query("SELECT a FROM Atividade a WHERE a.id = :id")
	 Atividade findByIdAtividade(@Param("id") Long id);
}
