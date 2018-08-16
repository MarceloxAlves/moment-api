package validator;

import helper.TDate;

import model.Atividade;
import model.Evento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import service.AtividadeService;
import service.EventoService;

@Component
public class AtividadeValidator implements Validator {

    @Autowired
    private AtividadeService atividadeService;

   @Override
    public boolean supports(Class<?> aClass) {
        return Evento.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
       Atividade atividade = (Atividade) o;
        validarEvento(errors, atividade) ;

    }

    private void validarEvento(Errors errors, Atividade atividade) {
       if (atividade.getEvento() == null) errors.reject("eventoNulo",null,"Evento da atividade está nulo");
    }



}
