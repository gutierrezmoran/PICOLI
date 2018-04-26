package test;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import modelo.HistorialColores;
import utiles.Constantes;

class HistorialTest {

	HistorialColores historial = new HistorialColores();

	@Test
	void testBuscarCoincidencias() {

		
	}

	@Test
	void testSustituirColor() {

		final int HISTORICO_CASI_LLENO = Constantes.TAMANO_HISTORICO - 1;

		for (int i = 0; i < HISTORICO_CASI_LLENO; i++) {
			historial.getHistorial().add(Color.YELLOW);
		}

		historial.actualizar(Color.BLUE);
		assert (historial.getHistorial().get(historial.getHistorial().size()-1).equals(Color.BLUE));
		historial.actualizar(Color.GREEN);
		assert (historial.getHistorial().get(0).equals(Color.YELLOW)
				&& historial.getHistorial().get(historial.getHistorial().size()-1).equals(Color.GREEN));
	}

}
