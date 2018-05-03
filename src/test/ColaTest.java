package test;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import modelo.Cola;

class ColaTest {
	
	Cola cola = new Cola();

	@Test
	void testEncolar() {
		cola.encolar(Color.BLACK);
		
		assert(!cola.getCola().isEmpty());
	}

	@Test
	void testDesencolar() {
		cola.encolar(Color.BLACK);
		cola.desencolar();
		assert(cola.getCola().isEmpty());
	}

}
