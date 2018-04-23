package test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

import modelo.Colores;
import modelo.Historial;

class HistorialTest {

	Historial historial = new Historial();
	@Test
	void testBuscarCoincidencias() {
		
		ArrayList<Colores> conCoincidencia=new ArrayList<>();
		ArrayList<Colores> sinCoincidencia=new ArrayList<>();
		
		conCoincidencia.add(Colores.amarillo);
		conCoincidencia.add(Colores.amarillo);
		sinCoincidencia.add(Colores.amarillo);
		sinCoincidencia.add(Colores.rojo);
		
		assertTrue(this.historial.buscarCoincidencias(Colores.amarillo, conCoincidencia));
		assertFalse(this.historial.buscarCoincidencias(Colores.amarillo, sinCoincidencia));
	}

}
