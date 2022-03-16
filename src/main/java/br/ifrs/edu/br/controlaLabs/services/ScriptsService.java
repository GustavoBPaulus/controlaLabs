package br.ifrs.edu.br.controlaLabs.services;

public class ScriptsService {
	public static String lerCaminhoScript(String lab, String acao) {
        String script = null;
        System.out.println("lab: "+lab+ "acao: "+ acao);
        
        //verifica para liberar
        if (lab.equalsIgnoreCase("lab1") && acao.equalsIgnoreCase("liberar")) script ="/system script run app-libera-lab1";        
        if (lab.equalsIgnoreCase("lab2") && acao.equalsIgnoreCase("liberar")) script = "/system script run app-libera-lab2";        
        if (lab.equalsIgnoreCase("lab3") && acao.equalsIgnoreCase("liberar")) script ="/system script run app-libera-lab3";        
        if (lab.equalsIgnoreCase("lab4") && acao.equalsIgnoreCase("liberar")) script ="/system script run app-libera-lab4";         
        if (lab.equalsIgnoreCase("lab5") && acao.equalsIgnoreCase("liberar")) script ="/system script run app-libera-lab5";                
        if (lab.equalsIgnoreCase("labLinguas") && acao.equalsIgnoreCase("liberar")) script="/system script run app-libera-labling";        
        if (lab.equalsIgnoreCase("labRedes") && acao.equalsIgnoreCase("liberar")) script="/system script run app-libera-labredes";        
        if (lab.equalsIgnoreCase("labAciona") && acao.equalsIgnoreCase("liberar")) script="/system script run app-libera-labaciona";        
        
          //verifica Bloquear
        if (lab.equalsIgnoreCase("lab1") && acao.equalsIgnoreCase("bloquear")){
            System.out.println("entrou no IF lab1 bloquear");
            //caminho = lerBloquearLab1();
            script = "/system script run app-bloqueia-lab1";
        }        
        if (lab.equalsIgnoreCase("lab2") && acao.equalsIgnoreCase("bloquear")) script ="/system script run app-bloqueia-lab2";        
        if (lab.equalsIgnoreCase("lab3") && acao.equalsIgnoreCase("bloquear")) script = "/system script run app-bloqueia-lab3";        
        if (lab.equalsIgnoreCase("lab4") && acao.equalsIgnoreCase("bloquear")) script = "/system script run app-bloqueia-lab4";          
        if (lab.equalsIgnoreCase("lab5") && acao.equalsIgnoreCase("bloquear")) script = "/system script run app-bloqueia-lab5";
        if (lab.equalsIgnoreCase("labLinguas") && acao.equalsIgnoreCase("bloquear")) script = "/system script run app-bloqueia-labling";
        if (lab.equalsIgnoreCase("labRedes") && acao.equalsIgnoreCase("bloquear")) script = "/system script run app-bloqueia-labredes";
        if (lab.equalsIgnoreCase("labAciona") && acao.equalsIgnoreCase("bloquear")) script = "/system script run app-bloqueia-labaciona";
        
        //verificar  default
        if (lab.equalsIgnoreCase("lab1") && acao.equalsIgnoreCase("default")) script = "/system script run app-default-lab1";
        if (lab.equalsIgnoreCase("lab2") && acao.equalsIgnoreCase("default")) script = "/system script run app-default-lab2";
        if (lab.equalsIgnoreCase("lab3") && acao.equalsIgnoreCase("default")) script = "/system script run app-default-lab3";
        if (lab.equalsIgnoreCase("lab4") && acao.equalsIgnoreCase("default")) script = "/system script run app-default-lab4";
        if (lab.equalsIgnoreCase("lab4") && acao.equalsIgnoreCase("default")) script = "/system script run app-default-lab5";
        if (lab.equalsIgnoreCase("labLinguas") && acao.equalsIgnoreCase("default")) script ="/system script run app-default-labling";
        if (lab.equalsIgnoreCase("labRedes") && acao.equalsIgnoreCase("default")) script ="/system script run app-default-labredes";
        if (lab.equalsIgnoreCase("labAciona") && acao.equalsIgnoreCase("default")) script ="/system script run app-default-labaciona";
        
        
        return script;
    }

    

}
