package control;

import java.awt.Color;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Stack;

import org.hamcrest.core.IsInstanceOf;

public class Comprobador {

	private static Comprobador comprobador;

	private Comprobador() {
	}

	public static Comprobador getInstance() {
		if (comprobador == null) {
			comprobador = new Comprobador();
		}

		return comprobador;
	}
	
	/**
	 * Comprueba si una coleccion esta llena
	 * 
	 * @param coleccion
	 * @param limite
	 * @return Retorna TRUE en caso de que este llena o FALSE en caso contrario.
	 */
	public boolean isColeccionLlena(AbstractCollection<Color> coleccion, int limite) {
		if (coleccion.size() >= limite) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * Comprueba si dentro de una coleccion hay dos colores iguales y contiguos.
	 * 
	 * @param coleccion
	 * @return Retorna TRUE si hay dos colores iguales y contiguos o FALSE en caso contrario.
	 */
	public boolean isColoresIgualesContiguos(AbstractCollection<Color> coleccion) {
		for (int i = 0; i < coleccion.size() - 1; i++) {
			if(comprobarColoresIguales(getColor(coleccion, i), getColor(coleccion, i + 1))) {
				return true;
			}
		}
		
		return false;
	}
	
	private boolean comprobarColoresIguales(Color color1, Color color2) {
		if (color1 == color2) {
			return true;
		}
		
		return false;
	}
	
	private Color getColor(AbstractCollection<Color> coleccion, int posicion) {
		if (coleccion instanceof Stack) {
			return ((Stack<Color>) coleccion).get(posicion);
		}
		
		return ((ArrayList<Color>) coleccion).get(posicion);
	}

}
