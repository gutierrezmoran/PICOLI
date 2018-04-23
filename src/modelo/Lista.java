package modelo;

import java.util.ArrayList;

public class Lista extends ArrayList<Colores> {

	private ArrayList<Colores> lista;

	public Lista() {
		this.lista = new ArrayList<Colores>();
	}

	public ArrayList<Colores> getLista() {
		return lista;
	}

	public void alistar(Colores color) {
		lista.add(color);
	}

	public void desalistarRepetidos(int posicion) {
		for (int i = 0; i < 2; i++) {
			this.lista.remove(posicion);
		}
	}
}
