package controller;

import model.Cupom;

import model.Evento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import helper.ResultData;
import repository.CupomRepository;
import repository.EventoRepository;
import service.CupomService;
import validator.AtividadeValidator;
import validator.CupomValidator;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/cupom")
public class CupomController {
    
	@Autowired
	CupomService cupomService;
	
    @Autowired
    CupomValidator cupomValidator;

    @GetMapping("/listar")
    public List<Cupom> getAllCupom() {
        return cupomService.findAll();
    }


    @GetMapping(path = "/aplicar/{codigo}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = "application/json")
    public ResultData aplicar(@PathVariable(name = "codigo") String codigo){
        ResultData resultData = new ResultData();
        if (!cupomService.aplicarCupom(codigo)){
            resultData.error();
            resultData.setMessage("Cupom Inválido");
        }
        resultData.setMessage("Cupom utilizado com Sucesso!");
        return resultData;
    }
    
    @PostMapping(path = "/cadastrar/{quantidade}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = "application/json")
    public ResultData criarCupom(@Valid @RequestBody Cupom cupom, @PathVariable(value = "quantidade") int quantidade, BindingResult bindingResult){
    	ResultData resultData = new ResultData();
        cupomValidator.validate(cupom, bindingResult);
        if(bindingResult.hasErrors()){
            resultData.error();
            resultData.setField("erros", bindingResult.getAllErrors());
            return resultData;
        }
        cupomService.criarCupom(cupom, quantidade);

        return resultData;
    }
}
