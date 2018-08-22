package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Atividade;
import model.Inscricao;
import model.StatusInscricao;
import repository.InscricaoRepository;

@Service
public class InscricaoService {
	
	@Autowired
	InscricaoRepository inscricaoRepository;
	
	@Autowired
	AtividadeService atividadeService;
	
	
	public void criarInscricao(Inscricao inscricao) {
		double valorTotal=0;
		for(Atividade atividade: inscricao.getAtividades()) {
			Optional<Atividade> atividadeEncontrada = atividadeService.getAtividade(atividade.getId());
			valorTotal += atividadeEncontrada.get().getValor();
		}
		inscricao.setStatusInscricao(StatusInscricao.NAOPAGO);
		inscricao.setValorTotal(valorTotal);
		inscricaoRepository.save(inscricao);
	}
	
	
	public List<Inscricao> ListarTodos() {
		return inscricaoRepository.findAll();
	}
}
