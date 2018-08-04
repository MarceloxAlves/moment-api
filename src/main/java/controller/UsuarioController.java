package controller;

import model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import repository.UsuarioRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping("/")
    public void index(){
        getTotal();
    }

    @GetMapping("/listar")
    public List<Usuario> getAllEventos() {
        return usuarioRepository.findAll();
    }

    @GetMapping("/count")
    public long getTotal() {
        return usuarioRepository.count();
    }

    @PostMapping(path = "/cadastrar",  consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = "application/json")
    public Usuario cadastrarUsuario(@Valid @RequestBody Usuario usuario) {
        System.out.println(usuario.getEmail());
        return usuarioRepository.save(usuario);
    }
}
