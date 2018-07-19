package service;

import model.Usuario;

public interface UsuarioService {
	
	 void save(Usuario user);

	 Usuario findByUsername(String username);
	 
}
