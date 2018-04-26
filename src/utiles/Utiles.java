package utiles;

import java.awt.Color;
import modelo.Colores;

public class Utiles {

	public static int generarNumeroAleatorio(int min, int max) {
		return (int) (Math.random() * (max - min)) + min;
	}
	
	public static Color obtenerColorAleatorio(int min, int max) {
		return Colores.getElement(Utiles.generarNumeroAleatorio(min, max));
	}
}
