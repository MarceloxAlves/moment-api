package controller;

import helper.ResultData;
import model.Login;
import model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import service.UsuarioService;
import validator.UsuarioValidator;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
    @Autowired
    UsuarioService usuarioService;

    @Autowired
    UsuarioValidator usuarioValidator;

    @GetMapping("/")
    public void index(){
        getTotal();
    }

    @GetMapping("/listar")
    public List<Usuario> getAllEventos() {
        return usuarioService.findAll();
    }

    @GetMapping("/count")
    public long getTotal() {
        return usuarioService.count();
    }

    @PostMapping(path = "/cadastrar",  consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = "application/json")
    public ResultData cadastrarUsuario(@Valid @RequestBody Usuario usuario, BindingResult bindingResult) {
        ResultData resultData = new ResultData();
        usuarioValidator.validate(usuario,bindingResult);
        if(bindingResult.hasErrors()){
            resultData.error();
            resultData.setMessage(bindingResult.getFieldError().getDefaultMessage());
            return resultData;
        }
         usuarioService.criarUsuario(usuario);

       return resultData;
    }


    @PostMapping(path = "/login",  consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = "application/json")
    public ResultData login(@RequestBody Login login, BindingResult bindingResult) {
        ResultData resultData = new ResultData();
        resultData.setField("usuario",usuarioService.Login(login));
       return resultData;
    }


}
