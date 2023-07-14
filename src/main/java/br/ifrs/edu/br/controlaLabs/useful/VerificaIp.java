package br.ifrs.edu.br.controlaLabs.useful;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

public class VerificaIp {
	private String retornaIp(HttpServletRequest request) {
		String ipAddress = request.getHeader("X-FORWARDED-FOR");
		if (ipAddress == null) {
			ipAddress = request.getRemoteAddr();
		}
		System.out.println("ip da máquina que está acessando: "+ipAddress);
		return ipAddress;
	}
	
	public boolean ipPermitido(HttpServletRequest request) {
		String ipRecebido = retornaIp(request);
		boolean permitido = false;
		
		for(String ipAtual : retornaListaDeIpsPermitidos()) {
			if(ipAtual.equals(ipRecebido)) 
				permitido = true;
			
				
		}
		
		return permitido;
	}
	private List<String> retornaListaDeIpsPermitidos(){
		List<String> listaDeIpsPermitidos = new ArrayList<String>();
		listaDeIpsPermitidos.add("127.0.0.1");
		listaDeIpsPermitidos.add("192.168.101.22");
		listaDeIpsPermitidos.add("0:0:0:0:0:0:0:1");
		
		listaDeIpsPermitidos.add("192.168.0.22");
		listaDeIpsPermitidos.add("192.168.0.23");
		listaDeIpsPermitidos.add("192.168.0.24");
		listaDeIpsPermitidos.add("192.168.0.25");
		
		listaDeIpsPermitidos.add("10.10.1.50");
		listaDeIpsPermitidos.add("10.10.2.50");
		listaDeIpsPermitidos.add("10.10.3.50");
		listaDeIpsPermitidos.add("10.10.4.50");
		listaDeIpsPermitidos.add("10.10.5.50");
		listaDeIpsPermitidos.add("10.10.6.50");
		listaDeIpsPermitidos.add("10.10.7.50");
		listaDeIpsPermitidos.add("10.10.8.50");
		listaDeIpsPermitidos.add("10.10.9.50");
		listaDeIpsPermitidos.add("10.10.10.50");
		
		for(int i = 1; i<=254; i++ ) {
		listaDeIpsPermitidos.add("192.168.56."+i);
		}
		
		return listaDeIpsPermitidos;
	}
	

	
}
