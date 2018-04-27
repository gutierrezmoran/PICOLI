package modelo;

import java.awt.Color;
import java.util.ArrayList;
import utiles.Constantes;

public class HistorialColores {

	private ArrayList<Color> historial;

	private void sustituir(Color color) {
		assert color != null : "El color es nulo";
		
		historial.remove(0);
		historial.add(color);
	}

	private void agregar(Color color) {
		assert color != null : "El color es nulo";
		
		historial.add(color);
	}
	
	public void limpiar() {
		this.historial.clear();
	}

	public HistorialColores() {
		this.historial = new ArrayList<>();
	}

	public boolean isRepetido(Color color) {
		assert color != null : "El color es nulo";
		
		int coincidencias = 0;
		for (Color colores : this.historial) {
			if (colores == color) {
				coincidencias++;
			}
		}
		return coincidencias >= 2;
	}

	public void actualizar(Color color) {
		assert color != null : "El color es nulo";
		
		if (isCompleto()) {
			sustituir(color);
		} else {
			agregar(color);
		}
	}

	public boolean isCompleto() {
		return historial.size() >= Constantes.TAMANO_HISTORICO;
	}

	public ArrayList<Color> getHistorial() {
		return historial;
	}
}