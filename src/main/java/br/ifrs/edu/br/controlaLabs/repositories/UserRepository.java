package br.ifrs.edu.br.controlaLabs.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import br.ifrs.edu.br.controlaLabs.model.UsuarioModelo;

public interface UserRepository extends JpaRepository<UsuarioModelo, Long>{
		
	Optional<UsuarioModelo> findByUsuario(String usuario);
}
