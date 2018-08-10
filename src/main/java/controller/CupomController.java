package controller;

import model.Cupom;
import model.Evento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.CupomRepository;
import repository.EventoRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/cupom")
@CrossOrigin(origins = "*")
public class CupomController {

    @Autowired
    CupomRepository cupomRepository;

    @Autowired
    EventoRepository eventoRepository;

    @GetMapping("/listar_eventos")
    public List<Evento> getAllEventos() {
        return eventoRepository.findAll();
    }

    @GetMapping("/count")
    public long getTotal() {
        return cupomRepository.count();
    }

    @GetMapping("/cadastrar")
    public Cupom criarCupom(@Valid @RequestBody Cupom cupom){
        return cupomRepository.save(cupom);
    }


}
