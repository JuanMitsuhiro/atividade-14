package view;

import controller.IFifaController;
import controller.FifaController;
import java.io.IOException;
import model.Pilha;

public class Principal {
	public static void main(String[] args) {
		IFifaController fifaCont = new FifaController();
		Pilha  pilhaBrasileiros = new Pilha();
	      
	    String path = "C:\\TEMP";
	    String nomeArq = "data.csv";
	      
	    try{
	    	pilhaBrasileiros = fifaCont.empilhaBrasileiros(path, nomeArq);
	        fifaCont.desmpilhaBonsBrasileiros(pilhaBrasileiros);
	       
	    } catch (IOException e){
	    	e.printStackTrace();
	    }
		

	}

}
