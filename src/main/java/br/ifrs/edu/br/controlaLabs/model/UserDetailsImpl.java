package br.ifrs.edu.br.controlaLabs.model;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import br.ifrs.edu.br.controlaLabs.enums.Perfil;

public class UserDetailsImpl implements UserDetails {
	
	private  UsuarioModelo usuario;
	
	public UserDetailsImpl(UsuarioModelo usuario) {
		this.usuario = usuario;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Perfil perfil = usuario.getUsuario().equalsIgnoreCase("ti") ?
				Perfil.ADMIN : Perfil.USER;
		
		return AuthorityUtils.createAuthorityList(perfil.toString());
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return usuario.getSenha();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return usuario.getUsuario();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
