package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Atividade;
import model.Cupom;
import repository.CupomRepository;

@Service
public class CupomService {
	
	@Autowired
    CupomRepository cupomRepository;
	
	 public Cupom criarCupom(Cupom cupom) {
	        return cupomRepository.save(cupom);
	    }
	    
	    public List<Cupom> findAll() {
	        return cupomRepository.findAll();
	    }
	    
	    public Optional<Cupom> getAtividade(Long id) {
	        return cupomRepository.findById(id);
	    }

}
