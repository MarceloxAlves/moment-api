package validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import model.Atividade;
import model.Cupom;
import model.Evento;

@Component
public class CupomValidator implements Validator {

	@Override
	public boolean supports(Class<?> aClass) {
		return Cupom.class.equals(aClass);
	}

	@Override
	public void validate(Object object, Errors errors) {
		Cupom cupom = (Cupom) object;
        validarCupom(errors, cupom);
	}
	
	private void validarCupom(Errors errors, Cupom cupom) {
	       if (cupom.getEvento() == null) errors.reject("eventoNulo",null,"Evento da cupom está nulo");
	    }

}
