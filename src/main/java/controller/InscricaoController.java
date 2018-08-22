package controller;


import model.Atividade;

import model.Inscricao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import helper.ResultData;
import repository.InscricaoRepository;
import service.InscricaoService;
import validator.InscricaoValidator;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/inscricao")
@CrossOrigin(origins = "*")
public class InscricaoController {

    @Autowired
    InscricaoService inscricaoService;
    
    @Autowired
    InscricaoValidator inscricaoValidator;
    

    @GetMapping("/listar")
    public List<Inscricao> getAllIncricao() {
        return inscricaoService.ListarTodos();
    }

    @PostMapping(path = "/cadastrar",  consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = "application/json")
    public ResultData cadastrarInscricao(@Valid @RequestBody Inscricao inscricao, BindingResult bindingResult) {
    	ResultData resultData = new ResultData();
        inscricaoValidator.validate(inscricao, bindingResult);
        if(bindingResult.hasErrors()){
            resultData.error();
            resultData.setField("erros", bindingResult.getAllErrors());
            return resultData;
        }
       
       inscricaoService.criarInscricao(inscricao);

        return resultData;
    }




}
