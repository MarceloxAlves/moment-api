package service;


import model.Atividade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.AtividadeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AtividadeService {

    @Autowired
    private AtividadeRepository atividadeRepository;
    
    public Atividade criarAtividade(Atividade atividade) {
        return atividadeRepository.save(atividade);
    }
    
    public List<Atividade> findAll() {
        return atividadeRepository.findAll();
    }
    
    public Optional<Atividade> getAtividade(Long id) {
        return atividadeRepository.findById(id);
    }

}
