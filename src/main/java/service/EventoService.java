package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Evento;
import model.Usuario;
import repository.EventoRepository;
import repository.UsuarioRepository;
import service.interfaces.EstadoEvento;
import service.states.EventoCancelado;
import service.states.EventoInscricaoEncerrada;
import service.states.EventoNovo;

@Service
public class EventoService {
	
	 @Autowired
	 private EventoRepository eventoRepository;
	
	 public List<Evento> findAll() {
	        return  eventoRepository.findAll();
	 }
	 
	 public Evento criarEvento(Evento evento) {
	    evento.setEstadoEvento(new EventoNovo());
	 	return eventoRepository.save(evento);
	 }
	 
	 public Optional<Evento> getEvento(Long id) {
		 return eventoRepository.findById(id);
	 }

	 public Evento findByIdEvento(Long id) {
		 return eventoRepository.findByIdEvento(id);
	 }

	 public EstadoEvento mudarEstado(Evento evento){
	 	evento.getEstadoEvento().mudarEstado(evento);
	 	eventoRepository.save(evento);
	 	return evento.getEstadoEvento();
	 }

	public EstadoEvento cancelarEvento(Evento evento){
	 	if (!evento.getEstadoEvento().getEstado().equals(new EventoInscricaoEncerrada().getEstado())) {
			evento.setEstadoEvento(new EventoCancelado());
			eventoRepository.save(evento);
		}
		return evento.getEstadoEvento();
	}


	public void delete(Long id) {
	 	  eventoRepository.deleteById(id);
	}
}
