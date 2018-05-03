package test;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Stack;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import modelo.Estructura;
import utiles.Constantes;

class EstructuraTest {

	Estructura estructura = new Estructura();

	@Test
	void testInicializarCola() {
		assertEquals(Constantes.TAMANO_COLA, estructura.getCola().getCola().size());
	}

	@Ignore
	/*
	 * Hay que revisar este test
	 */
	void testRealizarJugada() {
		estructura.realizarJugada(Color.YELLOW);
		
		for (int i = 0; i < 4; i++) {
			estructura.getPilas().get(0).getPila().add(Color.YELLOW);
			estructura.getPilas().get(1).getPila().add(Color.YELLOW);
		}

		estructura.realizarJugada(Color.BLUE);
		assert(!estructura.getLista().getLista().isEmpty());
	}

	@Test
	void testIsColeccionLlena() {

		final int limiteAlto = 20;
		final int limiteBajo = 2;
		final int limiteIgual = 5;

		ArrayList<AbstractCollection<Color>> colecciones = new ArrayList<>();

		colecciones.add(new ArrayDeque<Color>());
		colecciones.add(new Stack<Color>());
		colecciones.add(new ArrayList<Color>());

		for (int i = 0; i < colecciones.size(); i++) {
			for (int j = 0; j < 5; j++) {
				((AbstractCollection<Color>) colecciones.get(i)).add(Color.YELLOW);
			}
		}

		for (int i = 0; i < 3; i++) {
			System.out.println("PROBANDO SI COLECCION " + i);
			System.out.println("	* esta llena");
			assertTrue(this.estructura.isColeccionLlena(colecciones.get(i), limiteBajo));
			System.out.println("	* esta al limite");
			assertTrue(this.estructura.isColeccionLlena(colecciones.get(i), limiteIgual));
			System.out.println("	* esta sobrante");
			assertFalse(this.estructura.isColeccionLlena(colecciones.get(i), limiteAlto));
		}

	}

}
