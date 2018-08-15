package validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import model.Atividade;
import model.Cupom;
import model.Evento;
import service.CupomService;
import service.EventoService;

@Component
public class CupomValidator implements Validator {

	
	@Autowired
	private CupomService cupomService;
	
	@Autowired
	private EventoService eventoService;
	
	
	@Override
	public boolean supports(Class<?> aClass) {
		return Cupom.class.equals(aClass);
	}

	@Override
	public void validate(Object object, Errors errors) {
		Cupom cupom = (Cupom) object;
        validarCupom(errors, cupom);
        validarPeriodo(errors,cupom);
		
	}
	
	private void validarPeriodo(Errors errors, Cupom cupom) {
		
		Evento evento = eventoService.findByIdEvento(cupom.getEvento().getId());
		
		if(cupom.getDataValidade().before(evento.getDataInicio())){
			errors.reject("dataValidadeErrada",null,"Data de Validade retroativa");
		}
		
		if(cupom.getDataValidade().after(evento.getDataTermino())){
			errors.reject("dataValidadeErrada",null,"Data fora do intervalo do evento");
		}
	}
	
	private void validarCupom(Errors errors, Cupom cupom) {
	       if (cupom.getEvento() == null) errors.reject("eventoNulo",null,"Evento do cupom está nulo");
	}
	
}
