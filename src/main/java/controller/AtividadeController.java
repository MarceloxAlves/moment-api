package controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import helper.ResultData;
import model.Atividade;
import model.TipoAtividade;
import model.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.AtividadeRepository;
import service.AtividadeService;
import validator.AtividadeValidator;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/atividade")
public class AtividadeController {

    @Autowired
    AtividadeService atividadeService;

    @Autowired
    AtividadeValidator atividadeValidator;

    @GetMapping(value = "/listar", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Atividade> getAllAtividades() {
        return atividadeService.findAll();
    }

    @GetMapping("/listar-tipos")
    public List<TipoAtividade> listarTipoAtividade() {
        return atividadeService.listarTipoAtividade();
    }
    
    @DeleteMapping("/delete/{id}")
    public ResultData deletarAtividade(@PathVariable Long id ) {
        ResultData resultData = new ResultData();
        try{
            Atividade atividade = atividadeService.obterAtividade(id);
            if (atividade != null ) {
            	atividadeService.delete(id);
            }
          resultData.setMessage("Atividade deletada com sucesso!" );

        }catch (Exception ex){
            resultData.error();
            resultData.setMessage("Erro ao deletar a atividade de codigo " + id);
        }

        return resultData;
    }

    @PostMapping(path = "/cadastrar", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultData criarAtividade(@Valid @RequestBody Atividade atividade, BindingResult bindingResult) {
        ResultData resultData = new ResultData();
        atividadeValidator.validate(atividade, bindingResult);
        if(bindingResult.hasErrors()){
            resultData.error();
            resultData.setField("erros", bindingResult.getAllErrors());
            return resultData;
        }
        atividadeService.criarAtividade(atividade);

        return resultData;
    }
    
    @GetMapping("buscar-atividade/{id}")
    public ResultData buscarAtividade(@PathVariable Long id) {
        ResultData resultData = new ResultData();
    	Optional<Atividade> atividadeEncontrada = atividadeService.getAtividade(id);
    	resultData.setField("atividade", atividadeEncontrada);
    	return resultData;
    }
    
}
