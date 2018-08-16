package repository;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import model.Tag;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long>{
	
	@Query("SELECT t FROM Tag t WHERE t.descricao = :descricao")
	Tag findByName(@Param("descricao") String descricao);
}
