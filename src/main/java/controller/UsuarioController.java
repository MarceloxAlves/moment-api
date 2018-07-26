package controller;

import model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.UsuarioRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "*")
public class UsuarioController {
	
    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping("/listar")
    public List<Usuario> getAllEventos() {
        return usuarioRepository.findAll();
    }

    @GetMapping("/count")
    public long getTotal() {
        return usuarioRepository.count();
    }

    @PostMapping(path = "/cadastrar",  consumes = "application/json", produces = "application/json")
    public Usuario cadastrarUsuario(@Valid @RequestBody Usuario usuario) {
          return usuarioRepository.save(usuario);
    }
}
