package modelo;

import java.util.ArrayList;
import utiles.Constantes;

public class Historial {

	private ArrayList<Colores> listaColores;

	public Historial() {
		this.listaColores = new ArrayList<>();
	}

	public ArrayList<Colores> getListaColores() {
		return listaColores;
	}

	/**
	 * Comprueba si existen más de dos coincidencias de colores en el historial
	 * 
	 * @param color
	 * @param historial
	 * @return
	 */
	public boolean buscarCoincidencias(Colores color, ArrayList<Colores> historial) {
		int coincidencias = 0;
		for (Colores colores : historial) {
			if (colores == color) {
				coincidencias++;
			}
		}
		return coincidencias >= 2;
	}

	/**
	 * Este método introduce un color en el historial sustituyendo el más antiguo
	 * 
	 * @param color
	 */
	public void sustituirColor(Colores color) {
		listaColores.remove(0);
		listaColores.add(color);
	}

	/**
	 * Comprueba si el historial está completo
	 * 
	 * @return Retorna true si el historial esta completo o false en caso contrario
	 */
	public boolean comprobarHistorialCompleto() {
		return listaColores.size() >= Constantes.TAMANO_HISTORICO;
	}
}
