package modelo;

import java.util.ArrayDeque;

public class Cola extends ArrayDeque<Colores>{

	private ArrayDeque<Colores> cola;

	public Cola() {
		this.cola = new ArrayDeque<Colores>();
	}

	public ArrayDeque<Colores> getCola() {
		return cola;
	}

	public void encolar(Colores color) {
		cola.add(color);
	} 

	public Colores desencolar() {
		return cola.pop();
	}
}
