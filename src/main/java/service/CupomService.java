package service;

import java.util.List;
import java.util.Optional;

import helper.Codificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Cupom;
import repository.CupomRepository;

@Service
public class CupomService {
	
	@Autowired
	CupomRepository cupomRepository;
	
	public void criarCupom(Cupom cupom, int quantidade) {
		for (int i = 0; i < quantidade; i++) {
			Cupom novoCupom  = new Cupom();
			novoCupom.setDataValidade(cupom.getDataValidade());
			novoCupom.setDesconto(cupom.getDesconto());
			novoCupom.setEvento(cupom.getEvento());
			cupomRepository.save(novoCupom);
			novoCupom.setCodigo(Codificador.codificar(String.valueOf(novoCupom.getId())));
			cupomRepository.save(novoCupom);
		}

	}
	    
	public List<Cupom> findAll() {
		return cupomRepository.findAll();
	}
	    
	public Cupom getCupom(Long id) {
		return cupomRepository.findById(id).get();
	}

	public boolean isValido(Cupom cupom) {

		if (cupom instanceof Cupom && cupom != null){
			if (!cupom.isUtilizado()){
				return true;
			}
		}

		return false;
	}

	public boolean aplicarCupom(String codigo) {

		try{
			Cupom cupom = this.getCupom(Codificador.decodificar(codigo));
			if(this.isValido(cupom)){
				cupom.setUtilizado();
				cupomRepository.save(cupom);
			}
		}catch (IllegalArgumentException exeption){
			return false;
		}

		return false;
	}
}
