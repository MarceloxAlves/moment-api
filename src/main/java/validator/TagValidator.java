package validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import model.Cupom;
import model.Tag;
import repository.TagRepository;

@Component
public class TagValidator implements Validator {
	
	@Autowired
	TagRepository tagRepository;

	@Override
	public boolean supports(Class<?> aClass) {
		return Cupom.class.equals(aClass);
	}

	@Override
	public void validate(Object object, Errors errors) {
		Tag tag = (Tag) object;
		validarNome(tag,errors);
	}
	
	private void validarNome(Tag tag, Errors errors) {
		
		Tag tagEncontrada = tagRepository.findByName(tag.getDescricao());
		
		if(tagEncontrada != null) {
			 errors.reject("TagExistente",null,"Nome da tag ja existe");
		}
	}
}
