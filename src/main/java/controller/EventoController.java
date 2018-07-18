package controller;

import model.Evento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.EventoRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/evento")
@CrossOrigin("*")
public class EventoController {
    @Autowired
    EventoRepository eventoRepository;

    @GetMapping("/listar")
    public List<Evento> getAllEventos() {
        return eventoRepository.findAll();
    }

    @GetMapping("/count")
    public long getTotal() {
        return eventoRepository.count();
    }

    @PostMapping("/cadastrar")
    public Evento cadastrarEvento(@Valid @RequestBody Evento evento) {
          return eventoRepository.save(evento);
    }
}