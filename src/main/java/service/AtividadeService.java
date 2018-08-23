package service;


import model.Atividade;

import model.TipoAtividade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.AtividadeRepository;
import repository.TipoAtividadeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AtividadeService {

    @Autowired
    private AtividadeRepository atividadeRepository;

    @Autowired
    private TipoAtividadeRepository tipoAtividadeRepository;
    
    public Atividade criarAtividade(Atividade atividade) {
        return atividadeRepository.save(atividade);
    }
    
    public List<Atividade> findAll() {
        return atividadeRepository.findAll();
    }
    
    public void delete(Long id) {
    	atividadeRepository.deleteById(id);
	}
    
    public Atividade obterAtividade(Long id) {
        return atividadeRepository.findByIdAtividade(id);
    }
    
    public Optional<Atividade> getAtividade(Long id) {
        return atividadeRepository.findById(id);
    }

    public List<TipoAtividade> listarTipoAtividade(){
        return tipoAtividadeRepository.findAll();
    }

}
