package controller;

import java.io.File;
import java.io.IOException;


public class BytesController implements IBytesController{

	public BytesController() {
		super();
	}
	
	public void lerTamanho (String path) throws IOException{
		File dir = new File(path);
		String converte = "";
		
		if (dir.exists() && dir.isDirectory()) {
			File[] files = dir.listFiles();
			for (File f : files) {
				if (f.isFile()) {
					converte = Double.toString(((double)f.length())/1024/1024) + "MB";
					
					System.out.printf("%-35s%s%n", f.getName(), converte);
				}
			}
			
			
		} else {
			throw new IOException("Diretório inválido");
		}
		
	}

}
