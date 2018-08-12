package controller;

import model.Atividade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.AtividadeRepository;
import service.AtividadeService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/atividade")
public class AtividadeController {

    @Autowired
    AtividadeService atividadeService;

    @Autowired
    AtividadeRepository atividadeRepository;

    @GetMapping("/listar")
    public List<Atividade> getAllAtividades() {
        return atividadeService.findAll();
    }

    @GetMapping("/cadastrar")
    public Atividade criarCupom(@Valid @RequestBody Atividade atividade){
        return atividadeRepository.save(atividade);
    }
}
