package modelo;

import java.util.Stack;

public class Pila extends Stack<Colores> {

	private Stack<Colores> pila;

	public Pila() {
		this.pila = new Stack<Colores>();
	}

	public Stack<Colores> getPila() {
		return pila;
	}

	public void apilar(Colores color) {
		pila.add(color);
	}

	public Colores desapilar() {
		return pila.pop();
	}
}
