package repository;

import model.Inscricao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscricaoRepository  extends JpaRepository<Inscricao, Long> {
}
