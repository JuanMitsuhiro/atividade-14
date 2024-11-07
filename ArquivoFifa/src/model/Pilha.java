package model;

import java.util.ArrayList;

public class Pilha {
	private ArrayList<String> elementos;
	
	public Pilha() {
		this.elementos = new ArrayList<>();
	}
	
	public void push (String elemento) {
		elementos.add(elemento);
	}
	
	public String pop() {
		if (elementos.isEmpty()) {
			throw new IllegalArgumentException("Pilha está vazia.");
		}
		return elementos.remove(elementos.size() - 1);
	}
	
	public String peek() {
		return elementos.get(elementos.size() - 1);
	}
	
	

}
