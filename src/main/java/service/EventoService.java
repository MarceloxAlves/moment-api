package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Evento;
import model.Usuario;
import repository.EventoRepository;
import repository.UsuarioRepository;

@Service
public class EventoService {
	
	 @Autowired
	 private EventoRepository eventoRepository;
	
	 public List<Evento> findAll() {
	        return  eventoRepository.findAll();
	 }
	 
	 public Evento criarEvento(Evento evento) {
	       return eventoRepository.save(evento);
	 }
	 
	 public Optional<Evento> getEvento(Long id) {
		 return eventoRepository.findById(id);
	 }
	 
}
