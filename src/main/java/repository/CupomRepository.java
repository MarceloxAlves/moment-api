package repository;

import model.Cupom;
import model.Inscricao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CupomRepository extends JpaRepository<Cupom, Long> {
	
	 @Query("select c from Cupom c JOIN c.evento where c.evento.id = :id")
		List<Cupom> cuponsEvento(@Param("id") Long id);
}
