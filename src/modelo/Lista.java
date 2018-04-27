package modelo;

import java.awt.Color;
import java.util.ArrayList;

public class Lista extends ArrayList<Color> {

	private ArrayList<Color> lista;

	public Lista() {
		this.lista = new ArrayList<Color>();
	}

	public ArrayList<Color> getLista() {
		return lista;
	}

	public void alistar(Color color) {
		assert color != null : "El color es nulo";
		
		lista.add(color);
	}

	public void desalistarRepetidos(int posicion) {
		assert posicion >= 0 : "La posicion es inferior a 0";
		
		for (int i = 0; i < 2; i++) {
			this.lista.remove(posicion);
		}
	}

	public void reiniciar() {
		this.lista.clear();
	}
}
