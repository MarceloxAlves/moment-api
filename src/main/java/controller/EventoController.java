package controller;

import helper.ResultData;
import model.Evento;
import model.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import repository.EventoRepository;
import service.EventoService;
import validator.EventoValidator;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/evento")
public class EventoController {
	
    @Autowired
    EventoService eventoService;

    @Autowired
    EventoValidator eventoValidator;

    @GetMapping("/listar")
    public List<Evento> getAllEventos() {
        return eventoService.findAll();
    }


    @PostMapping(path = "/cadastrar", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = "application/json")
    public ResultData cadastrarEvento(@Valid @RequestBody Evento evento, BindingResult bindingResult) {
        ResultData resultData = new ResultData();

        eventoValidator.validate(evento, bindingResult);
        if(bindingResult.hasErrors()){
            resultData.error();
            resultData.setField("erros", bindingResult.getAllErrors());
            return resultData;
        }

       // eventoService.criarEvento(evento);

        return resultData;
    }
}
