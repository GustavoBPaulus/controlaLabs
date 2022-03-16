package br.ifrs.edu.br.controlaLabs.useful;

import br.ifrs.edu.br.controlaLabs.config.PasswordEnconderConfig;

public class DecriptadorDeSenhas {
  public String retornaSenhaEncriptada(String senha) {
	  String senhaEncriptada = new PasswordEnconderConfig().passwordEncoder().encode(senha);
	  System.out.println("senha encriptada: "+senhaEncriptada);
	  return senhaEncriptada;
  }
  
  public static void main(String []args) {
	  System.out.println(new DecriptadorDeSenhas().retornaSenhaEncriptada("@lface#236").trim());
  }
  
}
