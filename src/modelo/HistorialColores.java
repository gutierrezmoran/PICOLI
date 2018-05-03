package modelo;

import java.awt.Color;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import utiles.Constantes;

public class HistorialColores {

	private ArrayList<Color> historial;

	public HistorialColores() {
		this.historial = new ArrayList<>();
	}
	
	private void sustituir(Color color) {
		assert color != null : "El color es nulo";
		
		this.historial.remove(0);
		this.historial.add(color);
	}

	private void agregar(Color color) {
		assert color != null : "El color es nulo";
		
		this.historial.add(color);
	}

	public void actualizar(Color color) {
		assert color != null : "El color es nulo";
		
		if (isCompleto()) {
			sustituir(color);
		} else {
			agregar(color);
		}
	}
	
	public void limpiar() {
		this.historial.clear();
	}

	public boolean isCompleto() {
		return historial.size() >= Constantes.TAMANO_HISTORICO;
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

	public ArrayList<Color> getHistorial() {
		return historial;
	}
	
	@Test
	void testSustituir() {
		for (int i = 0; i < Constantes.TAMANO_HISTORICO; i++) {
			this.historial.add(Color.YELLOW);
		}

		sustituir(Color.BLUE);
		assert (this.historial.get(this.historial.size()-1).equals(Color.BLUE));
	}
	
	@Test
	void testAgregar() {
		agregar(Color.BLUE);
		assert(this.historial.get(0).equals(Color.BLUE));
	}
}