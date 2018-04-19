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
		Estructura estructura= new Estructura();
		Colores amarillo=Colores.amarillo;
		Colores rojo=Colores.rojo;
		Colores verde=Colores.verde;
		Colores azul=Colores.azul;
		Colores naranja=Colores.naranja;
	
		
		estructura.inicializarCola();
		assertFalse(estructura.getCola().getCola().isEmpty());
		assertEquals(estructura.getCola().getCola().size(),Constantes.TAMANO_COLA);
		assertTrue(estructura.getCola().getCola().contains(amarillo)||
					estructura.getCola().getCola().contains(rojo)||
					estructura.getCola().getCola().contains(naranja)||
					estructura.getCola().getCola().contains(azul)||
					estructura.getCola().getCola().contains(verde));
		
	
	}

}
