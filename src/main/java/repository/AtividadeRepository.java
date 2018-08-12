package repository;

import model.Atividade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

public interface AtividadeRepository extends JpaRepository<Atividade, Long> {
    @Query("SELECT e FROM Evento e WHERE e.id = :id")
    Atividade findByIdEvento(@Param("id") Long id);
}
