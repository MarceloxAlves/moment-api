import helper.TDate;
import model.Evento;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import validator.EventoValidator;

import java.text.ParseException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={Evento.class})
public class EventoTest {


    @Autowired
    EventoValidator eventoValidator;

    @Test
    public void contextLoads() throws Exception {

    }

    public List<FieldError> validar_data_retroativa_evento(){
        Evento evento = new Evento();
        try {
            evento.setDataInicio(TDate.converteDataUS("21/08/2017"));
            evento.setDataTermino(TDate.converteDataUS("22/08/2017"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        evento.setDescricao("Evento Test");
        Errors errors = null;

        eventoValidator.validate(evento, errors);
        return errors.getFieldErrors();
    }

}