package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;

import org.junit.jupiter.api.Test;

import modelo.Colores;
import modelo.Estructura;
import utiles.Constantes;

class EstructuraTest {

	@Test
	void testInicializarCola() {
		Estructura estructura = new Estructura();

		estructura.inicializarCola();
		assertEquals(estructura.getCola().getCola().size(), Constantes.TAMANO_COLA);

	}

}
