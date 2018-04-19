package test;

import static org.junit.jupiter.api.Assertions.*;
import java.awt.Color;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Stack;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import control.Comprobador;

class ComprobadorTest {
	
	Comprobador instancia = Comprobador.getInstance();

	@Test
	void testComprobarColoresIguales() {

		Color[] colores = {Color.BLACK, Color.BLUE};
		
		assertTrue(instancia.comprobarColoresIguales(colores[0], colores[0]));
		assertFalse(instancia.comprobarColoresIguales(colores[0], colores[1]));
		
	}
	
	@Test
	void testIsColeccionLlena() {
		
		final int limiteAlto = 20;
		final int limiteBajo = 2;
		final int limiteIgual = 5;
		
		ArrayList<Object> colecciones = new ArrayList<>();
		
		colecciones.add(new ArrayDeque<Color>());
		colecciones.add(new Stack<Color>());
		colecciones.add(new ArrayList<Color>());
		
		for (int i = 0; i < colecciones.size(); i++) {
			for (int j = 0; j < 5; j++) {
				((AbstractCollection) colecciones.get(i)).add(Color.BLACK);
			}
		}
		
		for (int i = 0; i < 3; i++) {
			assertTrue(this.instancia.isColeccionLlena(colecciones.get(i), limiteBajo));
			assertTrue(this.instancia.isColeccionLlena(colecciones.get(i), limiteIgual));
			assertFalse(this.instancia.isColeccionLlena(colecciones.get(i), limiteAlto));
		}

	}

}
