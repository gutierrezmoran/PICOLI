package control;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Stack;
import modelo.Colores;

public class Comprobador {
	
	/**
	 * Comprueba si una coleccion esta llena
	 * 
	 * @param coleccion
	 * @param limite
	 * @return Retorna TRUE en caso de que este llena o FALSE en caso contrario.
	 */
	public static boolean isColeccionLlena(AbstractCollection<Colores> coleccion, int limite) {
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
	public static boolean isColoresIgualesContiguos(AbstractCollection<Colores> coleccion) {
		for (int i = 0; i < coleccion.size() - 1; i++) {
			if(comprobarColoresIguales(getColor(coleccion, i), getColor(coleccion, i + 1))) {
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * 
	 * Comprueba la posicion del color repetido en una coleccion
	 * 
	 * @param coleccion
	 * @return Retorna la posicion del color repetido
	 */
	public static int getColorIgualContiguo(AbstractCollection<Colores> coleccion) {
		int indice = 0;
		for (int i = 0; i < coleccion.size() - 1; i++) {
			if(comprobarColoresIguales(getColor(coleccion, i), getColor(coleccion, i + 1))) {
				indice = i;
				break;
			}
		}
		return indice;
	}
	
	private static boolean comprobarColoresIguales(Colores color1, Colores color2) {
		if (color1 == color2) {
			return true;
		}
		
		return false;
	}
	
	private static Colores getColor(AbstractCollection<Colores> coleccion, int posicion) {
		if (coleccion instanceof Stack) {
			return ((Stack<Colores>) coleccion).get(posicion);
		}
		
		return ((ArrayList<Colores>) coleccion).get(posicion);
	}

}
