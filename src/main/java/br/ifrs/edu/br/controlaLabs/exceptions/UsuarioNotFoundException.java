package br.ifrs.edu.br.controlaLabs.exceptions;

import javax.persistence.EntityNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class UsuarioNotFoundException extends EntityNotFoundException {

    public UsuarioNotFoundException(String usuario) {
        super(String.format("usuario com o nome %s não encontrado", usuario));
    }

}
