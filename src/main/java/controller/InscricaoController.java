package controller;


import model.Inscricao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.InscricaoRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/inscricao")
@CrossOrigin(origins = "*")
public class InscricaoController {

    @Autowired
    InscricaoRepository inscricaoRepository;

    @GetMapping("/listar")
    public List<Inscricao> getAllEventos() {
        return inscricaoRepository.findAll();
    }

    @GetMapping("/count")
    public long getTotal() {
        return inscricaoRepository.count();
    }

    @PostMapping(path = "/cadastrar",  consumes = "application/json", produces = "application/json")
    public Inscricao cadastrarInscricao(@Valid @RequestBody Inscricao inscricao) {
        return inscricaoRepository.save(inscricao);
    }




}
