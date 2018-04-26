package modelo;

import java.awt.Color;
import java.util.ArrayDeque;

import utiles.Constantes;
import utiles.Utiles;

public class Cola extends ArrayDeque<Color> {

	private ArrayDeque<Color> cola;

	public Cola() {
		this.cola = new ArrayDeque<Color>();
	}

	public ArrayDeque<Color> getCola() {
		return cola;
	}

	public void encolar(Color color) {
		cola.add(color);
	}

	public Color desencolar() {
		return cola.pop();
	}

	public void reiniciar() {
		this.cola.clear();
		inicializar();
	}

	public void inicializar() {
		for (int i = 0; i < Constantes.TAMANO_COLA; i++) {
			encolar(Colores.getElement(Utiles.generarNumeroAleatorio(1, 5)));
		}
	}
}
