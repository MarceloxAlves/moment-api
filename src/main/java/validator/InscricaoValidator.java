package validator;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ch.qos.logback.core.net.SyslogOutputStream;
import model.Atividade;
import model.Inscricao;
import service.AtividadeService;
import service.EventoService;
import service.InscricaoService;

@Component
public class InscricaoValidator implements Validator {
	
	@Autowired
	private InscricaoService inscricaoService;
	
	@Autowired
	AtividadeService atividadeService;

	@Override
	public boolean supports(Class<?> aClass) {
		 return Inscricao.class.equals(aClass);
	}

	@Override
	public void validate(Object object, Errors errors) {
		Inscricao inscricao = (Inscricao) object;
		/*validarAtividadesInscricao(inscricao, errors);*/
	}
	
	
	/*private void validarAtividadesInscricao(Inscricao inscricao, Errors errors) {
		Atividade atividadeValida; 
		for(int i=0; i<inscricao.getAtividades().size(); i++) {
			atividadeValida = atividadeService.obterAtividade(inscricao.getAtividades().get(i).getId());
			if((atividadeValida.getEvento().getId()) != (inscricao.getEvento().getId())) {
				errors.reject("ErrorAtividade", null, "Atividade não pertence ao evento");
				break;
			}
		}
	}*/
}
