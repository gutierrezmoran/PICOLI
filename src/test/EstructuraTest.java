package test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Stack;
import org.junit.jupiter.api.Test;
import modelo.Colores;
import modelo.Estructura;
import utiles.Constantes;

class EstructuraTest {

	Estructura estructura = new Estructura();

	@Test
	void testInicializarCola() {
		estructura.inicializarCola();
		assertEquals(estructura.getCola().getCola().size(), Constantes.TAMANO_COLA);
	}

	@Test
	void testIsColeccionLlena() {

		final int limiteAlto = 20;
		final int limiteBajo = 2;
		final int limiteIgual = 5;

		ArrayList<AbstractCollection<Colores>> colecciones = new ArrayList<>();

		colecciones.add(new ArrayDeque<Colores>());
		colecciones.add(new Stack<Colores>());
		colecciones.add(new ArrayList<Colores>());

		for (int i = 0; i < colecciones.size(); i++) {
			for (int j = 0; j < 5; j++) {
				((AbstractCollection<Colores>) colecciones.get(i)).add(Colores.amarillo);
			}
		}

		for (int i = 0; i < 3; i++) {
			System.out.println("PROBANDO SI COLECCION " + i);

			System.out.println("	* esta llena");
			assertTrue(Estructura.isColeccionLlena(colecciones.get(i), limiteBajo));
			System.out.println("	* esta al limite");
			assertTrue(Estructura.isColeccionLlena(colecciones.get(i), limiteIgual));
			System.out.println("	* esta sobrante");
			assertFalse(Estructura.isColeccionLlena(colecciones.get(i), limiteAlto));
		}

	}

	@Test
	void testIsColoresIgualesContiguos() {
		ArrayList<Colores> coloresContiguos = new ArrayList<>();
		ArrayList<Colores> coloresNoContiguos = new ArrayList<>();

		for (int i = 0; i < 2; i++) {
			coloresContiguos.add(Colores.amarillo);
			coloresContiguos.add(Colores.azul);
			coloresContiguos.add(Colores.amarillo);
			coloresNoContiguos.add(Colores.naranja);
			coloresNoContiguos.add(Colores.rojo);
		}

		assertTrue(Estructura.isColoresIgualesContiguos(coloresContiguos));
		assertFalse(Estructura.isColoresIgualesContiguos(coloresNoContiguos));
	}

	@Test
	void testIsMonedasGanadoras() {
		int[] monedas = { Constantes.CANTIDAD_MAX_MONEDAS, Constantes.CANTIDAD_MAX_MONEDAS + 1,
				Constantes.CANTIDAD_MAX_MONEDAS - 1 };
		boolean[] respuestas = { true, true, false };

		for (int i = 0; i < respuestas.length; i++) {
			System.out.println("Probando cantidad de monedas numero: " + i);
			assertEquals(respuestas[i], Estructura.isMonedasGanadoras(monedas[i]));
		}
	}

}
