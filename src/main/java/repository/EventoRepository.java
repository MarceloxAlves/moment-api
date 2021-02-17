package repository;

import model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {
    @Query("SELECT e FROM Evento e WHERE e.id = :id")
    Evento findByIdEvento(@Param("id") Long id);
}
