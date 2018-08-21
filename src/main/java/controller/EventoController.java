package controller;

import helper.ResultData;
import model.Evento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import service.EventoService;
import validator.EventoValidator;

import javax.validation.Valid;
import java.io.Console;
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
    
    @GetMapping("/mudar-estado/{id}")
    public Evento mudarEstado(@PathVariable Long id ) {
        Evento evento = eventoService.findByIdEvento(id);
         if (evento != null ) {
             eventoService.mudarEstado(evento);
         }
         return evento;
    }
    
    @GetMapping("/participar/{id}")
    public Evento participarEvento(@PathVariable Long id) {
    	 Evento evento = eventoService.findByIdEvento(id);
         if (evento == null) {
            return new Evento();
         }
         return evento;
         
    }
    
    @GetMapping("/cancelar/{id}")
    public Evento cancelarEvento(@PathVariable Long id ) {
        Evento evento = eventoService.findByIdEvento(id);
        if (evento != null ) {
            eventoService.cancelarEvento(evento);
        }
        return evento;
    }

    @DeleteMapping("/delete/{id}")
    public ResultData deletarEvento(@PathVariable Long id ) {
        ResultData resultData = new ResultData();
        try{
            Evento evento = eventoService.findByIdEvento(id);
            if (evento != null ) {
                eventoService.delete(id);
            }
          resultData.setMessage("Evento deletado com sucesso!" );

        }catch (Exception ex){
            resultData.error();
            resultData.setMessage("Erro ao deletar o evento de codigo " + id);
        }

        return resultData;
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

        eventoService.criarEvento(evento);

        return resultData;
    }
}
