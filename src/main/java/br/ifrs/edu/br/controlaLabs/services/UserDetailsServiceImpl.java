package br.ifrs.edu.br.controlaLabs.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.ifrs.edu.br.controlaLabs.exceptions.UsuarioNotFoundException;
import br.ifrs.edu.br.controlaLabs.model.UserDetailsImpl;
import br.ifrs.edu.br.controlaLabs.model.UsuarioModelo;
import br.ifrs.edu.br.controlaLabs.repositories.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UsuarioModelo usuario = userRepository.findByUsuario(username).orElseThrow(() -> new UsuarioNotFoundException(username));
		return new UserDetailsImpl(usuario);
	}

}
