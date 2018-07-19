package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import model.Usuario;
import repository.RoleRepository;
import repository.UsuarioRepository;
import java.util.HashSet;

@Service
public class UsuarioServiceImpl implements UsuarioService  {
	
	@Autowired
    private UsuarioRepository usuarioRepository;
	
	@Autowired
    private RoleRepository roleRepository;
    
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public void save(Usuario usuario) {
		usuario.setPassword(bCryptPasswordEncoder.encode(usuario.getPassword()));
		usuario.setRoles(new HashSet<>(roleRepository.findAll()));
		usuarioRepository.save(usuario);
		
	}

	@Override
	public Usuario findByUsername(String username) {
		return usuarioRepository.findByUsername(username);
	}
	
}
