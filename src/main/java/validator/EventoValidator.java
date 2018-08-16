package validator;

import helper.TDate;


import model.Evento;
import service.EventoService;

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

        validarUsuarioEvento(errors, evento) ;

        validarDataTermino(errors, evento);

         validarDataInicio(errors, evento);

    }

    private void validarUsuarioEvento(Errors errors, Evento evento) {
       if (evento.getUsuario() == null) errors.reject("usuarioNulo",null,"Usuário do evento está nulo");
    }

    private void validarDataInicio(Errors errors, Evento evento) {
        if (evento.getDataTermino() == null){
            errors.reject("dataTerminoNull",null,"Data de término nula");
        }else{
            try{
                if (TDate.dataRetroativa(evento.getDataTermino())) {
                    errors.reject("dataTerminoNull",null,"Data de término retroativa");
                }
            }catch (Exception ex){
                errors.reject("dataInicio",null,"Data de inicio inválida");
            }
        }
    }

    private void validarDataTermino(Errors errors, Evento evento) {
        if (evento.getDataInicio() == null){
            errors.reject("dataInicioNull",null,"Data de inicio nula");
        }else {
            try{
                if (TDate.dataRetroativa(evento.getDataInicio())) {
                    errors.reject("dataInicioNull",null,"Data de inicio retroativa");
                }
            }catch(Exception ex){
                errors.reject("dataTermino",null,"Data de término inválida");
            }
        }
    }


}
