package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sun.javafx.webkit.UtilitiesImpl;

import utiles.Utiles;

class UtilesTest {

	@Test
	void testGenerarNumeroAleatorio() {
		int max = 10;
		int min = 5;

		for (int i = 0; i < 200; i++) {
			assertTrue(Utiles.generarNumeroAleatorio(min, max) >= min);
			assertTrue(Utiles.generarNumeroAleatorio(min, max) <= max);
		}

	}

}
