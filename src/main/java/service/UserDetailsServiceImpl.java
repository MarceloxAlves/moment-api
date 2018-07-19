package service;

import java.util.List;
import java.util.HashSet;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import model.Role;
import model.Usuario;
import repository.UsuarioRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
    private UsuarioRepository usuarioRepository;

	@Override
	@Transactional()
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		 Usuario usuario = usuarioRepository.findByUsername(username);
		 
		 Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
	        for (Role role : usuario.getRoles()){
	            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
	        }
		 
	        return new org.springframework.security.core.userdetails.User(usuario.getUsername(), usuario.getPassword(), grantedAuthorities);
	}

}
