package validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import model.Inscricao;
import service.InscricaoService;

@Component
public class InscricaoValidator implements Validator {
	
	@Autowired
	private InscricaoService incricaoService;

	@Override
	public boolean supports(Class<?> aClass) {
		 return Inscricao.class.equals(aClass);
	}

	@Override
	public void validate(Object object, Errors errors) {
		// TODO Auto-generated method stub
	}
	
	

}
