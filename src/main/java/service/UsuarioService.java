package service;

import model.Login;
import model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UsuarioRepository;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> findAll() {
        return  usuarioRepository.findAll();
    }

    public long count() {
        return  usuarioRepository.count();
    }

    public Usuario criarUsuario(Usuario usuario) {
       return usuarioRepository.save(usuario);
    }


    public Usuario Login(Login login){
        return  usuarioRepository.findByEmailPassword(login.getEmail(), login.getPassword());
    }
}
