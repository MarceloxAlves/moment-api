package controller;

import model.Atividade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.AtividadeRepository;
import service.AtividadeService;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/atividade")
public class AtividadeController {

    @Autowired
    AtividadeService atividadeService;

    @GetMapping("/listar")
    public List<Atividade> getAllAtividades() {
        return atividadeService.findAll();
    }

    @PostMapping(path = "/cadastrar", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = "application/json")
    public Atividade criarAtividade(@Valid @RequestBody Atividade atividade){
        return atividadeService.criarAtividade(atividade);
    }
    
    @GetMapping("buscar-atividade/{id}")
    public Optional<Atividade> buscarAtividade(@PathVariable Long id) {
    	Optional<Atividade> atividadeEncontrada = atividadeService.getAtividade(id);
    	return atividadeEncontrada;
    }
    
}
