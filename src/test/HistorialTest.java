package test;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import modelo.Historial;
import utiles.Constantes;

class HistorialTest {

	Historial historial = new Historial();

	@Test
	void testBuscarCoincidencias() {

		
	}

	@Test
	void testSustituirColor() {

		final int HISTORICO_CASI_LLENO = Constantes.TAMANO_HISTORICO - 1;

		for (int i = 0; i < HISTORICO_CASI_LLENO; i++) {
			historial.getListaColores().add(Color.YELLOW);
		}

		historial.actualizarHistorial(Color.BLUE);
		assert (historial.getListaColores().get(historial.getListaColores().size()-1).equals(Color.BLUE));
		historial.actualizarHistorial(Color.GREEN);
		assert (historial.getListaColores().get(0).equals(Color.YELLOW)
				&& historial.getListaColores().get(historial.getListaColores().size()-1).equals(Color.GREEN));
	}

}
