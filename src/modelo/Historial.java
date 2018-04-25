package modelo;

import java.awt.Color;
import java.util.ArrayList;
import utiles.Constantes;
import utiles.Utiles;

public class Historial {

	private ArrayList<Color> historialColoresUsados;
	private ArrayList<Color> coloresParaElegir;

	public Historial() {
		this.historialColoresUsados = new ArrayList<>();
		this.coloresParaElegir = new ArrayList<>();
	}
	
	private void sortearColores() {
		boolean seleccionable;
		for (int i = 0; i < Constantes.CANTIDAD_COLORES_SELECCION; i++) {
			seleccionable = false;
			do {
				Color color = Colores.getElement(Utiles.generarNumeroAleatorio(0, Constantes.PETICION_COLOR_MAX));
				if(!buscarCoincidenciasHistorial(color) && !buscarCoincidenciasSeleccionados(color)) {
					agregarColorSeleccionado(color);
					seleccionable = true;
				}
			} while(!seleccionable);
		}
	}
	
	private void borrarColoresSeleccinados() {
		this.coloresParaElegir.clear();
	}

	/**
	 * Comprueba si existen más de dos coincidencias de colores en el historial
	 * 
	 * @param color
	 * @param historialColoresUsados
	 * @return
	 */
	public boolean buscarCoincidenciasHistorial(Color color) {
		int coincidencias = 0;
		for (Color colores : this.historialColoresUsados) {
			if (colores == color) {
				coincidencias++;
			}
		}
		return coincidencias >= 2;
	}
	
	public boolean buscarCoincidenciasSeleccionados(Color color) {
		for (Color colores : this.coloresParaElegir) {
			if(colores == color) {
				return true;
			}
		}

		return false;
	}
	
	public ArrayList<Color> getColoresSeleccionados() {
		return coloresParaElegir;
	}
	
	public void renovarColores() {
		borrarColoresSeleccinados();
		sortearColores();
	}
	
	public void agregarColorSeleccionado(Color color) {
		this.coloresParaElegir.add(color);
	}

	/**
	 * Este método introduce un color en el historial sustituyendo el más antiguo
	 * 
	 * @param color
	 */
	public void actualizarHistorial(Color color) {
		if (isHistorialCompleto()) {
			historialColoresUsados.remove(0);
			historialColoresUsados.add(color);
		} else {
			historialColoresUsados.add(color);
		}
	}

	/**
	 * Comprueba si el historial está completo
	 * 
	 * @return Retorna true si el historial esta completo o false en caso contrario
	 */
	public boolean isHistorialCompleto() {
		return historialColoresUsados.size() >= Constantes.TAMANO_HISTORICO;
	}
	
	public ArrayList<Color> getListaColores() {
		return historialColoresUsados;
	}
}
