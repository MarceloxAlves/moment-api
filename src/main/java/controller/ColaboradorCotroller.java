package controller;

import model.Colaborador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import repository.ColaboradorRepository;

import javax.validation.Valid;
import java.util.List;

public class ColaboradorCotroller {

    @Autowired
    ColaboradorRepository colaboradorRepository;

    @GetMapping("/listar")
    public List<Colaborador> getAllEventos() {
        return colaboradorRepository.findAll();
    }

    @GetMapping("/count")
    public long getTotal() {
        return colaboradorRepository.count();
    }

    @PostMapping(path = "/cadastrar",  consumes = "application/json", produces = "application/json")
    public Colaborador cadastrarUsuario(@Valid @RequestBody Colaborador usuario) {
        return colaboradorRepository.save(usuario);
    }
}
