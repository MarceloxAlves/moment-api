package controller;

import model.Evento;
import model.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import repository.EventoRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/evento")
public class EventoController {
	
    @Autowired
    EventoRepository eventoRepository;

    @GetMapping("/")
    public void index(){
        getTotal();
    }


    @GetMapping("/listar")
    public List<Evento> getAllEventos() {
        return eventoRepository.findAll();
    }

    @GetMapping("/count")
    public long getTotal() {
        return eventoRepository.count();
    }

    @GetMapping(path = "/cadastrar",  consumes = "application/json", produces = "application/json")
    public Evento cadastrarEvento(@Valid @RequestBody Evento evento) {
          return eventoRepository.save(evento);
    }
}
