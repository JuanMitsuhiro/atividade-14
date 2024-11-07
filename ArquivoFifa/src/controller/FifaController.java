package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import model.Pilha;


public class FifaController implements IFifaController{
	public FifaController() {
		super();
	}

	   
	public Pilha empilhaBrasileiros(String caminho, String nome) throws IOException {
		Pilha pilha = new Pilha();
		File arq = new File(caminho, nome);
			
		if (arq.exists() && arq.isFile()) {
			FileInputStream fluxo = new FileInputStream(arq);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
				
			String linha = buffer.readLine();
			linha = buffer.readLine();
				
			while (linha != null) {
				String[] linhaJogador = linha.split(",");
				if (linhaJogador[5].equals("Brazil")){
					pilha.push(linha);
				}
				
				linha = buffer.readLine();
			}
				
			buffer.close();
			leitor.close();
			fluxo.close();
				
		} else {
			throw new IOException("Arquivo invalido.");
		}
		
	    return pilha; 
	}
	   
	   public void desmpilhaBonsBrasileiros(Pilha pilha) throws IOException{
	      while (pilha != null) {
	    	  String jogador = pilha.peek();
	    	  pilha.pop();
	    	  String[] jogadores = jogador.split(",");
	    	  
	    	  if (Integer.parseInt(jogadores[7]) > 80){
	    		  System.out.printf("%-35s%s%n", jogadores[2], jogadores[7]);
	    	  }
	      }
	   }
	   
	   /* Não terminei :((
	   
	   public Lista<String> listaRevelacoes(String caminho, String nome) throws IOException{
	      
	   }
	   
	   public void buscaListaBonsJovens(Lista<String> lista) throws IOException{
	      
	   }
 
	    
	   */
	   
}
