package validator;

import helper.TDate;
import model.Evento;
import model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class EventoValidator implements Validator {

    @Autowired
    private EventoService eventoService;

   @Override
    public boolean supports(Class<?> aClass) {
        return Evento.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
       Evento evento = (Evento) o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"descricao","descricaoVazia","Uma descrição é Obrigatória");
        if (TDate.dataRetroativa(evento.getDataInicio())) {
            errors.reject("Data de início inválida");
        }
        if (TDate.dataRetroativa(evento.getDataTermino())) {
            errors.reject("Data de término inválida");
        }

    }
}
