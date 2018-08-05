package validator;

import model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import service.UsuarioService;

@Component
public class UsuarioValidator implements Validator {

    @Autowired
    private UsuarioService usuarioService;

   @Override
    public boolean supports(Class<?> aClass) {
        return Usuario.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
       Usuario usuario = (Usuario) o;

       ValidationUtils.rejectIfEmptyOrWhitespace(errors,"email","emailVazio","Email é obrigadorio");
//        if (usuarioService.findByEmail(usuario.getEmail()) != null) {
//            errors.rejectValue("username", "Duplicate.userForm.username");
//        }

    }
}
