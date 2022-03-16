package br.ifrs.edu.br.controlaLabs.services;

import br.ifrs.edu.br.controlaLabs.ssh.SSHReadFile;


public class GerenciaInternetService {

	public void realizaOperacao(String acao, String lab) {
		String comando = new ScriptsService().lerCaminhoScript(lab, acao);
		// String comando = new LeitorArquivos().lerCaminhoScript("lab1", acao);
		System.out.println("comando: " + comando);
		new SSHReadFile().executaComando(comando);
	}

}
