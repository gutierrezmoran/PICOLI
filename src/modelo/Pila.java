package modelo;

import java.awt.Color;
import java.util.Stack;

public class Pila extends Stack<Color> {

	private Stack<Color> pila;

	public Pila() {
		this.pila = new Stack<Color>();
	}

	public void apilar(Color color) {
		assert color != null : "El color es nulo";
		
		pila.push(color);
	}

	public Color desapilar() {
		return pila.pop();
	}

	public void limpiar() {
		this.pila.clear();
	}
	
	public Stack<Color> getPila() {
		return pila;
	}

	public void setPila(Stack<Color> pila) {
		this.pila = pila;
	}
	
	public boolean isVacia() {
		return this.pila.empty();
	}

}
