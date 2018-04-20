package test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Stack;
import org.junit.jupiter.api.Test;
import control.Comprobador;
import modelo.Colores;

class ComprobadorTest {
	
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
			assertTrue(Comprobador.isColeccionLlena(colecciones.get(i), limiteBajo));
			System.out.println("	* esta al limite");
			assertTrue(Comprobador.isColeccionLlena(colecciones.get(i), limiteIgual));
			System.out.println("	* esta sobrante");
			assertFalse(Comprobador.isColeccionLlena(colecciones.get(i), limiteAlto));
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
		
		assertTrue(Comprobador.isColoresIgualesContiguos(coloresContiguos));
		assertFalse(Comprobador.isColoresIgualesContiguos(coloresNoContiguos));
	}

}
