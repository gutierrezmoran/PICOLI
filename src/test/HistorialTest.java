package test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

import modelo.Colores;
import modelo.Historial;
import utiles.Constantes;

class HistorialTest {

	Historial historial = new Historial();

	@Test
	void testBuscarCoincidencias() {

		ArrayList<Colores> conCoincidencia = new ArrayList<>();
		ArrayList<Colores> sinCoincidencia = new ArrayList<>();

		conCoincidencia.add(Colores.amarillo);
		conCoincidencia.add(Colores.amarillo);
		sinCoincidencia.add(Colores.amarillo);
		sinCoincidencia.add(Colores.rojo);

		assertTrue(this.historial.buscarCoincidencias(Colores.amarillo, conCoincidencia));
		assertFalse(this.historial.buscarCoincidencias(Colores.amarillo, sinCoincidencia));
	}

	@Test
	void testSustituirColor() {

		final int HISTORICO_CASI_LLENO = Constantes.TAMANO_HISTORICO - 1;

		for (int i = 0; i < HISTORICO_CASI_LLENO; i++) {
			historial.getListaColores().add(Colores.amarillo);
		}

		historial.sustituirColor(Colores.azul);
		assert (historial.getListaColores().get(historial.getListaColores().size()-1).equals(Colores.azul));
		historial.sustituirColor(Colores.verde);
		assert (historial.getListaColores().get(0).equals(Colores.amarillo)
				&& historial.getListaColores().get(historial.getListaColores().size()-1).equals(Colores.verde));
	}

}
