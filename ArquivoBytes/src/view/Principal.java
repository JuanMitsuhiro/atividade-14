package view;

import controller.BytesController;
import controller.IBytesController;
import java.io.IOException;

public class Principal {
	public static void main(String[] args) {
		IBytesController bytesCont = new BytesController();
		
		String path = "C:\\Windows";
		
		try {
			bytesCont.lerTamanho(path);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
