package repository;

import model.Colaborador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColaboradorRepository  extends JpaRepository<Colaborador, Long> {
}
