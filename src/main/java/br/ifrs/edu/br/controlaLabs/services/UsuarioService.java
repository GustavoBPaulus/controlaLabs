package br.ifrs.edu.br.controlaLabs.services;

import org.springframework.beans.factory.annotation.Autowired;

import br.ifrs.edu.br.controlaLabs.config.PasswordEnconderConfig;
import br.ifrs.edu.br.controlaLabs.model.UsuarioModelo;
import br.ifrs.edu.br.controlaLabs.repositories.UserRepository;

public class UsuarioService {
	@Autowired
	UserRepository userRepository;
	
	public void criaUsuario(String username, String senha) {
		UsuarioModelo user = new UsuarioModelo();
		user.setUsuario(username);
		String senhaEncriptada = new PasswordEnconderConfig().passwordEncoder().encode(senha);
		user.setSenha(senhaEncriptada);
		userRepository.save(user);
	}
	
}
