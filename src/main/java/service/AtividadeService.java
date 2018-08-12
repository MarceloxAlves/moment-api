package service;


import model.Atividade;
import org.springframework.beans.factory.annotation.Autowired;
import repository.AtividadeRepository;

import java.util.List;
import java.util.Optional;

public class AtividadeService {


    @Autowired
    private AtividadeRepository atividadeRepository;

    public List<Atividade> findAll() {
        return  atividadeRepository.findAll();
    }

    public Optional<Atividade> getEvento(Long id) {
        return atividadeRepository.findById(id);
    }

    public Atividade findByIdEvento(Long id) {
        return atividadeRepository.findByIdEvento(id);
    }



}
