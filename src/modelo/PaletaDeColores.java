package modelo;

import java.awt.Color;
import java.util.ArrayList;
import utiles.Constantes;
import utiles.Utiles;

public class PaletaDeColores {

	private HistorialColores historialColores;
	private ArrayList<Color> paletaDeColores;

	public PaletaDeColores(HistorialColores historialColores) {
		this.historialColores = historialColores;
		this.paletaDeColores = new ArrayList<>();
	}

	private boolean isValido(Color color) {
		return !this.historialColores.isRepetido(color) && !isRepetido(color);
	}

	private void generar() {
		boolean agregado;
		for (int i = 0; i < Constantes.CANTIDAD_COLORES_SELECCION; i++) {
			agregado = false;
			do {
				Color color = Utiles.obtenerColorAleatorio(0, Constantes.PETICION_COLOR_MAX);
				if (isValido(color)) {
					agregar(color);
					agregado = true;
				}
			} while (!agregado);
		}
	}
	
	public void limpiar() {
		this.paletaDeColores.clear();
	}

	public void renovar() {
		limpiar();
		generar();
	}

	public boolean isRepetido(Color color) {
		for (Color colores : this.paletaDeColores) {
			if (colores == color) {
				return true;
			}
		}

		return false;
	}

	public void agregar(Color color) {
		this.paletaDeColores.add(color);
	}

	public ArrayList<Color> getPaletaDeColores() {
		return paletaDeColores;
	}
}