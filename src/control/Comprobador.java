package control;

import java.awt.Color;
import java.util.AbstractCollection;

public class Comprobador {

	private static Comprobador comprobador;

	private Comprobador() {
	}

	public static Comprobador getInstance() {
		if (comprobador == null) {
			comprobador = new Comprobador();
		}

		return comprobador;
	}
	
	public boolean isColeccionLlena(Object coleccion, int limite) {
		if (((AbstractCollection) coleccion).size() >= limite) {
			return true;
		}
		
		return false;
	}
	
	public boolean comprobarColoresContiguos(Object coleccion) {
		return false;
	}
	
	public boolean comprobarColoresIguales(Color color1, Color color2) {
		if (color1 == color2) {
			return true;
		}
		
		return false;
	}

}
