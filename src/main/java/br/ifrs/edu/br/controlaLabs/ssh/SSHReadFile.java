package br.ifrs.edu.br.controlaLabs.ssh;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class SSHReadFile {

	 public static void executaComando(String comando) {
		    
	     
	    	String user = "cortanet";
	        String password = "cortaInternet";
	        //String host = "192.168.56.100";
	        String host = "192.168.0.12";
	        int port = 22;
	     
	  //      String remoteFile = "c:\test.txt";

	        try {
	            JSch jsch = new JSch();
	            Session session = jsch.getSession(user, host, port);
	            session.setPassword(password);
	            session.setConfig("StrictHostKeyChecking", "no");
	            System.out.println("Establishing Connection...");
	            session.connect();
	            System.out.println("Connection established.");
	            System.out.println("Criando channel.");
	            Channel channel = session.openChannel("exec");
	            //((ChannelExec) channel).setCommand("su");
	            //((ChannelExec) channel).setCommand(password);
	         ((ChannelExec) channel).setCommand(comando);
	            //InputStream in = channel.getInputStream();
	            ((ChannelExec) channel).setErrStream(System.err);
	            channel.connect();
	            
	            System.out.println("comando executado.");
	        
	        
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	    }

	
}
