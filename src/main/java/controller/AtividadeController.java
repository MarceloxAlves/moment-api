package controller;

import model.Atividade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @Autowired
    AtividadeRepository atividadeRepository;

    @GetMapping("/listar")
    public List<Atividade> getAllAtividades() {
        return atividadeService.findAll();
    }

    @GetMapping("/cadastrar")
    public Atividade criarAtividade(@Valid @RequestBody Atividade atividade){
        return atividadeRepository.save(atividade);
    }
    
    @GetMapping("buscar-atividade/{id}")
    public Optional<Atividade> buscarAtividade(@PathVariable Long id) {
    	Optional<Atividade> atividadeEncontrada = atividadeRepository.findById(id);
    	return atividadeEncontrada;
    }
    
}
