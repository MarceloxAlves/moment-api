package controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import helper.ResultData;
import model.Tag;
import service.TagService;
import validator.TagValidator;

@RestController
@RequestMapping("/tag")
public class TagController {
	
	 @Autowired
	 TagService tagService;
	 
	 @Autowired
	 TagValidator tagValidator;
	 
	 @GetMapping("/listar")
	 public List<Tag> getAllCupom() {
		 return tagService.findAll();
	 }
	
	@PostMapping(path = "/cadastrar", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = "application/json")
    public ResultData criarCupom(@Valid @RequestBody Tag tag, BindingResult bindingResult){
    	ResultData resultData = new ResultData();
        tagValidator.validate(tag, bindingResult);
        if(bindingResult.hasErrors()){
            resultData.error();
            resultData.setField("erros", bindingResult.getAllErrors());
            return resultData;
        }
        tagService.criarTag(tag);

        return resultData;
    }
	
}
