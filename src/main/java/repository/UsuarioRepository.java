package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query("SELECT u.email, u.nome FROM Usuario u WHERE u.email = :email and u.password =  :password")
    Object logar(@Param("email") String email, @Param("password") String password);

    Usuario findByEmail(String email);
}
