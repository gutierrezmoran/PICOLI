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
				((AbstractCollection<Color>) colecciones.get(i)).add(Color.BLACK);
			}
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println("PROBANDO SI COLECCION " + i);
			
			System.out.println("	* esta llena");
			assertTrue(this.instancia.isColeccionLlena(colecciones.get(i), limiteBajo));
			System.out.println("	* esta al limite");
			assertTrue(this.instancia.isColeccionLlena(colecciones.get(i), limiteIgual));
			System.out.println("	* esta sobrante");
			assertFalse(this.instancia.isColeccionLlena(colecciones.get(i), limiteAlto));
		}

	}
	
	@Test
	void testIsColoresIgualesContiguos() {
		ArrayList<Color> coloresContiguos = new ArrayList<>();
		ArrayList<Color> coloresNoContiguos = new ArrayList<>();
		
		for (int i = 0; i < 2; i++) {
			coloresContiguos.add(Color.BLACK);
			coloresContiguos.add(Color.red);
			coloresContiguos.add(Color.BLACK);
			coloresNoContiguos.add(Color.BLACK);
			coloresNoContiguos.add(Color.RED);
		}
		
		assertTrue(this.instancia.isColoresIgualesContiguos(coloresContiguos));
		assertFalse(this.instancia.isColoresIgualesContiguos(coloresNoContiguos));
	}

}
